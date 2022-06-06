package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Station;
import model.DbConnection;

public class M_recommendsDAO {


	/*********
	 * 道の駅個別 おすすめsection、出力用のメソッド
	 *********/

	public List<Station> getRecommends(int showflag, int con_id) {

		List<Station> RecommendsList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっている指定IDの一覧を取得する。
			sql = "SELECT * "
					+ " FROM M_recommends "
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
				int recommend_id = rs.getInt("recommend_id");
				String recommend_name = rs.getString("recommend_name");
				String recommend_photo_path = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_thum_path1");
				String recommend_alt = rs.getString("alt");
				String recommed_overview = rs.getString("recommed_overview");

				Station Recommend = new Station(
						recommend_id,
						recommend_name,
						recommend_photo_path,
						recommend_alt,
						recommed_overview);

				RecommendsList.add(Recommend);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return RecommendsList;
	}


}
