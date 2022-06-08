package model;

import java.util.List;

import beans.Facilities;
import dao.M_facilitiesDAO;

public class FacilitiesLogic {

	//指定された道の駅IDのタグ情報を表示する
	public List<Facilities> getFacilities(int showflag, int con_id) {
		//DAOオブジェクト生成
		M_facilitiesDAO dao = new M_facilitiesDAO();
		//DBから全レコードを取得する
		List<Facilities> FacilityList = dao.getFacilities(showflag,con_id);
		return FacilityList;
	}


}
