package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import beans.GoodRecordsBs;
import model.DbConnection;

public class T_good_recordsDAO {

	/*********
	 * 道の駅IDに対応したイイネ情報、対応IPアドレス取得用メソッド
	 *********/
	public int getGoodRecordsFindByUser(String ip_id ,int con_id) {


		int num =0;

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return num;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっている指定IDの一覧を取得する。
			sql = "SELECT COUNT(user_ip_address) AS num "
					+ " FROM T_good_records "
					+ " WHERE user_ip_address = ?"
					+ " AND michinoeki_id = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setString(1, ip_id);
			pStmt.setInt(2, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			if (rs.next()) {
				num = rs.getInt("num");

			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return num;

		} finally {
			//データベース切断

		}
		return num;

	}

	/*********
	 * クリックされたイイネ情報、入力用メソッド
	 * (結果をTorFで返すよ)
	 *********/
	public boolean insertGoodRecords(String ip_id ,int con_id) {

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return false;

		//BDへ接続
		try {

			//SELECT文を準備
			//show_flagで表示になっている指定IDの一覧を取得する。
			sql = "INSERT INTO"
					+ " T_good_records"
					+ " (michinoeki_id,user_ip_address,create_time)"
					+ " VALUES"
					+ " (?,?,?)";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, con_id);
			pStmt.setString(2, ip_id);

			Date createtime = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			pStmt.setString(3, sdf.format(createtime));


			//SQLを実行し、結果表を取得
//			ResultSet rs = pStmt.executeQuery();
			int result = pStmt.executeUpdate();
			//読み込んだ結果を処理する
			if(result != 1) {
				return false;
			}


		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return false;

		}
		return true;

	}


	/*********
	 * 道の駅IDに対応したイイネのカウント数、出力用メソッド
	 *********/
	public GoodRecordsBs getGoodRecordsCountById(int con_id) {

		GoodRecordsBs goodRecordsCount = null;

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
			sql = "SELECT michinoeki_id , COUNT(michinoeki_id) AS good_count "
					+ " FROM T_good_records "
					+ " WHERE michinoeki_id = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();


			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			if (rs.next()) {
				int michinoeki_id = rs.getInt("michinoeki_id");
				int good_count = rs.getInt("good_count");

				goodRecordsCount = new GoodRecordsBs(
						michinoeki_id,
						good_count);

			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return goodRecordsCount;

	}

}
