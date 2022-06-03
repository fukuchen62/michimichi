package model;

import java.util.List;

import beans.Station;
import dao.M_road_stationsDAO;

public class StationListLogic {

	//TOP 検索section用の道の駅個別リンク
	//すべての記事をIDランダム順で取得する
	public List<Station> getAllTopStaionList(int showflag){
		//DAOオブジェクト生成
		M_road_stationsDAO dao = new M_road_stationsDAO();
		//DBから全レコードを取得する
		List<Station> TSList = dao.getTopStaionList(showflag);
		return TSList;
	}

}
