package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static String jdbcDriver;	//ドライバー名
	public static String jdbcUri;		//Uri
	public static String dbUser;		//DBのログインユーザーID
	public static String dbPassword;	//DBのログインパスワード
//	private static final String DRIVER_NAME = "org.h2.Driver";
//	private static final String JDBC_URL = "jdbc:h2:file:C:/h2/inokuni";
//	private static final String DB_USER = "sa";
//	private static final String DB_PASS = "qlip";

	public static Connection conn;		//Connection

	/**
	 * データベースに接続
	 * @return
	 */
	public static boolean dbConnection() {
		conn = null;
		try {

			Class.forName(jdbcDriver);
			//conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			conn = DriverManager.getConnection(jdbcUri,dbUser,dbPassword);

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;

		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
		return true;

	}

	/**
	 * データベースを切断する
	 * @param conn
	 * @return
	 */
	public static boolean dbDisconnection() {

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
