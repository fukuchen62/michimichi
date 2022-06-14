package model;

import java.util.List;

import beans.Station;
import dao.M_road_stationsDAO;

public class CommentListLogic {

	//管理画面　道の駅一覧（昇順）
	public List<Station> getadminStaionList(){
		//DAOオブジェクト生成
		M_road_stationsDAO dao = new M_road_stationsDAO();
		//DBから全レコードを取得する
		List<Station> AdminStaionList = dao.getadminStaionList();
		return AdminStaionList;
	}

}
