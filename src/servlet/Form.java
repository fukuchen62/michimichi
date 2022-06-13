package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.FormBs;
import model.SendMail;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			//HttpSessionインスタンスの取得
			HttpSession session = request.getSession();

			FormBs form = new FormBs();

			//**受信処理**
			//リクエストパラメータの文字コードを指定
	        request.setCharacterEncoding("UTF-8");

	        //リクエストパラメータの取得
	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String text = request.getParameter("text");

	        //セッションスコープに保存
	        session.setAttribute("name", name);
	        session.setAttribute("email", email);
	        session.setAttribute("text", text);


            //画面に入力したメールアドレスにメール送信をする
            SendMail sendMail = new SendMail();
            sendMail.send(name, email, text);

            //ご意見承り画面にフォワード
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Opinioncomplete.jsp");
            dispatcher.forward(request, response);

	}

}
