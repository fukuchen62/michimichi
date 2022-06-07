package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Station;
import model.DbConnection;

public class M_spotsDAO {

	/*********
	 * 道の駅個別 周辺スポットsection、出力用のメソッド
	 *********/
	public List<Station> getSpots(int showflag, int con_id) {

		List<Station> SpotList = new ArrayList<>();

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
			sql = "SELECT * "
					+ " FROM M_spots "
					+ " WHERE show_flag = ?"
					+ " AND michinoeki_id = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, showflag);
			pStmt.setInt(2, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int spot_id = rs.getInt("spot_id");
				String spot_name = rs.getString("spot_name");
				String spot_photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				String spot_alt1 = rs.getString("alt1");
				String spot_photo_path2 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path2");
				String spot_alt2 = rs.getString("alt2");
				String spot_photo_path3 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path3");
				String spot_alt3 = rs.getString("alt3");
				String spot_overview = rs.getString("overview");
				String spot_address = rs.getString("address");
				String spot_url = rs.getString("url");

				Station Spot = new Station(
						spot_id,
						spot_name,
						spot_photo_path1,
						spot_alt1,
						spot_photo_path2,
						spot_alt2,
						spot_photo_path3,
						spot_alt3,
						spot_overview,
						spot_address,
						spot_url);

				SpotList.add(Spot);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return SpotList;
	}
}
