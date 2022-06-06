package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Feature;
import beans.FeatureList;
import beans.Station;
import model.FeatureListLogic;
import model.FeatureLogic;
import model.StationListLogic;

/**
 * Servlet implementation class CtrlForFront
 */
@WebServlet("/CtrlForFront")
public class CtrlForFront extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public CtrlForFront() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストパラメータを取得する
		//ページ番号
		String para1 = request.getParameter("pge_id");
		String forward = "";
		int pge_id = 0;

		//入力値チェック
		if (para1 != null && para1.length() != 0) {
			pge_id = Integer.parseInt(para1);
		}

		// リクエストスコープに保存
		request.setAttribute("pge_id", pge_id);

		//リクエストスコープに各ページ用情報保存、フォワード先を設定
		if (pge_id == 1) {
			//トップページ
			forward = movetoTop(request);
		} else if (pge_id == 2) {
			//カテゴリー検索ページ
			forward = movetoSearch(request);
		} else if (pge_id == 3) {
			//記事一覧ページ
			forward = movetoFeatureTop(request);
		} else if (pge_id == 4) {
			//記事個別ページ
			forward = movetoFeature(request);
		} else if (pge_id == 5) {
			//お問い合わせページ
			forward = movetoInquiry(request);
		} else if (pge_id == 6) {
			//お問い合わせ内容確認ページ
			forward = movetoInquiryConfirm(request);
		} else if (pge_id == 7) {
			//お問い合わせ送信結果ページ
			forward = movetoInquiryResult(request);
		} else if (pge_id == 8) {
			//このHPについてページ
			forward = movetoWhitePaper(request);
		} else if (pge_id == 9) {
			//道の駅個別ページ
			forward = movetoStationTemp(request);
		} else if (pge_id == 10) {
			//管理者ログインページ
			forward = movetoLogin();
		} else {
			//トップページ
			forward = movetoTop(request);
			//System.out.println("forward:" + forward);
		}

		//メイン画面にフォーワード
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);
	}

	//	private String movetoMenu(HttpServletRequest request) {
	//		// TODO 自動生成されたメソッド・スタブ
	//		return null;
	//	}
	//
	//	private String movetoConcept(HttpServletRequest request) {
	//		// TODO 自動生成されたメソッド・スタブ
	//		return null;
	//	}

	/**
	 * トップページフォワード前処理
	 *
	 * @return フォワード用パス
	 */
	//TOPページ
	private String movetoTop(HttpServletRequest request) {
		//一覧に表示するものだけ
		final int SHOWFALG = 1;

		// 検索sectionの道の駅個別リンクを取得する
		StationListLogic stationListLogic = new StationListLogic();
		List<Station> TSList = stationListLogic.getAllTopStaionList(SHOWFALG);

			// リクエストスコープに保存
			request.setAttribute("TSList", TSList);

		// 特集記事一覧を取得する
		FeatureListLogic featureListLogic = new FeatureListLogic();
		List<Feature> TLList = featureListLogic.getAllTopFeature(SHOWFALG);

			// リクエストスコープに保存
			request.setAttribute("TLList", TLList);

		//ランダム表記の制御
		//特集一覧（PC3，SP4）表示画像
		Integer[] featureImg_random = new Integer[2];
		for(int i =0; i<2; i++) {
			int num = (int) (Math.random() * 3) + 1;
			featureImg_random[i] = num;
		}

			// リクエストスコープに保存
			request.setAttribute("featureImg_random", featureImg_random);


		// フォーワード先
		String forward = "WEB-INF/jsp/front/top.jsp";
		return forward;
	}

	//カテゴリー検索ページ
	private String movetoSearch(HttpServletRequest request) {

		// フォーワード先
		String forward = "WEB-INF/jsp/front/search.jsp";
		return forward;

	}

	//特集一覧ページ
	private String movetoFeatureTop(HttpServletRequest request) {
		//一覧に表示するものだけ（DAOへの命令の大元）
		final int SHOWFLAG = 1;

		// 特集記事一覧を取得する
		FeatureListLogic featureListLogic = new FeatureListLogic();
		List<FeatureList> FLList = featureListLogic.getAllFeatureList(SHOWFLAG);

		// リクエストスコープに保存
		request.setAttribute("FLList", FLList);

		// フォーワード先
		String forward = "WEB-INF/jsp/front/feature_top.jsp";
		return forward;

	}

	//特集個別ページ
	private String movetoFeature(HttpServletRequest request) {
		//リクエストパラメータを取得する
		//コンテンツ番号
		String para2 = request.getParameter("con_id");
		String forward = "";
		int con_id = 0;

		//入力値チェック
		if (para2 != null && para2.length() != 0) {
			con_id = Integer.parseInt(para2);
		}

		// リクエストスコープに保存
		request.setAttribute("con_id", con_id);

		//一覧に表示するものだけ（DAOへの命令の大元）
		final int SHOWFALG = 1;
		int CONID = con_id;

		// 特集個別記事の内容を取得する
		FeatureLogic featureLogic = new FeatureLogic();
		List<Feature> FList = featureLogic.getAllFeature(SHOWFALG, CONID);

		// リクエストスコープに保存
		request.setAttribute("FList", FList);

		//titleを保存
		String title = FList.get(0).getFeature_name();

		// リクエストスコープに保存
		request.setAttribute("title", title);

		// フォーワード先
		forward = "WEB-INF/jsp/front/feature.jsp";
		return forward;

	}

	//お問い合わせフォーム
	private String movetoInquiry(HttpServletRequest request) {

		// フォーワード先
		String forward = "WEB-INF/jsp/front/inquiry.jsp";
		return forward;

	}

	//お問い合わせ確認ページ
	private String movetoInquiryConfirm(HttpServletRequest request) {

		// フォーワード先
		String forward = "WEB-INF/jsp/front/inquiry_confirm.jsp";
		return forward;

	}

	//お問い合わせ結果ページ
	private String movetoInquiryResult(HttpServletRequest request) {

		// フォーワード先
		String forward = "WEB-INF/jsp/front/inquiry_result.jsp";
		return forward;

	}

	//このHPについてページ
	private String movetoWhitePaper(HttpServletRequest request) {

		// フォーワード先
		String forward = "WEB-INF/jsp/front/white_paper.jsp";
		return forward;

	}

	//道の駅個別ページ
	private String movetoStationTemp(HttpServletRequest request) {
		String para2 = request.getParameter("con_id");
		String forward = "";
		int con_id = 0;

		//入力値チェック
		if (para2 != null && para2.length() != 0) {
			con_id = Integer.parseInt(para2);
		}

			// リクエストスコープに保存
			request.setAttribute("con_id", con_id);

		//一覧に表示するものだけ（DAOへの命令の大元）
//		final int SHOWFALG = 1;
//		int CONID = con_id;

		 //特集個別記事の内容を取得する
//		StationLogic stationLogic = new StationLogic();
//		List<Station> StationList = stationLogic.getAllStation(SHOWFALG, CONID);

		// リクエストスコープに保存
//		request.setAttribute("StationList", StationList);

		// フォーワード先
		forward = "WEB-INF/jsp/front/station_temp.jsp";
		return forward;

	}

	//管理者ログインページ
	private String movetoLogin() {
		// フォーワード先 "
		String forward = "WEB-INF/jsp/cms/login.jsp";
		return forward;
	}

}
