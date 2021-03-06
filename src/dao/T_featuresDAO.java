package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import beans.Feature;
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
					+ " feature_id ASC";

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

	public Feature getFeature(int con_id) {

		Feature feature = null;

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
					+ "WHERE a.feature_id = ?";

			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(n番目の？,代入するもの)
			pStmt.setInt(1, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			if (rs.next()) {
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

				feature = new Feature(feature_id, feature_name, main_photo_path, alt, feature_list, content,
						content_css,
						feature_type_id, feature_type_name, photo_path1, alt1, photo_path2, alt2, photo_path3, alt3);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return feature;

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
				String photo_path1 = DAOConstant.UPLOADS_TOPIC + rs.getString("photo_path1");
				String alt1 = rs.getString("alt1");
				String photo_path2 = DAOConstant.UPLOADS_TOPIC + rs.getString("photo_path2");
				String alt2 = rs.getString("alt2");
				String photo_path3 = DAOConstant.UPLOADS_TOPIC + rs.getString("photo_path3");
				String alt3 = rs.getString("alt3");

				Feature feature = new Feature(feature_id, feature_name,
						feature_type_id, feature_type_name, photo_path1, alt1, photo_path2, alt2, photo_path3, alt3);
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
	 * 特集個別、追加、変更、削除のメソッド
	 *********/
	//新規用
	public boolean create(Feature feature) {
		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return false;

		try {
			//SQL文
			sql = "INSERT INTO"
					+ " feature"
					+ " feature_id,"
					+ " feature_name,"
					+ " feature_type_id,"
					+ " main_photo_path,alt,"
					+ " content,"
					+ " show_flag,"
					+ " create_time,"
					+ " create_user_id)"
					+ " VALUES"
					+ " (?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, feature.getFeature_id());
			pStmt.setString(2, feature.getFeature_name());
			pStmt.setInt(3, feature.getFeature_type_id());
			pStmt.setString(4, feature.getMain_photo_path());
			pStmt.setString(5, feature.getAlt());
			pStmt.setString(6, feature.getContent());
			pStmt.setInt(7, feature.getShow_flag());

			//新規作成日時を文字列に変換処理
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			if (feature.getUpdate_time() != null) {
				pStmt.setString(8, sdf.format(feature.getCreate_time()));
			} else {
				pStmt.setString(8, null);
			}
			pStmt.setInt(9, feature.getCreate_user_id());

			//SQL命令を発行する
			int result = pStmt.executeUpdate();
			//読み込んだ結果を処理する
			if (result != 1) {
				return false;
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;

		} finally {
			//データベース切断

		}
		return true;
	}

	public boolean insert(Feature feature) {
		return false;
	}

	//feature_idで特定記事を取得
	public Feature findFeatureById(int Feature_id) {

		Feature feature = null;

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		try {

			//SELECT文を準備
			String sql = "";

			sql += "SELECT T_FEATURES.* , M_ACCOUNTS.name ";
			sql += "FROM T_FEATURES  ";
			sql += "INNER JOIN M_ACCOUNTS ";
			sql += "ON M_ACCOUNTS.CREATE_USER_ID  = USER_ID ";
			sql += "WHERE ";
			sql += "FEATURE_ID  = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, Feature_id);

			//SELECTを実行し、結果を取得
			ResultSet rs = pStmt.executeQuery();

			//rs結果表に格納されたレコードをPostインスタンスリストに代入
			if (rs.next()) {
				//Postのデータを取得
				int feature_id = rs.getInt("feature_id");
				String feature_name = rs.getString("feature_name");
				int feature_type_id = rs.getInt("feature_type_id");
				String main_photo_path = rs.getString("main_photo_path");
				String alt = rs.getString("alt");
				String feature_list = rs.getString("feature_list");
				String content = rs.getString("content");
				String content_css = rs.getString("content_css");
				String name = rs.getString("name");
				int show_flag = rs.getInt("show_flag");
				int update_user_id = rs.getInt("update_user_id");
				Date update_time = rs.getTimestamp("update_time");
				int create_user_id = rs.getInt("create_user_id");
				Date createtime = rs.getTimestamp("create_time");

				//featureインスタンスを生成
				feature = new Feature(
						feature_id,
						feature_name,
						feature_type_id,
						main_photo_path,
						alt,
						feature_list,
						content,
						content_css,
						name,
						show_flag,
						show_flag,
						update_time,
						update_user_id,
						update_time,
						create_user_id,
						createtime);

			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断
			//				if(conn != null) {
			//					if(DbConnection.dbDisconnection(conn)==false) {
			//						return null;
			//					}
			//				}
		}

		return feature;

	}

	//表示・非表示の設定
	public boolean update(int id, int showflag) {

		return false;
	}

	//特集の編集処理
	public boolean update(Feature feature) {
		// TODO 自動生成されたメソッド・スタブ
		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return false;

		try {
			//SQL文を定義する
			sql = "UPDATE"
					+ " t_features"
					+ " SET "
					//+ " feature_id= ?,"
					+ " feature_name= ?, "
					+ " feature_type_id=?, "
					+ " main_photo_path = ?, "
					+ " alt = ?, "
					+ " feature_list = ?, "
					+ " content = ?, "
					+ " content_css=?, "
					+ " show_flag = ?, "
					+ " update_time = ?,"
					+ " update_user_id = ?"
					+ " WHERE "
					+ " feature_id= ? ";

			PreparedStatement pStmt = conn.prepareStatement(sql);
			//				pStmt.setInt(1, feature.getFeature_id());
			pStmt.setString(1, feature.getFeature_name());
			pStmt.setInt(2, feature.getFeature_type_id());
			pStmt.setString(3, feature.getMain_photo_path());
			pStmt.setString(4, feature.getAlt());
			pStmt.setString(5, feature.getFeature_list());
			pStmt.setString(6, feature.getContent());
			pStmt.setString(7, feature.getContent_css());
			pStmt.setInt(8, feature.getShow_flag());

			//更新日時を文字列に変換処理
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			if (feature.getUpdate_time() != null) {
				pStmt.setString(9, sdf.format(feature.getUpdate_time()));
			} else {
				pStmt.setString(9, null);
			}
			pStmt.setInt(10, feature.getUpdate_user_id());
			pStmt.setInt(11, feature.getFeature_id());

			//SQL命令を発行する
			int result = pStmt.executeUpdate();

			System.out.println("update(Feature feature):"+result);

			//読み込んだ結果を処理する
			if (result != 1) {
				return false;
			}

		} catch (SQLException e) {

			e.printStackTrace();
			return false;

		} finally {

		}
		return true;
	}

	//特集を削除する処理
	public boolean delete(int id) {
		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return false;

		try {
			//SQL文
			sql = "DELETE"
					+ " FROM feature "
					+ " WHERE feature_id =?";

			//SQL命令を準備する
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, id);

			//SQL命令を発行する
			int result = pStmt.executeUpdate();

			if (result != 1) {
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;

		} finally {
			//データベース切断

		}
		//読み込んだ結果を返す
		return true;
	}

	//(管理用)特集一覧
	public List<Feature> getAdminFeatureList() {

		List<Feature> adminfeaturelist = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//DBSへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっているものを、降順で抽出する。
			sql = "SELECT * "
					+ " FROM T_FEATURES AS a"
					+ " INNER JOIN M_Accounts AS b"
					+ " ON a.create_user_id = b.user_id "
					+ " ORDER BY"
					+ " feature_id DESC";

//			System.out.println("SQL:" + sql);

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int feature_id = rs.getInt("feature_id");
				String feature_name = rs.getString("feature_name");
				int show_flag = rs.getInt("show_flag");
				int create_user_id = rs.getInt("create_user_id");
				Date create_time = rs.getTimestamp("create_time");
				String account_name = rs.getString("name");

				Feature feature = new Feature(
						feature_id,
						feature_name,
						show_flag,
						create_user_id,
						create_time,
						account_name);

				adminfeaturelist.add(feature);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return adminfeaturelist;

	}
}
