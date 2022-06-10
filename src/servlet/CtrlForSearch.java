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
		//エリアID
		String[] checkedAreas = null;
		int[] areas;

		//
		String[] checkedFacilities=null;
		int[] facilities;

		//オブジェクト生成
		SearchLogic searchLogic = new SearchLogic();

		List<Search> searchList = new ArrayList<>();

		//エリアIDのみの検索の場合
		if (request.getParameterValues("area") != null && request.getParameterValues("facility") == null) {
			checkedAreas = request.getParameterValues("area");//リクエストからエリアID取得
			areas = new int[checkedAreas.length];
			for (int i = 0; i < checkedAreas.length; i++) {
				areas[i] = Integer.parseInt(checkedAreas[i]);
			}
			//検索結果を読み込み
			searchList = searchLogic.getSearchList(areas);
		}

		//施設IDのみの検索の場合
		if (request.getParameterValues("area") == null && request.getParameterValues("facility") != null) {
			checkedFacilities = request.getParameterValues("facility");//リクエストから施設ID取得
			facilities= new int[checkedFacilities.length];
			for (int i = 0; i < checkedFacilities.length; i++) {
				facilities[i] = Integer.parseInt(checkedFacilities[i]);
			}
			//検索結果を読み込み
			searchList = searchLogic.getSearchList(facilities);
		}

		//エリアIDと施設IDを使った検索の場合
		if (request.getParameterValues("area") != null && request.getParameterValues("facility") != null) {
			checkedAreas = request.getParameterValues("area");//リクエストからエリアID取得
			areas = new int[checkedAreas.length];
			for (int i = 0; i < checkedAreas.length; i++) {
				areas[i] = Integer.parseInt(checkedAreas[i]);
			}

			checkedFacilities = request.getParameterValues("facility");//リクエストから施設ID取得
			facilities= new int[checkedFacilities.length];
			for (int i = 0; i < checkedFacilities.length; i++) {
				facilities[i] = Integer.parseInt(checkedFacilities[i]);
			}

			//検索結果を読み込み
			searchList = searchLogic.getSearchAllList(areas,facilities);
		}
		//エリアIDと施設ID どっちもない場合
		//何もしない

		if (searchList != null) {
			//リクエストスコープに結果を保存
			request.setAttribute("searchList", searchList);
		}

		//検索画面に表示
		forward = "/WEB-INF/jsp/front/search.jsp";

		//テスト画面に移動
		//forward = "/WEB-INF/jsp/front/sample.jsp";

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