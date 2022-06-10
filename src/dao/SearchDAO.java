package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Search;
import model.DbConnection;

public class SearchDAO {

	//エリアIDのみの検索
	public List<Search> findArea(int[] search_area_id) {

		List<Search> SearchList = new ArrayList<>();
		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		try {
			//SELECT文作成
			sql += "SELECT M_ROAD_STATIONS.michinoeki_id,M_ROAD_STATIONS.AREA_ID,michinoeki_name,alt1,photo_path1 ";
			sql += "FROM M_ROAD_STATIONS INNER JOIN M_AREAS ON M_ROAD_STATIONS.AREA_ID  = M_AREAS.AREA_ID "
//					+ "INNER JOIN M_FACILITIES ON M_FACILITIES.MICHINOEKI_ID = M_ROAD_STATIONS.MICHINOEKI_ID "
					;
			sql += "WHERE ";

			sql += "M_ROAD_STATIONS.AREA_ID=?";

			//複数のエリアIDが選択された場合
			if(search_area_id.length>=2) {
				for(int i=1;i<search_area_id.length;i++) {
					sql += " OR M_ROAD_STATIONS.AREA_ID=?";
				}
			}

			//SQL命令を準備する
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//ここで一個目
			pStmt.setInt(1, search_area_id[0]);
			//複数のエリアIDが選択された場合
			if(search_area_id.length>=2) {
				//二個目以降のエリアID
				for(int i=1;i<search_area_id.length;i++) {
					pStmt.setInt(i+1, search_area_id[i]);
				}
			}
			//SQL命令を発行する
			ResultSet rs = pStmt.executeQuery();
			//読み込んだレコードを処理する
			while (rs.next()) {
				int michinoeki_id = rs.getInt("michinoeki_id");
				int area_id = rs.getInt("area_id");
				String michinoeki_name = rs.getString("michinoeki_name");
				String alt1 = rs.getString("alt1");
				//String photo_path=rs.getString("photo_path");
				String photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				//String icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path1");
				//String icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path2");

				//Searchインスタンス
//				Search Search = new Search(michinoeki_id, area_id, facilities_id, tages_id, michinoeki_name,
//						photo_path1, alt, icon_path1, icon_path2);
				Search Search = new Search(michinoeki_id, area_id, michinoeki_name,photo_path1, alt1);
				SearchList.add(Search);
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}

		return SearchList;

	}

	//施設IDのみの検索
	public List<Search> findFacilities(int[] search_facilities_id) {

		List<Search> SearchList = new ArrayList<>();

		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		try {
			//SELECT文作成
			sql += "SELECT michinoeki_id,M_ROAD_STATIONS.AREA_ID,michinoeki_name,alt1,photo_path1 ";
			sql += "FROM M_ROAD_STATIONS INNER JOIN M_AREAS ON M_ROAD_STATIONS.AREA_ID  = M_AREAS.AREA_ID ";
			sql += "WHERE ";
			sql += "FACILITIES_ID=?";

			//複数のエリアIDが選択された場合
			if(search_facilities_id.length>=2) {
				for(int i=1;i<search_facilities_id.length;i++) {
					sql += " OR FACILITIES_ID=?";
				}
			}

			//SQL命令を準備する
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//ここで一個目
			pStmt.setInt(1, search_facilities_id[0]);
			//複数のエリアIDが選択された場合
			if(search_facilities_id.length>=2) {
				//二個目以降のエリアID
				for(int i=1;i<search_facilities_id.length;i++) {
					pStmt.setInt(i+1, search_facilities_id[i]);
				}
			}
			//SQL命令を発行する
			ResultSet rs = pStmt.executeQuery();
			//読み込んだレコードを処理する
			while (rs.next()) {
				int michinoeki_id = rs.getInt("michinoeki_id");
				int area_id = rs.getInt("area_id");
				//int tages_id = rs.getInt("tages_id");
				String michinoeki_name = rs.getString("michinoeki_name");
				String alt1 = rs.getString("alt1");
				//String photo_path=rs.getString("photo_path");
				String photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				//String icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path1");
				//String icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path2");

				//Searchインスタンス
//				Search Search = new Search(michinoeki_id, area_id, facilities_id, tages_id, michinoeki_name,
//						photo_path1, alt, icon_path1, icon_path2);
				Search Search = new Search(michinoeki_id, area_id, michinoeki_name,photo_path1, alt1);
				SearchList.add(Search);
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}

		return SearchList;

	}
	public List<Search> findAll(int[] search_area_id,int[] search_facilities_id) {

		List<Search> SearchList = new ArrayList<>();
		String sql = "";

		//データベースに接続
		Connection conn = null;
		conn = DbConnection.conn;
		if (conn == null)
			return null;

		try {
			//SELECT文作成
			sql += "SELECT M_ROAD_STATIONS.michinoeki_id,M_ROAD_STATIONS.AREA_ID,michinoeki_name,FACILITIES_ID,alt1,photo_path1 ";
			sql += "FROM M_ROAD_STATIONS  INNER JOIN "
					+ " M_AREAS "
					+ " ON "
					+ " M_ROAD_STATIONS.AREA_ID = M_AREAS.AREA_ID "
					+ " INNER JOIN "
					+ "M_FACILITIES "
					+ " ON "
					+ " M_FACILITIES.MICHINOEKI_ID = M_ROAD_STATIONS.MICHINOEKI_ID ";
			sql += "WHERE ";

			for(int i=0;i<search_area_id.length;i++) {
				//エリアIDが「1」の場合
				if(search_area_id[i]==1) {
					sql += "M_ROAD_STATIONS.AREA_ID=1 AND ";
					//複数の施設IDが選択された場合
					for(int j=0;j<search_facilities_id.length;j++) {

						//リストの終わりの場合　後に続く要素はないので
						if(search_facilities_id.length==j+1) {
							sql += "tag?=TRUE";
						}else {
						//リストの終わりでは無い場合　後に続く検索条件
							sql += "tag?=TRUE AND ";
						}
					}
					//複数のエリア検索をする
					//場合　sql文に条件追加
					if(search_area_id.length>1) {
						sql += " AND ";
					}
				}
				//エリアIDが「2」の場合
				if(search_area_id[i]==2) {
					sql += "M_ROAD_STATIONS.AREA_ID=2 AND ";
					for(int j=0;j<search_facilities_id.length;j++) {
						sql += "tag?=TRUE";
					}
				}
				//エリアIDが「3」の場合
				if(search_area_id[i]==3) {
					sql += "M_ROAD_STATIONS.AREA_ID=3 AND";
					for(int j=0;j<search_facilities_id.length;j++) {
						sql += "tag?=TRUE";
					}
				}
			}
//			//複数のエリアIDが選択された場合
//			if(search_area_id.length>=2) {
//				for(int i=1;i<search_area_id.length;i++) {
//					sql += " OR M_ROAD_STATIONS.AREA_ID=?";
//				}
//			}

			//SQL命令を準備する
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//ここで一個目
			pStmt.setInt(1, search_facilities_id[0]);

			//複数の施設IDが選択された場合
			if(search_facilities_id.length>=2) {
				//二個目以降の施設ID
				for(int i=1;i<search_facilities_id.length;i++) {
					pStmt.setInt(i+1, search_facilities_id[i]);
				}
			}
			//SQL命令を発行する
			ResultSet rs = pStmt.executeQuery();

			//読み込んだレコードを処理する
			while (rs.next()) {
				int michinoeki_id = rs.getInt("michinoeki_id");
				int area_id = rs.getInt("area_id");
				//int tages_id = rs.getInt("tages_id");
				String michinoeki_name = rs.getString("michinoeki_name");
				String alt1 = rs.getString("alt1");
				//String photo_path=rs.getString("photo_path");
				String photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				//String icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path1");
				//String icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("icon_path2");

				//Searchインスタンス
//				Search Search = new Search(michinoeki_id, area_id, facilities_id, tages_id, michinoeki_name,
//						photo_path1, alt, icon_path1, icon_path2);
				Search Search = new Search(michinoeki_id, area_id, michinoeki_name,photo_path1, alt1);
				SearchList.add(Search);
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			return null;
		}

		return SearchList;

	}
}
