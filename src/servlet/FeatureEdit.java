package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Feature;
import beans.LoginUser;
import model.FeatureListLogic;

/**
 * Servlet implementation class FeatureEdit
 */
@WebServlet("/FeatureEdit")
public class FeatureEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FeatureEdit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("FeatureEdit doGet");

		//ログインの状態をチェックする
		HttpSession session = request.getSession();
		LoginUser loginUser = (LoginUser) session.getAttribute("loginUser");

		if (loginUser == null) {
			//ログイン画面へリダイレクト
			response.sendRedirect("/michimichi/CtrlForCms");
		}

		String forward = "";
		int feature_id = 0;
		int show_flag = 0; //1=表示項目のみ 0=全抽出
		int fnc = 0;

		//リクエストパラメータを取得する
		String str = null;
		str = request.getParameter("feature_id");
		if (str != null) {
			feature_id = Integer.parseInt(str);
		}
		str = request.getParameter("fnc");
		if (str != null) {
			fnc = Integer.parseInt(str);
		}
		str = request.getParameter("show_flag");
		if (str != null) {
			show_flag = Integer.parseInt(str);
		}

		System.out.println("feature_id:" + feature_id);

		//FeatureListLogicのオブジェクトを生成
		FeatureListLogic featureListLogic = new FeatureListLogic();

		if (fnc == 1) {
			//記事の新規登録画面に移動
			forward = "/WEB-INF/jsp/cms/feature_edit.jsp";

		} else if (fnc == 4) {
			//特集記事の表示状態を変更
			String errmsg = "";
			boolean bret = featureListLogic.updateFeature(feature_id, show_flag);
			if (bret != true) {
				errmsg += "記事の表示状態を変更するにエラーが発生しました。";
			} else {
				//	全記事を読み込み
				List<Feature> featureList = featureListLogic.getFeatureList(1);
				//	リクエストスコープにFeatureListを保存する
				if (featureList != null) {
					request.setAttribute("featureList", featureList);
				} else {
					errmsg += "<br>記事一覧を読み込むにエラーが発生しました。";
					request.setAttribute("errorMsg", errmsg);
				}
				//	記事一覧画面へ移動
				forward = "/WEB-INF/jsp/cms/feature_list.jsp";

			}
		} else {
			//	編集or一覧表示
			if (feature_id > 0) {

				System.out.println("FeatureEdit feature_id:"+feature_id);

				//メニュー編集
				//指定したfeature_idで該当特集を読み込む
				Feature feature = featureListLogic.getFeatureById(feature_id);

				if (feature != null) {
					request.setAttribute("feature", feature);

				} else {
					request.setAttribute("errorMsg", "記事の読み込み中にエラーが発生しました。");
				}
				//編集画面に移動
				forward = "/WEB-INF/jsp/cms/feature_edit.jsp";

			} else {
				//データを読み込む処理
				if (feature_id > 0) {
					//指定したfeature_idで該当記事を読み込む
					Feature feature = featureListLogic.getFeatureById(feature_id);

					if (feature != null) {
						request.setAttribute("feature", feature);
					} else {
						request.setAttribute("errorMsg", "記事を読み込むにエラーが発生しました。");
					}
					//編集画面に移動
					forward = "/WEB-INF/jsp/cms/feature_edit.jsp";
				} else if (feature_id == 0) {

					//全記事を読み込み
					List<Feature> featureList = featureListLogic.getFeatureList(1);

					//リクエストスコープにfeatureListを保存する
					if (featureList != null) {
						request.setAttribute("featureList", featureList);
					} else {
						request.setAttribute("errorMsg", "記事一覧の読み込みにエラーが発生しました。");
					}
					//記事一覧画面へ移動
					forward = "/WEB-INF/jsp/cms/feature_list.jsp";
				}
			}

			RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
			dispatcher.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ログインの状態をチェックする
		HttpSession session = request.getSession();
		LoginUser loginUser = (LoginUser) session.getAttribute("loginUser");

		if (loginUser == null) {
			//ログイン画面へリダイレクト
			response.sendRedirect("/michimichi/CtrlForCms");
		}

		String str;
		int fnc = 0; //操作キー　0=なし　1=新規　2=更新　3=削除
		int feature_id = 0; //menu_id　0=指定なし　Null=新規　>0　更新
		String forward = "";
		int showflag = 0; //1=表示項目のみ　0=全抽出

		str = request.getParameter("fnc");
		if (str != null) {
			fnc = Integer.parseInt(str);
		}
		str = request.getParameter("feature_id");
		if (str != null) {
			feature_id = Integer.parseInt(str);
		}
		str = request.getParameter("showflag");
		if (str != null) {
			showflag = Integer.parseInt(str);
		}

		FeatureListLogic featureListLogic = new FeatureListLogic();
		Feature feature;

		//入力されたデータを取得してfeatureListに代入する
		String feature_name = request.getParameter("feature_name");
		int feature_type_id = IntegerParseInt(request.getParameter("feature_id"));
		String main_photo_path = request.getParameter("main_photo_path");
		String alt = request.getParameter("alt");
		String feature_list = request.getParameter("feature_list");
		String content = request.getParameter("content");
		String content_css = request.getParameter("content_css");
		int show_flag = Integer.parseInt(request.getParameter("show_flag"));

		//現時点のシステム日時を取得して、作成日時に代入
		Date update_time = new Date();
		Date create_time = new Date();
		Date delete_time = new Date();

		//loginUserインスタンスから作成者の情報を取得して代入
		int create_user_id = loginUser.getUser_id();
		int update_user_id = loginUser.getUser_id();
		int delete_user_id = loginUser.getUser_id();

		String name = loginUser.getName();

		feature = new Feature(
				feature_id,
				feature_name,
				feature_type_id,
				main_photo_path,
				alt,
				feature_list,
				content,
				content_css,
				name,
				show_flag,
				create_user_id,
				create_time,
				delete_user_id,
				delete_time,
				update_user_id,
				update_time);

		//新規記事挿入
		if (fnc == 1) {

			//データベースに挿入する
			boolean bret = FeatureListLogic.createFeatureList(feature);
			if (bret == false) {
				request.setAttribute("errorMsg", "メニューの新規挿入にエラーが発生しました");
				request.setAttribute("feature", feature);
				forward = "/WEB-INF/jsp/cms/feature_edit.jsp";

			} else {
				//データベースからすべての記事を読み込む
				List<Feature> adminfeaturelist = featureListLogic.getAdminFeatureList();
				request.setAttribute("adminfeaturelist", adminfeaturelist);
				forward = "/WEB-INF/jsp/cms/feature_list.jsp";
			}

			//更新
		} else if (fnc == 2) {

			//データベースに挿入する
			boolean bret = FeatureListLogic.updateFeature(feature);
			if (bret == false) {
				request.setAttribute("errorMsg", "更新エラーが発生しました");
				request.setAttribute("feature", feature);
				forward = "/WEB-INF/jsp/cms/feature_edit.jsp";

			} else {
				//データベースからすべての記事を読み込む
				List<Feature> adminfeaturelist = featureListLogic.getAdminFeatureList();
				request.setAttribute("adminfeaturelist", adminfeaturelist);
				forward = "/WEB-INF/jsp/cms/feature_list.jsp";
			}

			//削除
		} else if (fnc == 3) {

			if (feature_id > 0) {
				//指定したidで該当記事を読み込む
				boolean bret = featureListLogic.deleteFeatureList(feature_id);

				if (bret == false) {
					request.setAttribute("errorMsg", "削除時にエラーが発生しました。");
					//該当データを読み込む
					feature = featureListLogic.getFeatureById(feature_id);
					request.setAttribute("feature", feature);
					forward = "/WEB-INF/jsp/cms/feature_edit.jsp";
				} else {
					//データベースからすべての特集を読み込む
					List<Feature> featureList = featureListLogic.getFeatureList(showflag);
					request.setAttribute("featureList", featureList);
					forward = "/WEB-INF/jsp/cms/feature_list.jsp";
				}
			}
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);

	}

	private int IntegerParseInt(String parameter) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	/**
	 * 文字列を日付に変換する
	 * @param strDate
	 * @return
	 */
	public static Date changeDate(String strDate) {
		if (strDate == null || strDate.length() != 10) {
			return null;
		}
		DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		dft.setLenient(false);
		try {
			Date dd = dft.parse(strDate);
			return dd;
		} catch (Exception e) {
			return null;
		}
	}

}
