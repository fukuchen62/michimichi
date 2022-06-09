package model;

import beans.GoodRecordsBs;
import dao.T_good_recordsDAO;

public class GoodRecordsLogic {

	//指定された道の駅IDのイイネのCount数を表示する
	public GoodRecordsBs getGoodRecordsCountById(int con_id) {
		//DAOオブジェクト生成
		T_good_recordsDAO dao = new T_good_recordsDAO();
		//DBから全レコードを取得する
		GoodRecordsBs goodRecordsCount = dao.getGoodRecordsCountById(con_id);
		return goodRecordsCount;
	}

	//指定された道の駅IDにある既存のIPアドレスを確認する
	public int getGoodRecordsFindByUser(String ip_id ,int con_id) {
		//DAOオブジェクト生成
		T_good_recordsDAO dao = new T_good_recordsDAO();
		//DBから全レコードを取得する
		int num = dao.getGoodRecordsFindByUser(ip_id ,con_id);
		return num;
	}

	//入力されたイイネ情報をDBに書き込む
	public boolean insertGoodRecords(String ip_id ,int con_id) {
		//DAOオブジェクト生成
		T_good_recordsDAO dao = new T_good_recordsDAO();
		//DBから全レコードを取得する
		boolean insertGoodRecords = dao.insertGoodRecords(ip_id ,con_id);
		return insertGoodRecords;
	}

}
