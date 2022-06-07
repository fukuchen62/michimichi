package servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//ログインの状態をチェックする
				HttpSession session = request.getSession();
				LoginUser loginUser = (LoginUser) session.getAttribute("loginUser");

				if(loginUser == null) {
					//ログイン画面へリダイレクト
					response.sendRedirect("/michimichi/CtrlForCms");
				}


				String forward = "";
				int user_id = 0;
				int feature_type_id = 0;
				int showflag = 0;	//1=表示項目のみ　0=全抽出
				int fnc = 0;

				//リクエストパラメータを取得する
				String str = null;
				str = request.getParameter("feature_type_id");
				if(str != null) {
					feature_type_id = Integer.parseInt(str);
				}
				str = request.getParameter("fnc");
				if(str != null) {
					fnc = Integer.parseInt(str);
				}
				str = request.getParameter("showflag");
				if(str != null) {
					showflag = Integer.parseInt(str);
				}

				//FeatureListLogicのオブジェクトを生成
				FeatureListLogic featureListLogic = new FeatureListLogic();

				if(fnc==1) {
					//記事の新規登録画面に移動
					forward = "/WEB-INF/jsp/featureEdit.jsp";

				}else if(fnc==4) {
					//特集記事の表示状態を変更
					String errmsg="";
//					boolean bret = FeatureListLogic.updateFeatureList(feature_type_id, showflag);
//					if(bret != true) {
//						errmsg += "記事の表示状態を変更するにエラーが発生しました。";
					}
					//全記事を読み込み
//					List<FeatureList> featureList = featureList.getAllFeatureList(0);
					//リクエストスコープにpostListを保存する
//					if(featureList != null) {
//						request.setAttribute("featureList", featureList);
//					}else {
//						errmsg += "<br>記事一覧を読み込むにエラーが発生しました。";
//						request.setAttribute("errorMsg",errmsg );
//					}
					//記事一覧画面へ移動
//					forward = "/WEB-INF/jsp/cms/featureList.jsp";

//				}else {
					//編集or一覧表示
					if(feature_type_id > 0) {
						//メニュー編集
						//指定したfeature_type_idで該当特集を読み込む
//						Feature feature = FeatureListLogic.getFeatureListLogicById(feature_type_id);

//						if(feature != null) {
//							request.setAttribute("feature", feature);
						}else {
							request.setAttribute("errorMsg", "記事の読み込み中にエラーが発生しました。");
						}
						//編集画面に移動
						forward = "/WEB-INF/jsp/cms/feature_Edit.jsp";

//					}else if(feature_type_id == 0){
						//記事一覧表示
						//全記事を読み込み
//						List<FeatureList> featureList = FeatureListLogic.getAllFeatureList(showflag);
						//リクエストスコープにpostListを保存する
//						if(featureList != null) {
//							request.setAttribute("featureList", featureList);
//						}else {
//							request.setAttribute("errorMsg", "記事一覧の読み込みにエラーが発生しました。");
//						}
						//記事一覧画面へ移動
						forward = "/WEB-INF/jsp/cms/featureList.jsp";
					}
//				}

//				RequestDispatcher dispatcher =
//						request.getRequestDispatcher(forward);
//				dispatcher.forward(request, response);

//			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ログインの状態をチェックする
				HttpSession session = request.getSession();
				LoginUser loginUser = (LoginUser) session.getAttribute("loginUser");

				if(loginUser == null) {
					//ログイン画面へリダイレクト
					response.sendRedirect("/michimichi/CtrlForCms");
				}

				String str;
				int fnc = 0;		//操作キー　0=なし　1=新規　2=更新　3=削除
				int feature_type_id = 0;	//menu_id　0=指定なし　Null=新規　>0　更新
				String forward = "";
				int showflag = 0;	//1=表示項目のみ　0=全抽出

				str = request.getParameter("fnc");
				if(str != null) {
					fnc = Integer.parseInt(str);
				}
				str = request.getParameter("feature_type_id");
				if(str != null) {
					feature_type_id = Integer.parseInt(str);
				}
				str = request.getParameter("showflag");
				if(str != null) {
					showflag = Integer.parseInt(str);
				}

				FeatureListLogic featureListLogic = new FeatureListLogic();
				Feature feature;

				//入力されたデータを取得してfeatureListに代入する
				int type = Integer.parseInt(request.getParameter("type"));
				String title = request.getParameter("title");
				String summary = request.getParameter("summary");
				String photo_path1 = request.getParameter("photo_path1");
				String photo_path2 = request.getParameter("photo_path2");
				String photo_path3 = request.getParameter("photo_path3");
				//String img_path4 = request.getParameter("img_path4");
				//int price = Integer.parseInt(request.getParameter("price"));
				int show_flag = Integer.parseInt(request.getParameter("show_flag"));
				//int point = Integer.parseInt(request.getParameter("point"));

				//現時点のシステム日時を取得して、作成日時に代入
				Date createtime = new Date();

				featureListLogic = new FeatureListLogic();

				//debugメッセージ
				//		System.out.println("menu:menu_id "+menu.getMenu_id());
				//		System.out.println("menu:type "+menu.getType());
				//		System.out.println("menu:show_flag "+menu.getShow_flag());

				//新規記事挿入
				if(fnc == 1) {

					//データベースに挿入する
//					boolean bret = FeatureListLogic.createFeatureList(feature);
//					if(bret == false) {
//						request.setAttribute("errorMsg", "メニューの新規挿入にエラーが発生しました");
//						request.setAttribute("feature", feature);
//						forward = "/WEB-INF/jsp/featureEdit.jsp";
//
//					}else {
//						//データベースからすべての記事を読み込む
//						List<Feature> featureList = FeatureListLogic.getAllFeatureList(showflag);
//						request.setAttribute("featureList", featureList);
//						forward = "/WEB-INF/jsp/featureList.jsp";
//					}

					//更新
				}else if(fnc == 2){

					//データベースに挿入する
//					boolean bret = FeatureListLogic.updateFeature(feature);
//					if(bret == false) {
						request.setAttribute("errorMsg", "特集の更新にエラーが発生しました");
//						request.setAttribute("feature", feature);
						forward = "/WEB-INF/jsp/featureEdit.jsp";

					}else {
						//データベースからすべての記事を読み込む
						List<Feature> featureList = FeatureListLogic.getAllFeatureList(showflag);
						request.setAttribute("featureList", featureList);
						forward = "/WEB-INF/jsp/featureList.jsp";
					}

					//削除
//				}else if(fnc == 3){
//
//					if(feature_type_id > 0) {
//						//指定したmenu_idで該当Menuを読み込む
//						boolean bret = featureListLogic.deleteFeature(feature_type_id);
//
//						if(bret == false) {
//							request.setAttribute("errorMsg", "削除時にエラーが発生しました。");
//							//該当データを読み込む
//							feature = featureListLogic.getFeatureListById(feature_type_id);
//まだエラー吐いてるのでコメントアウトrequest.setAttribute("feature", feature);
//							forward = "/WEB-INF/jsp/featureEdit.jsp";
//						}else{
//							//データベースからすべてのメニューを読み込む
//							List<Feature> featureList = FeatureListLogic.getAllFeatureList(showflag);
//							request.setAttribute("featureList", featureList);
//							forward = "/WEB-INF/jsp/featureList.jsp";
//						}
					}
//				}

//				RequestDispatcher dispatcher =
//						request.getRequestDispatcher(forward);
//				dispatcher.forward(request, response);

//			}

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




