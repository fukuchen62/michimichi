package model;

import java.util.List;

import beans.Station;
import dao.M_facilitiesDAO;
import dao.M_recommendsDAO;
import dao.M_road_stationsDAO;
import dao.M_spotsDAO;

public class StationLogic {

	//指定された道の駅IDの道の駅基本情報を表示する
	public Station getStationById(int con_id) {
		//DAOオブジェクト生成
		M_road_stationsDAO dao = new M_road_stationsDAO();
		//DBから全レコードを取得する
		Station station = dao.getStationById(con_id);
		return station;
	}

	//指定された道の駅IDのおススメ情報を表示する
	public List<Station> getRecommends(int showflag, int con_id) {
		//DAOオブジェクト生成
		M_recommendsDAO dao = new M_recommendsDAO();
		//DBから全レコードを取得する
		List<Station> RecommendsList = dao.getRecommends(showflag,con_id);
		return RecommendsList;
	}

	//指定された道の駅IDの周辺スポットを表示する
	public List<Station> getSpots(int showflag, int con_id) {
		//DAOオブジェクト生成
		M_spotsDAO dao = new M_spotsDAO();
		//DBから全レコードを取得する
		List<Station> SpotList = dao.getSpots(showflag,con_id);
		return SpotList;
	}

	//指定された道の駅IDのタグ情報を表示する
	public List<Station> getFacilities(int showflag, int con_id) {
		//DAOオブジェクト生成
		M_facilitiesDAO dao = new M_facilitiesDAO();
		//DBから全レコードを取得する
		List<Station> FacilityList = dao.getFacilities(showflag,con_id);
		return FacilityList;
	}

}
