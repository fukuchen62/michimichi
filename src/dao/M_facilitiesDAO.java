package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Station;
import model.DbConnection;

public class M_facilitiesDAO {


	/*********
	 * 道の駅個別 タグ情報、出力用メソッド
	 *********/
	public List<Station> getFacilities(int showflag, int con_id) {

		List<Station> FacilityList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっているものを、ランダム順で抽出する。
			sql = "SELECT a.facilities_id, a.status, b.tages_id,b.category_name, b.photo_path, b.alt, b.icon_path1, b.icon_path2  "
					+ " FROM M_facilities AS a INNER JOIN M_tages AS b "
					+ "ON a.tags_id = b.tages_id "
					+ " WHERE b.show_flag = ?"
					+ " AND a.michinoeki_id = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, showflag);
			pStmt.setInt(2, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int facilities_id = rs.getInt("facilities_id");
				boolean status = rs.getBoolean("status");

				int tages_id = rs.getInt("tages_id");
				String category_name = rs.getString("category_name");
				String tages_photo_path = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path");
				String tages_alt = rs.getString("alt");
				String icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path1");
				String icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path2");

				Station Facility = new Station(
						tages_id,
						category_name,
						tages_photo_path,
						tages_alt,
						icon_path1,
						icon_path2,
						facilities_id,
						status);

				FacilityList.add(Facility);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return FacilityList;
	}


}
