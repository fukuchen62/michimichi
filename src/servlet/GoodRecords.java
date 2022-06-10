package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GoodRecordsLogic;

/**
 * Servlet implementation class GoodRecords
 */
@WebServlet("/GoodRecords")
public class GoodRecords extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodRecords() {
        super();
        // TODO Auto-generated constructor stub
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doPost:");

		//**受信処理**
		//リクエストパラメータの文字コードを指定
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		//クライアントIPアドレス
		String ip_id = request.getLocalAddr();

		//道の駅ID
		String para1 = request.getParameter("id");
		int con_id = 0;

		if (para1 != null && para1.length() != 0) {
			con_id = Integer.parseInt(para1);
		}


		// リクエストスコープに保存
		request.setAttribute("ip_id", ip_id);
		request.setAttribute("con_id", con_id);

		System.out.println("ip_id:"+ip_id);
		System.out.println("con_id:"+con_id);

		//**すでに記録あるかチェック**
		//**記録がなければ、書き込む**

		//該当道の駅のイイネにIPアドレスがあるか確認
		GoodRecordsLogic dao = new GoodRecordsLogic();
		int num = dao.getGoodRecordsFindByUser(ip_id,con_id);
		System.out.println("num:"+num);

		GoodRecordsLogic goodRecordsLogic = new GoodRecordsLogic();

		if(num > 0) {
			//IPアドレスが被れば、何もせずに元のページにリダイレクトする
			response.sendRedirect("CtrlForFront?pge_id=9&con_id=" + con_id);
		}else {
				boolean result = goodRecordsLogic.insertGoodRecords(ip_id,con_id);
				System.out.println("result:"+result);
				if(result == false) {

				}else {
//					GoodRecordsBs goodRecordsCount = GoodRecordsLogic.getGoodRecordsCountById(con_id);
//					request.setAttribute("goodRecordsCount", goodRecordsCount);
//					response.sendRedirect("CtrlForFront?pge_id=9&con_id=" + con_id);
				}

				response.sendRedirect("CtrlForFront?pge_id=9&con_id=" + con_id);
		};


	}

}
