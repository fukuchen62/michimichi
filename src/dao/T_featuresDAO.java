package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Feature;
import beans.FeatureList;
import model.DbConnection;

public class T_featuresDAO {


	/*********
	 * 特集一覧、出力用のメソッド
	 *********/
	public List<Feature> getFeatureList(int showflag) {

		List<Feature> FLList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっているものを、降順で抽出する。
			sql = "SELECT * "
					+ " FROM t_features "
					+ " WHERE show_flag = ?"
					+ " ORDER BY"
					+ " feature_id DESC";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, showflag);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int feature_id = rs.getInt("feature_id");
				String feature_name = rs.getString("feature_name");
				String main_photo_path = DAOConstant.UPLOADS_TOPIC + rs.getString("main_photo_path");
				String alt = rs.getString("alt");
				String feature_list = rs.getString("feature_list");

				Feature feature = new Feature(
						feature_id,
						feature_name,
						main_photo_path,
						alt,
						feature_list);

				FLList.add(feature);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return FLList;

	}

	/*********
	 * 特集個別、出力用のメソッド
	 *********/

	public List<Feature> getFeature(int showflag,int con_id) {

		List<Feature> FList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっている指定されたIDのものを抽出する。
			//ASは教科書p56
			sql = "SELECT "
					 + "a.feature_id,"
					 + "a.feature_name,"
					 + "a.main_photo_path,"
					 + "a.alt,"
					 + "a.feature_list,"
					 + "a.content,"
					 + "a.content_css,"
					 + "b.feature_type_id,"
					 + "b.feature_type_name,"
					 + "b.photo_path1,"
					 + "b.alt1,"
					 + "b.photo_path2,"
					 + "b.alt2,"
					 + "b.photo_path3,"
					 + "b.alt3 "
					 + "FROM t_features as a INNER JOIN m_feature_types as b "
					 + "ON a.feature_type_id = b.feature_type_id "
					 + "WHERE a.show_flag = ? "
					 + "AND a.feature_id = ?";


			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(n番目の？,代入するもの)
			pStmt.setInt(1, showflag);
			pStmt.setInt(2, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int feature_id = rs.getInt("feature_id");
				String feature_name = rs.getString("feature_name");
				String main_photo_path = DAOConstant.UPLOADS_TOPIC + rs.getString("main_photo_path");
				String alt = rs.getString("alt");
				String feature_list = rs.getString("feature_list");
				String content = rs.getString("content");
				String content_css = rs.getString("content_css");

				int feature_type_id = rs.getInt("feature_type_id");
				String feature_type_name = rs.getString("feature_type_name");
				String photo_path1 = DAOConstant.UPLOADS_TOPIC + rs.getString("photo_path1");
				String alt1 = rs.getString("alt1");
				String photo_path2 = DAOConstant.UPLOADS_TOPIC + rs.getString("photo_path2");
				String alt2 = rs.getString("alt2");
				String photo_path3 = DAOConstant.UPLOADS_TOPIC + rs.getString("photo_path3");
				String alt3 = rs.getString("alt3");

				Feature feature = new Feature(feature_id, feature_name, main_photo_path, alt,feature_list,content,content_css,
						feature_type_id,feature_type_name,photo_path1,alt1,photo_path2,alt2,photo_path3,alt3);
				FList.add(feature);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return FList;

	}

	/*********
	 * TOP特集個別リンク、出力用のメソッド
	 *********/

	public List<Feature> getTopFeature(int showflag) {

		List<Feature> TFList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっている指定されたIDのものを抽出する。
			//ASは教科書p56
			sql = "SELECT "
					 + "a.feature_id,"
					 + "a.feature_name,"
					 + "b.feature_type_id,"
					 + "b.feature_type_name,"
					 + "b.photo_path1,"
					 + "b.alt1,"
					 + "b.photo_path2,"
					 + "b.alt2,"
					 + "b.photo_path3,"
					 + "b.alt3 "
					 + "FROM t_features as a INNER JOIN m_feature_types as b "
					 + "ON a.feature_type_id = b.feature_type_id "
					 + "WHERE a.show_flag = ? "
					 + " ORDER BY RAND()";


			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(n番目の？,代入するもの)
			pStmt.setInt(1, showflag);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int feature_id = rs.getInt("feature_id");
				String feature_name = rs.getString("feature_name");

				int feature_type_id = rs.getInt("feature_type_id");
				String feature_type_name = rs.getString("feature_type_name");
				String photo_path1 = rs.getString("photo_path1");
				String alt1 = rs.getString("alt1");
				String photo_path2 = rs.getString("photo_path2");
				String alt2 = rs.getString("alt2");
				String photo_path3 = rs.getString("photo_path3");
				String alt3 = rs.getString("alt3");

				Feature feature = new Feature(feature_id, feature_name,
						feature_type_id,feature_type_name,photo_path1,alt1,photo_path2,alt2,photo_path3,alt3);
				TFList.add(feature);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return TFList;

	}

	/*********
	 * TOP特集個別リンク、出力用のメソッド
	 *********/
	public List<Feature> getStationFeature(int showflag) {

		List<Feature> SFList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっているものを、降順で抽出する。
			sql = "SELECT * "
					+ " FROM t_features "
					+ " WHERE show_flag = ?"
					+ " ORDER BY"
					+ " feature_id DESC";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, showflag);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int feature_id = rs.getInt("feature_id");
				String feature_name = rs.getString("feature_name");
				String main_photo_path = DAOConstant.UPLOADS_TOPIC + rs.getString("main_photo_path");
				String alt = rs.getString("alt");

				Feature feature = new Feature(
						feature_id,
						feature_name,
						main_photo_path,
						alt);

				SFList.add(feature);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return SFList;

	}

	/*********
	 * 特集個別、追加のメソッド
	 *********/
	public boolean create(FeatureList feature) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
