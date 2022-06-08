package servlet;

import java.io.IOException;
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
import model.FeatureLogic;

/**
 * Servlet implementation class Main
 */
@WebServlet("/CtrlForCms")
public class CtrlForCms extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CtrlForCms() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ログインしている状態を確認する
		HttpSession session = request.getSession();
		LoginUser loginUser = (LoginUser) session.getAttribute("loginUser");

		//ログインではない状態の場合は、ログイン画面へ
		if (loginUser == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login");
			dispatcher.forward(request, response);
		}

		//リクエストパラメータを取得する
		//ページ番号
		String para1 = request.getParameter("pge_id");
		//そのページのコンテンツ番号
		String para2 = request.getParameter("con_id");
		String forward = "";
		int pge_id = 0;
		int con_id = 0;

		//入力値チェック
		if (para1 != null && para1.length() != 0) {
			pge_id = Integer.parseInt(para1);
		}
		if (para2 != null && para2.length() != 0) {
			con_id = Integer.parseInt(para2);
		}

		// リクエストスコープに保存
		request.setAttribute("pge_id", pge_id);


		//リクエストスコープに各ページ用情報保存、フォワード先を設定
		if (pge_id == 13) {

			forward = movetoAdminpage(request);

		}

		else if (pge_id == 10) {
			forward = movetoLogin(request);
		}

		else if (pge_id == 11) {
			forward = movetoLoginResult(request);
		}

		else if (pge_id == 12) {
			forward = movetoLogout(request);
		}

		else if (pge_id == 14) {
			forward = movetoStationList(request);
		}

		else if (pge_id == 15) {
			forward = movetoStationEdit();
		}

		else if (pge_id == 16) {
			forward = movetoFeatureEdit();
		}

		else if (pge_id == 17) {
			forward = movetoFeatureList(request);
		}

		else if (pge_id == 18) {
			forward = movetoCommentEdit();
		}

		else if (pge_id == 19) {
			forward = movetoCommentList();
		}

		else if (pge_id == 20) {
			forward = movetoAdminList();
		}

		else if (pge_id == 21) {
			forward = movetoAdminEdit();
		}

		else {
			forward = movetoAdminpage(request);
		}

		//メイン画面にフォーワード
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);

	}

	/**
	 * @param comment
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, Object comment)
			throws ServletException, IOException {

		//リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");
		String text = request.getParameter("text");

		//入力値チェック
		if (text != null && text.length() != 0) {

			//セッションスコープに保存されたユーザー情報を取得
			HttpSession session = request.getSession();
			LoginUser loginUser = (LoginUser) session.getAttribute("loginUser");

			//コメントのインスタンスを生成する
//						Comment mutter = new Comment(loginUser.getLogin_id(), text);

			//コメントのインスタンスをテーブルに追加する
//						CommentListLogic CommentListLogic = new CommentListLogic();
//						CommentListLogic.execute(comment);

		} else {
			//エラーメッセージをリクエストスコープに保存
			request.setAttribute("errorMsg", "つぶやきが入力されていません");
		}

		//		コメントリストを取得
		//		CommentListLogic getCommentListLogic = new CommentListLogic();
		//		List<Comment> commentList = CommentListLogic.execute();
		//
		//		//リクエストスコープに保存
		//		request.setAttribute("commentList", comment);

		//トップ画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/front/top.jsp");
		dispatcher.forward(request, response);
	}

	private String movetoAdminpage(HttpServletRequest request) {

		String forward = "WEB-INF/jsp/cms/adminpage.jsp";
		return forward;
	}

	private String movetoLogin(HttpServletRequest request) {

		String forward = "WEB-INF/jsp/cms/login.jsp";
		return forward;
	}

	private String movetoLoginResult(HttpServletRequest request) {
		String forward = "WEB-INF/jsp/cms/login_reult.jsp";
		return forward;
	}

	private String movetoLogout(HttpServletRequest request) {

		String forward = "WEB-INF/jsp/cms/logout.jsp";
		return forward;
	}

	private String movetoStationList(HttpServletRequest request) {
		String forward = "WEB-INF/jsp/cms/station_list.jsp";
		return forward;
	}

	private String movetoStationEdit() {
		String forward = "WEB-INF/jsp/cms/station_edit.jsp";
		return forward;
	}

	private String movetoFeatureEdit() {
		String forward = "WEB-INF/jsp/cms/feature_edit.jsp";
		return forward;
	}

	private String movetoFeatureList(HttpServletRequest request) {
		// 記事一覧を取得する
		FeatureLogic featurelogic = new FeatureLogic();
		List<Feature> FeatureList =  featurelogic.getFeatureList(0);

		//リクエストスコープに保存
		request.setAttribute("FeatureList", FeatureList);

		String forward = "WEB-INF/jsp/cms/feature_list.jsp";
		return forward;
	}

	private String movetoCommentEdit() {
		String forward = "WEB-INF/jsp/cms/comment_edit.jsp";
		return forward;
	}

	private String movetoCommentList() {
		//		//コメントリストを取得
		//		CommentListLogic getCommentListLogic = new CommentListLogic();
		//		List<Comment> commentList = getCommentListLogic.execute();
		//
		//		//リクエストスコープに保存
		//		request.setAttribute("commentList", commentList);


		String forward = "WEB-INF/jsp/cms/comment_list.jsp";
		return forward;
	}

	private String movetoAdminList() {
		String forward = "WEB-INF/jsp/cms/admin_list.jsp";
		return forward;
	}

	private String movetoAdminEdit() {
		String forward = "WEB-INF/jsp/cms/admin_edit.jsp";
		return forward;
	}









	//	private String movetoMutter(HttpServletRequest request) {
	//		コメントリストを取得
	//				CommentListLogic getCommentListLogic = new CommentListLogic();
	//				List<Comment> commentList = getCommentListLogic.execute();
	//
	//リクエストスコープに保存
	//				request.setAttribute("commentList", commentList);
	//
	//	 フォーワード先 "
	//		String forward = "/WEB-INF/jsp/comment.jsp";
	//		return forward;

	//}

	//private String movetofeatureListpage(HttpServletRequest request) {
		// 記事一覧を取得する
		//		FeatureLogic featurelogic = new FeatureLogic();
		//		List<Feature> featureList = featurelogic.getAllfeature(0);

		//リクエストスコープに保存
		//		request.setAttribute("featureList", featurelogic);

		// フォーワード先 "
//		String forward = "/WEB-INF/jsp/adminpage.jsp";
//		return forward;
//	}

}
