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
	    // フォワード先
	    String forwardPath = null;

	    // サーブレットクラスの動作を決定する「action」の値を
	    // リクエストパラメータから取得
	    String action = request.getParameter("action");
	    // 「登録の開始」をリクエストされたときの処理
	    if (action == null) {
	      // フォワード先を設定
	      forwardPath = "/WEB-INF/jsp/front/inquiry.jsp";
	    }

	    // 登録確認画面から「登録実行」をリクエストされたときの処理
	    else if (action.equals("done")) {
	      // セッションスコープに保存された登録ユーザ
	      HttpSession session = request.getSession();
	      FormBs form =(FormBs)session.getAttribute("form");

	      //画面に入力したメールアドレスにメール送信をする
//	      String name=form.getName();
//	      String email=form.getEmail();
//	      String text =form.getText();
//	      SendMail sendMail = new SendMail();
//	      sendMail.send(name, email, text);

	      // 不要となったセッションスコープ内のインスタンスを削除
	      session.removeAttribute("form");

	      // 登録後のフォワード先を設定
	      forwardPath = "/WEB-INF/jsp/front/inquiry_result.jsp";
	    }

	    // 設定されたフォワード先にフォワード
	    RequestDispatcher dispatcher =
	        request.getRequestDispatcher(forwardPath);
	    dispatcher.forward(request, response);
	  }
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			//HttpSessionインスタンスの取得
			HttpSession session = request.getSession();


			//**受信処理**
			//リクエストパラメータの文字コードを指定
	        request.setCharacterEncoding("UTF-8");

	        //リクエストパラメータの取得
	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String text = request.getParameter("text");

	        //登録する投稿内容を設定
			FormBs form = new FormBs();

	        //入力値をFormに追加
	        form.setEmail(email);
	        form.setName(name);
	        form.setText(text);

	        //formをセッションスコープに保存
	        session.setAttribute("form", form);


            //確認画面にフォワード
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/front/inquiry_confirm.jsp");
            dispatcher.forward(request, response);

	}

}
