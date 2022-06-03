package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Station;
import model.DbConnection;

public class M_road_stationsDAO {

	/*********
	 * TOP　検索sectionの道の駅個別リンク、出力用のメソッド
	 *********/
	public List<Station> getTopStaionList(int showflag ) {

		List<Station> TSList = new ArrayList<>();

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
					+ " FROM M_road_stations "
					+ " WHERE show_flag = ?"
					+ " ORDER BY RAND()";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, showflag);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int michinoeki_id = rs.getInt("");
				String michinoeki_name = rs.getString("michinoeki_name");
				String photo_thum_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_thum_path1");
				String alt1 = rs.getString("alt1");

				Station topStation = new Station(
						michinoeki_id,
						michinoeki_name,
						photo_thum_path1,
						alt1);

				TSList.add(topStation);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return TSList;

	}


}
