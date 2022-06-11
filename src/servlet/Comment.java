package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CommentLogic;

/**
 * Servlet implementation class Comment
 */
@WebServlet("/Comment")
public class Comment extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Comment() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost:");

		//**受信処理**
		//リクエストパラメータの文字コードを指定
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		//道の駅ID
		int con_id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String comment = request.getParameter("comment");

		System.out.println("name:"+name);


		// リクエストスコープに保存
		request.setAttribute("con_id", con_id);
		request.setAttribute("name", name);
		request.setAttribute("comment", comment);

		//コメントなどをDBに入力する
		CommentLogic commentLogic = new CommentLogic();
		boolean result = commentLogic.insertComment(con_id,name,comment);

		if(result == false) {

		}else {

		}

		//元ページにリダイレクトする
		response.sendRedirect("CtrlForFront?pge_id=9&con_id=" + con_id);

	}

}
