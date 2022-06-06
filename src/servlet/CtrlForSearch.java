package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Search;
import model.SearchLogic;

/**
 * Servlet implementation class CtrlForSearch
 */
@WebServlet("/CtrlForSearch")
public class CtrlForSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CtrlForSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//フォワード先
		String forward = "";

		//リクエスト取得
		//エリア取得
		String[] checkedAreas = request.getParameterValues("area");
		int[] areas=new int[checkedAreas.length];
		for(int i=0;i<checkedAreas.length;i++) {
			areas[i]=Integer.parseInt(checkedAreas[i]);
		}

		//施設取得
		String[] checkedFacilities=request.getParameterValues("facility");
		int[] facilities =new int[checkedFacilities.length];
		for(int i=0;i<checkedFacilities.length;i++) {
			facilities[i]=Integer.parseInt(checkedFacilities[i]);
		}

		//オブジェクト生成
		SearchLogic searchLogic = new SearchLogic();

		List<Search> searchList=new ArrayList<>();

		//検索結果を読み込み
		//エリアIDのみの検索の場合
			 searchList= searchLogic.getSearchList(areas);
		//施設IDのみの検索の場合
			 //searchList=searchLogic.getSearchList(facilities);
		//エリアIDと施設IDを使った検索の場合

		if (searchList != null) {
			//リクエストスコープに結果を保存
			request.setAttribute("searchList", searchList);
		}

		//検索画面に表示
		//forward = "/WEB-INF/jsp/front/search.jsp";
		//テスト画面に移動
		forward = "/WEB-INF/jsp/front/sample.jsp";

		//テスト用：チェックボタンの値を取得しているのか確認。
		//		response.setContentType("text/html; charset=UTF-8");
		//        PrintWriter out = response.getWriter();
		//        out.println("<html><head></head><body>");
		//        out.print("<p>チェックした値は");
		//        for (String area : checkedAreas) {
		//            out.print("[" + area + "]");
		//        }
		//        out.println("です。</p>");
		//        out.println("</body></html>");
		RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}