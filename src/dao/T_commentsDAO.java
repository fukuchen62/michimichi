package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.CommentBs;
import model.DbConnection;

public class T_commentsDAO {

	/*********
	 * コメント、出力用のメソッド
	 *********/
	public List<CommentBs> getCommentsById (int showflag,int con_id) {

		List<CommentBs> CommentList = new ArrayList<>();

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
					+ " FROM T_comments "
					+ " WHERE show_flag = ?"
					+ " AND michinoeki_id = ?"
					+ " ORDER BY"
					+ " comment_id DESC";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, showflag);
			pStmt.setInt(2, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int comment_id = rs.getInt("comment_id");
				String name = rs.getString("name");
				String comment =  rs.getString("comment");
				String post_time = rs.getString("post_time");

				CommentBs comments = new CommentBs(
						comment_id,
						name,
						comment,
						post_time
						);

				CommentList.add(comments);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return CommentList;

	}


}
