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
import model.FeatureListLogic;
import model.LoginLogic;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//リクエストパラメータの取得
		//		request.setCharacterEncoding("UTF-8");

		String login_id = request.getParameter("login_id");
		String password = request.getParameter("password");

		//LoginUserインスタンスの生成
		LoginUser login = new LoginUser(login_id, password);

		//ログイン処理
		LoginLogic loginLogic = new LoginLogic();
		LoginUser loginUser = loginLogic.execute(login);

		HttpSession session = request.getSession();

		String forward = "";
		if (loginUser != null) {

			session.setAttribute("loginUser", loginUser);
//			response.sendRedirect("/michimichi/CtrlForCms?pge_id=13");

			//データベースからすべての記事を読み込む
			FeatureListLogic featureListLogic = new FeatureListLogic();
			List<Feature> featureList = featureListLogic.getAdminFeatureList();

			request.setAttribute("featureList", featureList);

			forward = "/WEB-INF/jsp/cms/adminpage.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
			dispatcher.forward(request, response);

		} else {

			session.removeAttribute("loginUser");

			forward = "/WEB-INF/jsp/cms/login_result.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
			dispatcher.forward(request, response);
		}
	}

}
