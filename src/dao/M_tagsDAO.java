package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Tags;
import model.DbConnection;

public class M_tagsDAO {

	/*********
	 * 検索ページ用(SP) タグ画像、出力用メソッド
	 *********/
	public List<Tags> getSPSearchTags(int showflag) {

		List<Tags> SPSearchTagsList = new ArrayList<>();

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
			sql = "SELECT *"
					+ " FROM M_tages"
					+ " WHERE show_flag = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, showflag);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int tages_id = rs.getInt("tages_id");
				String category_name = rs.getString("category_name");
				String tages_alt = rs.getString("alt");
				String icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path1");

				Tags Tag = new Tags(
						tages_id,
						category_name,
						tages_alt,
						icon_path1);

				SPSearchTagsList.add(Tag);

			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return SPSearchTagsList;
	}

}
