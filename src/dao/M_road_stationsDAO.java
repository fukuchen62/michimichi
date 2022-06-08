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
	 * 道の駅個別ページ、出力用のメソッド
	 *********/
	public Station getStationById(int con_id) {

		Station station = null;

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
					+ " FROM M_road_stations "
					+ " WHERE michinoeki_id = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int michinoeki_id = rs.getInt("michinoeki_id");
				String michinoeki_name  = rs.getString("michinoeki_name");
				String photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				String photo_thum_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_thum_path1");
				String alt1 = rs.getString("alt1");
				String photo_path2 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path2");
				String photo_thum_path2 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_thum_path2");
				String alt2 = rs.getString("alt2");
				String photo_path3 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path3");
				String photo_thum_path3 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_thum_path3");
				String alt3 = rs.getString("alt3");
				String photo_path4 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path4");
				String photo_thum_path4 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_thum_path4");
				String alt4 = rs.getString("alt4");
				String explanation = rs.getString("explanation");

				String post_code = rs.getString("post_code");
				String address = rs.getString("address");
				String tel = rs.getString("tel");
				String parking = rs.getString("parking");
				String service_time = rs.getString("service_time");
				String closed = rs.getString("closed");
				String url = rs.getString("url");

				String gas_station = rs.getString("gas_station");
				String hospital = rs.getString("hospital");
				String near_station = rs.getString("near_station");

				String iframe_src = rs.getString("iframe_src");

				String feature1_photo_path = DAOConstant.UPLOADS_MICHIEKI + rs.getString("feature1_photo_path");
				String feature1_alt = rs.getString("feature1_alt");
				String feature1_overview = rs.getString("feature1_overview");
				String feature2_photo_path = DAOConstant.UPLOADS_MICHIEKI + rs.getString("feature2_photo_path");
				String feature2_alt = rs.getString("feature2_alt");
				String feature2_overview = rs.getString("feature2_overview");

				int feature_banner1 = rs.getInt("feature_banner1");
				int feature_banner2 = rs.getInt("feature_banner2");
				int feature_banner3 = rs.getInt("feature_banner3");

				station = new Station(
						michinoeki_id,
						michinoeki_name,
						photo_path1,
						photo_thum_path1,
						alt1,
						photo_path2,
						photo_thum_path2,
						alt2,
						photo_path3,
						photo_thum_path3,
						alt3,
						photo_path4,
						photo_thum_path4,
						alt4,
						explanation,

						post_code,
						address,
						tel,
						parking,
						service_time,
						closed,
						url,

						gas_station,
						hospital,
						near_station,

						iframe_src,

						feature1_photo_path,
						feature1_alt,
						feature1_overview,
						feature2_photo_path,
						feature2_alt,
						feature2_overview,

						feature_banner1,
						feature_banner2,
						feature_banner3);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return station;

	}


	/*********
	 * 道の駅個別 タグ情報、出力用メソッド
	 *********/
	public List<Station> getFacilities(int showflag, int con_id) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	/*********
	 * TOP　検索sectionの道の駅個別リンク、出力用のメソッド
	 *********/
	public List<Station> getTopStaionList(int showflag) {


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
				int michinoeki_id = rs.getInt("michinoeki_id");
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
