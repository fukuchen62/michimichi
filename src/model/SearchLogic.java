package model;

import java.util.List;

import beans.Search;
import dao.SearchDAO;

public class SearchLogic {

	/**
	 * 検索結果を取得する
	 * @return
	 */
	public List<Search> getSearchList(int[] id){
		//DAOオブジェクト生成
		SearchDAO dao= new SearchDAO();
		//レコード取得
		List<Search> searchList=dao.findAll(id);
		return searchList;

	}
}
