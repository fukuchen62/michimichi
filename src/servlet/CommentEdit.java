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

import beans.CommentBs;
import beans.LoginUser;
import model.CommentListLogic;

/**
 * Servlet implementation class FeatureEdit
 */
@WebServlet("/CommentEdit")
public class CommentEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommentEdit() {
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
		int comment_id = 0;
		int show_flag = 0; //1=表示項目のみ 0=全抽出
		int fnc = 0;

		//リクエストパラメータを取得する
		String str = null;
		str = request.getParameter("comment_id");
		if (str != null) {
			comment_id = Integer.parseInt(str);
		}
		str = request.getParameter("fnc");
		if (str != null) {
			fnc = Integer.parseInt(str);
		}
		str = request.getParameter("showflag");
		if (str != null) {
			show_flag = Integer.parseInt(str);
		}

		//CommentListLogicのオブジェクトを生成
		CommentListLogic logic = new CommentListLogic();

		if (fnc == 1) {

		} else if (fnc == 4) {
			//特集記事の表示状態を変更
			String errmsg = "";
			boolean bret = logic.updateComment(comment_id, show_flag);


			if (bret != true) {
				errmsg += "記事の表示状態を変更するにエラーが発生しました。";
			} else {
				//コメントIDから道の駅のIDを取得
				CommentBs comment = logic.getCommentById(comment_id);
				int station_id = comment.getMichinoeki_id();

				//	道の駅IDによる全コメントを読み込み
				List<CommentBs> AdminCommentList = logic.getAdminCommentList(station_id);

				//	リクエストスコープにFeatureListを保存する
				if (AdminCommentList != null) {
					System.out.println("station_id:" + station_id);
					request.setAttribute("AdminCommentList", AdminCommentList);
				} else {
					errmsg += "<br>記事一覧を読み込むにエラーが発生しました。";
					request.setAttribute("errorMsg", errmsg);
				}
				//	コメント一覧画面へ移動

				forward = "/WEB-INF/jsp/cms/comment_edit.jsp";

			}
		} else {
			//	編集or一覧表示
			if (comment_id > 0) {



			} else {
			}
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);
	}



}
