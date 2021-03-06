package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import beans.CommentBs;
import model.DbConnection;

public class T_commentsDAO {

	/*********
	 * 道の駅のIDから関連コメントを取得、出力用のメソッド
	 *********/
	public List<CommentBs> getCommentsById(int showflag, int con_id) {

		List<CommentBs> CommentList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//DBへ接続
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

			//結果表に格納されたレコードの内容をCommentListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int comment_id = rs.getInt("comment_id");
				String name = rs.getString("name");
				String comment = rs.getString("comment");
				Date post_time = rs.getTimestamp("post_time");

				CommentBs comments = new CommentBs(
						comment_id,
						name,
						comment,
						post_time);

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

	/*********
	 * 投稿されたコメント、入力用メソッド
	 * (結果をTorFで返すよ)
	 *********/
	public boolean insertComment(int con_id, String name, String comment) {

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
					+ " T_comments"
					+ " (michinoeki_id,name,comment,post_time,SHOW_FLAG)"
					+ " VALUES"
					+ " (?,?,?,?,?)";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, con_id);
			pStmt.setString(2, name);
			pStmt.setString(3, comment);

			Date posttime = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			pStmt.setString(4, sdf.format(posttime));
			pStmt.setInt(5, 1);

			//SQLを実行し、結果表を取得
			int result = pStmt.executeUpdate();

			//読み込んだ結果を処理する
			if (result != 1) {
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
	 * コメント、表示/非表示切り替え用メソッド
	 *********/
	public boolean updateComment(int comment_id, int show_flag) {

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return false;

		try {
			//SQL文を定義する
			sql = "UPDATE"
					+ " T_COMMENTS"
					+ " SET "
					+ " show_flag = ? "
					+ " WHERE "
					+ " comment_id= ?";
			//	        		+ " WHERE comment_id IN ('1','2','3') ";

			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, show_flag);
			pStmt.setInt(2, comment_id);

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

	//管理画面  道の駅別コメント一覧
	public List<CommentBs> getAdminCommentsById(int con_id) {

		List<CommentBs> AdminCommentList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		//DBへ接続
		try {

			//SELECT文を準備
			sql = "SELECT * "
					+ " FROM T_comments "
					+ " WHERE michinoeki_id = ?"
					+ " ORDER BY"
					+ " comment_id DESC";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, con_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をCommentListインスタンスに設定し、
			//ArrayListインスタンスに追加
			while (rs.next()) {
				int comment_id = rs.getInt("comment_id");
				int michinoeki_id = rs.getInt("michinoeki_id");
				String name = rs.getString("name");
				String comment = rs.getString("comment");
				Date post_time = rs.getTimestamp("post_time");
				int show_flag = rs.getInt("show_flag");

				CommentBs comments = new CommentBs(
						comment_id,
						michinoeki_id,
						name,
						comment,
						post_time,
						show_flag);

				AdminCommentList.add(comments);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return AdminCommentList;

	}

	//管理画面  道の駅別コメント一覧
	public static int getCommentCount(int station_id) {

		int count = 0;

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return 0;

		//DBへ接続
		try {

			//SELECT文を準備
			sql = "SELECT count(*) as count "
					+ " FROM T_comments "
					+ " WHERE michinoeki_id = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, station_id);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をCommentListインスタンスに設定し、

			if (rs.next()) {
				count = rs.getInt("count");
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return 0;

		} finally {
			//データベース切断
		}
		return count;

	}

	//(管理用)コメント一覧
	public List<CommentBs> getAdminCommentList() {

		List<CommentBs> admincommentlist = new ArrayList<>();

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
					+ " WHERE comment_id = ?"
					+ " ORDER BY"
					+ " comment_id DESC";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			while (rs.next()) {
				int comment_id = rs.getInt("comment_id");
				int michinoeki_id = rs.getInt("michinoeki_id");
				String name = rs.getString("name");
				String comment = rs.getString("comment");
				Date post_time = rs.getTimestamp("post_time");
				int show_flag = rs.getInt("show_flag");

				CommentBs comments = new CommentBs(
						comment_id,
						michinoeki_id,
						name,
						comment,
						post_time,
						show_flag);

				admincommentlist.add(comments);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return admincommentlist;

	}

	/**
	 * コメントIDによるコメントの詳細を取得
	 * @param commentId
	 * @return
	 */
	public CommentBs getCommentById(int commentId) {

		CommentBs commentbs = null;

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
					+ " WHERE comment_id = ?";

			//SQLを送信
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//pStmt.setInt(一番目の？,代入するもの)
			pStmt.setInt(1, commentId);

			//SELECTを実行し、結果表を取得
			ResultSet rs = pStmt.executeQuery();

			//結果表に格納されたレコードの内容をFeatureListインスタンスに設定し、ArrayListインスタンスに追加
			if (rs.next()) {
				int comment_id = rs.getInt("comment_id");
				int michinoeki_id = rs.getInt("michinoeki_id");
				String name = rs.getString("name");
				String comment = rs.getString("comment");
				Date post_time = rs.getTimestamp("post_time");
				int show_flag = rs.getInt("show_flag");

				commentbs = new CommentBs(
						comment_id,
						michinoeki_id,
						name,
						comment,
						post_time,
						show_flag);
			}

		} catch (SQLException e) {
			// 自動生成された catch ブロック
			e.printStackTrace();
			return null;

		} finally {
			//データベース切断

		}
		return commentbs;

	}

	public boolean update(int comment_id, int showflag) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
