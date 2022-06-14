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
		//**受信処理**


		//フォワード先
		String forward = "";
		//エリアID
		String[] checkedAreas = null;
		int[] areas;

		//施設ID
		String[] checkedFacilities=null;
		int[] facilities;

		//選択項目表示用
		List<String> areasList = new ArrayList<String>();
		int areasList_length=0;
		List<String> facilitiesList = new ArrayList<String>();
		int facilitiesList_length=0;
		List<String> aroundList = new ArrayList<String>();
		int aroundList_length=0;

		//オブジェクト生成
		SearchLogic searchLogic = new SearchLogic();

		List<Search> searchList = new ArrayList<>();

		//エリアIDのみの検索の場合
		if (request.getParameterValues("area") != null && request.getParameterValues("facility") == null) {
			checkedAreas = request.getParameterValues("area");//リクエストからエリアID取得
			areas = new int[checkedAreas.length];
			for (int i = 0; i < checkedAreas.length; i++) {
				areas[i] = Integer.parseInt(checkedAreas[i]);
				if(checkedAreas[i].equals("1")) {
					areasList.add("東部 ");
				}else if(checkedAreas[i].equals("2")) {
					areasList.add("西部 ");
				}else if(checkedAreas[i].equals("3")) {
					areasList.add("南部 ");
				}
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
				if(checkedFacilities[i].equals("1")) {
					facilitiesList.add("食事処 ");
				}else if(checkedFacilities[i].equals("2")) {
					facilitiesList.add("ショップ ");
				}else if(checkedFacilities[i].equals("3")) {
					facilitiesList.add("介助犬 ");
				}else if(checkedFacilities[i].equals("4")) {
					facilitiesList.add("Wi-Fi ");
				}else if(checkedFacilities[i].equals("5")) {
					facilitiesList.add("身障者用トイレ ");
				}else if(checkedFacilities[i].equals("6")) {
					facilitiesList.add("おむつ台 ");
				}else if(checkedFacilities[i].equals("7")) {
					facilitiesList.add("身障者用駐車場 ");
				}else if(checkedFacilities[i].equals("8")) {
					facilitiesList.add("ガソリンスタンド ");
				}else if(checkedFacilities[i].equals("9")) {
					facilitiesList.add("EVスタンド ");
				}else if(checkedFacilities[i].equals("10")) {
					facilitiesList.add("観光案内 ");
				}else if(checkedFacilities[i].equals("11")) {
					facilitiesList.add("体験施設 ");
				}else if(checkedFacilities[i].equals("12")) {
					facilitiesList.add("温泉 ");
				}else if(checkedFacilities[i].equals("13")) {
					aroundList.add("コンビニ ");
				}else if(checkedFacilities[i].equals("14")) {
					aroundList.add("ドラッグストア ");
				}else if(checkedFacilities[i].equals("15")) {
					aroundList.add("ガソリンスタンド(周辺) ");
				}else if(checkedFacilities[i].equals("16")) {
					aroundList.add("病院 ");
				}else if(checkedFacilities[i].equals("17")) {
					aroundList.add("最寄り駅/バス停 ");
				}else if(checkedFacilities[i].equals("18")) {
					aroundList.add("温泉(周辺) ");
				}else if(checkedFacilities[i].equals("19")) {
					aroundList.add("宿泊施設 ");
				}
			}
			//検索結果を読み込み
			searchList = searchLogic.getSearchFacilityList(facilities);
		}

		//エリアIDと施設IDを使った検索の場合
		if (request.getParameterValues("area") != null && request.getParameterValues("facility") != null) {
			checkedAreas = request.getParameterValues("area");//リクエストからエリアID取得
			areas = new int[checkedAreas.length];
			for (int i = 0; i < checkedAreas.length; i++) {
				areas[i] = Integer.parseInt(checkedAreas[i]);
				if(checkedAreas[i].equals("1")) {
					areasList.add("東部 ");
				}else if(checkedAreas[i].equals("2")) {
					areasList.add("西部 ");
				}else if(checkedAreas[i].equals("3")) {
					areasList.add("南部 ");
				}
			}

			checkedFacilities = request.getParameterValues("facility");//リクエストから施設ID取得
			facilities= new int[checkedFacilities.length];
			for (int i = 0; i < checkedFacilities.length; i++) {
				facilities[i] = Integer.parseInt(checkedFacilities[i]);
				if(checkedFacilities[i].equals("1")) {
					facilitiesList.add("食事処 ");
				}else if(checkedFacilities[i].equals("2")) {
					facilitiesList.add("ショップ ");
				}else if(checkedFacilities[i].equals("3")) {
					facilitiesList.add("介助犬 ");
				}else if(checkedFacilities[i].equals("4")) {
					facilitiesList.add("Wi-Fi ");
				}else if(checkedFacilities[i].equals("5")) {
					facilitiesList.add("身障者用トイレ ");
				}else if(checkedFacilities[i].equals("6")) {
					facilitiesList.add("おむつ台 ");
				}else if(checkedFacilities[i].equals("7")) {
					facilitiesList.add("身障者用駐車場 ");
				}else if(checkedFacilities[i].equals("8")) {
					facilitiesList.add("ガソリンスタンド ");
				}else if(checkedFacilities[i].equals("9")) {
					facilitiesList.add("EVスタンド ");
				}else if(checkedFacilities[i].equals("10")) {
					facilitiesList.add("観光案内 ");
				}else if(checkedFacilities[i].equals("11")) {
					facilitiesList.add("体験施設 ");
				}else if(checkedFacilities[i].equals("12")) {
					facilitiesList.add("温泉 ");
				}else if(checkedFacilities[i].equals("13")) {
					aroundList.add("コンビニ ");
				}else if(checkedFacilities[i].equals("14")) {
					aroundList.add("ドラッグストア ");
				}else if(checkedFacilities[i].equals("15")) {
					aroundList.add("ガソリンスタンド(周辺) ");
				}else if(checkedFacilities[i].equals("16")) {
					aroundList.add("病院 ");
				}else if(checkedFacilities[i].equals("17")) {
					aroundList.add("最寄り駅/バス停 ");
				}else if(checkedFacilities[i].equals("18")) {
					aroundList.add("温泉(周辺) ");
				}else if(checkedFacilities[i].equals("19")) {
					aroundList.add("宿泊施設 ");
				}
			}

			//検索結果を読み込み
			searchList = searchLogic.getSearchAllList(areas,facilities);

		}
		//エリアIDと施設ID どっちもない場合
		//何もしない

		//検索項目表示リストの長さ取得
		areasList_length= areasList.size();
		facilitiesList_length= facilitiesList.size();
		aroundList_length= aroundList.size();

		if (searchList != null) {
			//リクエストスコープに結果を保存
			request.setAttribute("searchList", searchList);
		}
		if(areasList != null) {
			request.setAttribute("areasList",areasList);
			request.setAttribute("areasList_length",areasList_length);
		}
		if(facilitiesList != null) {
			request.setAttribute("facilitiesList",facilitiesList);
			request.setAttribute("facilitiesList_length",facilitiesList_length);
		}
		if(aroundList != null) {
			request.setAttribute("aroundList",aroundList);
			request.setAttribute("aroundList_length",aroundList_length);
		}
		//検索画面に表示
		forward = "/WEB-INF/jsp/front/search.jsp";

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