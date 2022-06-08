package model;

import java.util.List;

import beans.Search;
import dao.SearchDAO;

public class SearchLogic {

	/**
	 * エリアIDから検索結果を取得する
	 *
	 * @return searchList
 	 */
	public List<Search> getSearchList(int[] area_id){
		//DAOオブジェクト生成
		SearchDAO dao= new SearchDAO();
		//レコード取得
		List<Search> searchList=dao.findArea(area_id);
		return searchList;
	}

	/**
	 * エリアIDから検索結果を取得する
	 *
	 * @return searchList
 	 */
	public List<Search> getSearchFacilityList(int[] facilities_id){
		//DAOオブジェクト生成
		SearchDAO dao= new SearchDAO();
		//レコード取得
		List<Search> searchList=dao.findFacilities(facilities_id);
		return searchList;
	}

	/**
	 * エリアIDと施設IDから検索結果を取得する
	 * @return searchList
	 */
	public List<Search> getSearchAllList(int[] area_id,int[] facility_id){
		//DAOオブジェクト生成
		SearchDAO dao= new SearchDAO();
		//レコード取得
		List<Search> searchList=dao.findAll(area_id,facility_id);//
		return searchList;

	}
}
