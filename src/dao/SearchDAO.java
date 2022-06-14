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
			sql+="SELECT "
			+"M_ROAD_STATIONS.michinoeki_id,M_ROAD_STATIONS.AREA_ID,michinoeki_name,photo_path1,alt1,"
			+"tag1,tag1_icon_path1,tag1_icon_path2,tag2,tag2_icon_path1,tag2_icon_path2,tag3,tag3_icon_path1,tag3_icon_path2,tag4,tag4_icon_path1,tag4_icon_path2,tag5,tag5_icon_path1,tag5_icon_path2,tag6,tag6_icon_path1,tag6_icon_path2,tag7,tag7_icon_path1,tag7_icon_path2,tag8,tag8_icon_path1,tag8_icon_path2,tag9,tag9_icon_path1,tag9_icon_path2,tag10,tag10_icon_path1,tag10_icon_path2,"
			+"tag11,tag11_icon_path1,tag11_icon_path2,tag12,tag12_icon_path1,tag12_icon_path2,tag13,tag13_icon_path1,tag13_icon_path2,tag14,tag14_icon_path1,tag14_icon_path2,tag15,tag15_icon_path1,tag15_icon_path2,tag16,tag16_icon_path1,tag16_icon_path2,tag17,tag17_icon_path1,tag17_icon_path2,tag18,tag18_icon_path1,tag18_icon_path2,tag19,tag19_icon_path1,tag19_icon_path2";
			sql += " FROM "
					+ "M_ROAD_STATIONS "
					+ "INNER JOIN "
					+ "M_AREAS "
					+ "ON "
					+ "M_ROAD_STATIONS.AREA_ID = M_AREAS.AREA_ID "
					+ "INNER JOIN "
					+ "M_FACILITIES_INFORMATION "
					+ "ON "
					+ "M_FACILITIES_INFORMATION.MICHINOEKI_ID = M_ROAD_STATIONS.MICHINOEKI_ID ";
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
				String photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				boolean tag1 =rs.getBoolean("tag1");
				String tag1_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag1_icon_path1");
				String tag1_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag1_icon_path2");
				boolean tag2 =rs.getBoolean("tag2");
				String tag2_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag2_icon_path1");
				String tag2_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag2_icon_path2");
				boolean tag3 =rs.getBoolean("tag3");
				String tag3_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag3_icon_path1");
				String tag3_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag3_icon_path2");
				boolean tag4 =rs.getBoolean("tag4");
				String tag4_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag4_icon_path1");
				String tag4_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag4_icon_path2");
				boolean tag5 =rs.getBoolean("tag5");
				String tag5_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag5_icon_path1");
				String tag5_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag5_icon_path2");
				boolean tag6 =rs.getBoolean("tag6");
				String tag6_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag6_icon_path1");
				String tag6_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag6_icon_path2");
				boolean tag7 =rs.getBoolean("tag7");
				String tag7_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag7_icon_path1");
				String tag7_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag7_icon_path2");
				boolean tag8 =rs.getBoolean("tag8");
				String tag8_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag8_icon_path1");
				String tag8_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag8_icon_path2");
				boolean tag9 =rs.getBoolean("tag9");
				String tag9_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag9_icon_path1");
				String tag9_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag9_icon_path2");
				boolean tag10 =rs.getBoolean("tag10");
				String tag10_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag10_icon_path1");
				String tag10_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag10_icon_path2");
				boolean tag11 =rs.getBoolean("tag11");
				String tag11_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag11_icon_path1");
				String tag11_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag11_icon_path2");
				boolean tag12 =rs.getBoolean("tag12");
				String tag12_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag12_icon_path1");
				String tag12_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag12_icon_path2");
				boolean tag13 =rs.getBoolean("tag13");
				String tag13_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag13_icon_path1");
				String tag13_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag13_icon_path2");
				boolean tag14 =rs.getBoolean("tag14");
				String tag14_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag14_icon_path1");
				String tag14_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag14_icon_path2");
				boolean tag15 =rs.getBoolean("tag15");
				String tag15_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag15_icon_path1");
				String tag15_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag15_icon_path2");
				boolean tag16 =rs.getBoolean("tag16");
				String tag16_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag16_icon_path1");
				String tag16_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag16_icon_path2");
				boolean tag17 =rs.getBoolean("tag17");
				String tag17_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag17_icon_path1");
				String tag17_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag17_icon_path2");
				boolean tag18 =rs.getBoolean("tag18");
				String tag18_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag18_icon_path1");
				String tag18_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag18_icon_path2");
				boolean tag19 =rs.getBoolean("tag19");
				String tag19_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag19_icon_path1");
				String tag19_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag19_icon_path2");

				//Searchインスタンス
				Search Search = new Search(michinoeki_id, area_id, michinoeki_name,photo_path1, alt1,
						tag1,tag1_icon_path1,tag1_icon_path2,
						tag2,tag2_icon_path1,tag2_icon_path2,
						tag3,tag3_icon_path1,tag3_icon_path2,
						tag4,tag4_icon_path1,tag4_icon_path2,
						tag5,tag5_icon_path1,tag5_icon_path2,
						tag6,tag6_icon_path1,tag6_icon_path2,
						tag7,tag7_icon_path1,tag7_icon_path2,
						tag8,tag8_icon_path1,tag8_icon_path2,
						tag9,tag9_icon_path1,tag9_icon_path2,
						tag10,tag10_icon_path1,tag10_icon_path2,
						tag11,tag11_icon_path1,tag11_icon_path2,
						tag12,tag12_icon_path1,tag12_icon_path2,
						tag13,tag13_icon_path1,tag13_icon_path2,
						tag14,tag14_icon_path1,tag14_icon_path2,
						tag15,tag15_icon_path1,tag15_icon_path2,
						tag16,tag16_icon_path1,tag16_icon_path2,
						tag17,tag17_icon_path1,tag17_icon_path2,
						tag18,tag18_icon_path1,tag18_icon_path2,
						tag19,tag19_icon_path1,tag19_icon_path2
						);
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
			sql+="SELECT "
			+"M_ROAD_STATIONS.michinoeki_id,M_ROAD_STATIONS.AREA_ID,michinoeki_name,photo_path1,alt1,"
			+"tag1,tag1_icon_path1,tag1_icon_path2,tag2,tag2_icon_path1,tag2_icon_path2,tag3,tag3_icon_path1,tag3_icon_path2,tag4,tag4_icon_path1,tag4_icon_path2,tag5,tag5_icon_path1,tag5_icon_path2,tag6,tag6_icon_path1,tag6_icon_path2,tag7,tag7_icon_path1,tag7_icon_path2,tag8,tag8_icon_path1,tag8_icon_path2,tag9,tag9_icon_path1,tag9_icon_path2,tag10,tag10_icon_path1,tag10_icon_path2,"
			+"tag11,tag11_icon_path1,tag11_icon_path2,tag12,tag12_icon_path1,tag12_icon_path2,tag13,tag13_icon_path1,tag13_icon_path2,tag14,tag14_icon_path1,tag14_icon_path2,tag15,tag15_icon_path1,tag15_icon_path2,tag16,tag16_icon_path1,tag16_icon_path2,tag17,tag17_icon_path1,tag17_icon_path2,tag18,tag18_icon_path1,tag18_icon_path2,tag19,tag19_icon_path1,tag19_icon_path2";
			sql += " FROM "
					+ "M_ROAD_STATIONS "
					+ "INNER JOIN "
					+ "M_AREAS "
					+ "ON "
					+ "M_ROAD_STATIONS.AREA_ID = M_AREAS.AREA_ID "
					+ "INNER JOIN "
					+ "M_FACILITIES_INFORMATION "
					+ "ON "
					+ "M_FACILITIES_INFORMATION.MICHINOEKI_ID = M_ROAD_STATIONS.MICHINOEKI_ID ";
			sql += "WHERE ";

			for(int j=0;j<search_facilities_id.length;j++) {
				if(search_facilities_id[j]==1) {
					sql += "tag1=TRUE";
				}else if(search_facilities_id[j]==2) {
					sql += "tag2=TRUE";
				}else if(search_facilities_id[j]==3) {
					sql += "tag3=TRUE";
				}else if(search_facilities_id[j]==4) {
					sql += "tag4=TRUE";
				}else if(search_facilities_id[j]==5) {
					sql += "tag5=TRUE";
				}else if(search_facilities_id[j]==6) {
					sql += "tag6=TRUE";
				}else if(search_facilities_id[j]==7) {
					sql += "tag7=TRUE";
				}else if(search_facilities_id[j]==8) {
					sql += "tag8=TRUE";
				}else if(search_facilities_id[j]==9) {
					sql += "tag9=TRUE";
				}else if(search_facilities_id[j]==10) {
					sql += "tag10=TRUE";
				}else if(search_facilities_id[j]==11) {
					sql += "tag11=TRUE";
				}else if(search_facilities_id[j]==12) {
					sql += "tag12=TRUE";
				}else if(search_facilities_id[j]==13) {
					sql += "tag13=TRUE";
				}else if(search_facilities_id[j]==14) {
					sql += "tag14=TRUE";
				}else if(search_facilities_id[j]==15) {
					sql += "tag15=TRUE";
				}else if(search_facilities_id[j]==16) {
					sql += "tag16=TRUE";
				}else if(search_facilities_id[j]==17) {
					sql += "tag17=TRUE";
				}else if(search_facilities_id[j]==18) {
					sql += "tag18=TRUE";
				}else if(search_facilities_id[j]==19) {
					sql += "tag19=TRUE";
				}
				//リストの終わりの場合　後に続く要素はない
				if(search_facilities_id.length==j+1) {
				}else {
				//リストの終わりでは無い場合　後に続く検索条件
					sql += " OR ";
				}
			}
			//SQL命令を準備する
			PreparedStatement pStmt = conn.prepareStatement(sql);
			//SQL命令を発行する
			ResultSet rs = pStmt.executeQuery();
			//読み込んだレコードを処理する
			while (rs.next()) {
				int michinoeki_id = rs.getInt("michinoeki_id");
				int area_id = rs.getInt("area_id");
				String michinoeki_name = rs.getString("michinoeki_name");
				String alt1 = rs.getString("alt1");
				String photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				boolean tag1 =rs.getBoolean("tag1");
				String tag1_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag1_icon_path1");
				String tag1_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag1_icon_path2");
				boolean tag2 =rs.getBoolean("tag2");
				String tag2_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag2_icon_path1");
				String tag2_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag2_icon_path2");
				boolean tag3 =rs.getBoolean("tag3");
				String tag3_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag3_icon_path1");
				String tag3_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag3_icon_path2");
				boolean tag4 =rs.getBoolean("tag4");
				String tag4_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag4_icon_path1");
				String tag4_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag4_icon_path2");
				boolean tag5 =rs.getBoolean("tag5");
				String tag5_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag5_icon_path1");
				String tag5_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag5_icon_path2");
				boolean tag6 =rs.getBoolean("tag6");
				String tag6_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag6_icon_path1");
				String tag6_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag6_icon_path2");
				boolean tag7 =rs.getBoolean("tag7");
				String tag7_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag7_icon_path1");
				String tag7_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag7_icon_path2");
				boolean tag8 =rs.getBoolean("tag8");
				String tag8_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag8_icon_path1");
				String tag8_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag8_icon_path2");
				boolean tag9 =rs.getBoolean("tag9");
				String tag9_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag9_icon_path1");
				String tag9_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag9_icon_path2");
				boolean tag10 =rs.getBoolean("tag10");
				String tag10_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag10_icon_path1");
				String tag10_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag10_icon_path2");
				boolean tag11 =rs.getBoolean("tag11");
				String tag11_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag11_icon_path1");
				String tag11_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag11_icon_path2");
				boolean tag12 =rs.getBoolean("tag12");
				String tag12_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag12_icon_path1");
				String tag12_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag12_icon_path2");
				boolean tag13 =rs.getBoolean("tag13");
				String tag13_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag13_icon_path1");
				String tag13_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag13_icon_path2");
				boolean tag14 =rs.getBoolean("tag14");
				String tag14_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag14_icon_path1");
				String tag14_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag14_icon_path2");
				boolean tag15 =rs.getBoolean("tag15");
				String tag15_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag15_icon_path1");
				String tag15_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag15_icon_path2");
				boolean tag16 =rs.getBoolean("tag16");
				String tag16_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag16_icon_path1");
				String tag16_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag16_icon_path2");
				boolean tag17 =rs.getBoolean("tag17");
				String tag17_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag17_icon_path1");
				String tag17_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag17_icon_path2");
				boolean tag18 =rs.getBoolean("tag18");
				String tag18_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag18_icon_path1");
				String tag18_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag18_icon_path2");
				boolean tag19 =rs.getBoolean("tag19");
				String tag19_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag19_icon_path1");
				String tag19_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag19_icon_path2");

				//Searchインスタンス
				Search Search = new Search(michinoeki_id, area_id, michinoeki_name,photo_path1, alt1,
						tag1,tag1_icon_path1,tag1_icon_path2,
						tag2,tag2_icon_path1,tag2_icon_path2,
						tag3,tag3_icon_path1,tag3_icon_path2,
						tag4,tag4_icon_path1,tag4_icon_path2,
						tag5,tag5_icon_path1,tag5_icon_path2,
						tag6,tag6_icon_path1,tag6_icon_path2,
						tag7,tag7_icon_path1,tag7_icon_path2,
						tag8,tag8_icon_path1,tag8_icon_path2,
						tag9,tag9_icon_path1,tag9_icon_path2,
						tag10,tag10_icon_path1,tag10_icon_path2,
						tag11,tag11_icon_path1,tag11_icon_path2,
						tag12,tag12_icon_path1,tag12_icon_path2,
						tag13,tag13_icon_path1,tag13_icon_path2,
						tag14,tag14_icon_path1,tag14_icon_path2,
						tag15,tag15_icon_path1,tag15_icon_path2,
						tag16,tag16_icon_path1,tag16_icon_path2,
						tag17,tag17_icon_path1,tag17_icon_path2,
						tag18,tag18_icon_path1,tag18_icon_path2,
						tag19,tag19_icon_path1,tag19_icon_path2
						);
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
			sql+="SELECT "
			+"M_ROAD_STATIONS.michinoeki_id,M_ROAD_STATIONS.AREA_ID,michinoeki_name,photo_path1,alt1,"
			+"tag1,tag1_icon_path1,tag1_icon_path2,tag2,tag2_icon_path1,tag2_icon_path2,tag3,tag3_icon_path1,tag3_icon_path2,tag4,tag4_icon_path1,tag4_icon_path2,tag5,tag5_icon_path1,tag5_icon_path2,tag6,tag6_icon_path1,tag6_icon_path2,tag7,tag7_icon_path1,tag7_icon_path2,tag8,tag8_icon_path1,tag8_icon_path2,tag9,tag9_icon_path1,tag9_icon_path2,tag10,tag10_icon_path1,tag10_icon_path2,"
			+"tag11,tag11_icon_path1,tag11_icon_path2,tag12,tag12_icon_path1,tag12_icon_path2,tag13,tag13_icon_path1,tag13_icon_path2,tag14,tag14_icon_path1,tag14_icon_path2,tag15,tag15_icon_path1,tag15_icon_path2,tag16,tag16_icon_path1,tag16_icon_path2,tag17,tag17_icon_path1,tag17_icon_path2,tag18,tag18_icon_path1,tag18_icon_path2,tag19,tag19_icon_path1,tag19_icon_path2";
			sql += " FROM "
					+ "M_ROAD_STATIONS "
					+ "INNER JOIN "
					+ "M_AREAS "
					+ "ON "
					+ "M_ROAD_STATIONS.AREA_ID = M_AREAS.AREA_ID "
					+ "INNER JOIN "
					+ "M_FACILITIES_INFORMATION "
					+ "ON "
					+ "M_FACILITIES_INFORMATION.MICHINOEKI_ID = M_ROAD_STATIONS.MICHINOEKI_ID ";
			sql += "WHERE ";

			for(int i=0;i<search_area_id.length;i++) {
				//エリアIDが「1」の場合
				if(search_area_id[i]==1) {
					sql += "M_ROAD_STATIONS.AREA_ID=1 AND ";
					//複数の施設IDが選択された場合
					for(int j=0;j<search_facilities_id.length;j++) {
						if(search_facilities_id[j]==1) {
							sql += "tag1=TRUE";
						}else if(search_facilities_id[j]==2) {
							sql += "tag2=TRUE";
						}else if(search_facilities_id[j]==3) {
							sql += "tag3=TRUE";
						}else if(search_facilities_id[j]==4) {
							sql += "tag4=TRUE";
						}else if(search_facilities_id[j]==5) {
							sql += "tag5=TRUE";
						}else if(search_facilities_id[j]==6) {
							sql += "tag6=TRUE";
						}else if(search_facilities_id[j]==7) {
							sql += "tag7=TRUE";
						}else if(search_facilities_id[j]==8) {
							sql += "tag8=TRUE";
						}else if(search_facilities_id[j]==9) {
							sql += "tag9=TRUE";
						}else if(search_facilities_id[j]==10) {
							sql += "tag10=TRUE";
						}else if(search_facilities_id[j]==11) {
							sql += "tag11=TRUE";
						}else if(search_facilities_id[j]==12) {
							sql += "tag12=TRUE";
						}else if(search_facilities_id[j]==13) {
							sql += "tag13=TRUE";
						}else if(search_facilities_id[j]==14) {
							sql += "tag14=TRUE";
						}else if(search_facilities_id[j]==15) {
							sql += "tag15=TRUE";
						}else if(search_facilities_id[j]==16) {
							sql += "tag16=TRUE";
						}else if(search_facilities_id[j]==17) {
							sql += "tag17=TRUE";
						}else if(search_facilities_id[j]==18) {
							sql += "tag18=TRUE";
						}else if(search_facilities_id[j]==19) {
							sql += "tag19=TRUE";
						}
						//リストの終わりの場合　後に続く要素はない
						if(search_facilities_id.length==j+1) {
						}else {
						//リストの終わりでは無い場合　後に続く検索条件
							sql += " OR ";
						}
					}
					//複数のエリア検索をするときにORを追加
					//エリアIDが2個以上選択されていた場合　sql文に条件追加
					//エリアIDが2個以上選択されていたら[1]は最後にはならない
					if(search_area_id.length>1) {
						sql += " OR ";
					}
				}
				//エリアIDが「2」の場合
				if(search_area_id[i]==2) {
					sql += "M_ROAD_STATIONS.AREA_ID=2 AND ";
					//複数の施設IDが選択された場合
					for(int j=0;j<search_facilities_id.length;j++) {
						if(search_facilities_id[j]==1) {
							sql += "tag1=TRUE";
						}else if(search_facilities_id[j]==2) {
							sql += "tag2=TRUE";
						}else if(search_facilities_id[j]==3) {
							sql += "tag3=TRUE";
						}else if(search_facilities_id[j]==4) {
							sql += "tag4=TRUE";
						}else if(search_facilities_id[j]==5) {
							sql += "tag5=TRUE";
						}else if(search_facilities_id[j]==6) {
							sql += "tag6=TRUE";
						}else if(search_facilities_id[j]==7) {
							sql += "tag7=TRUE";
						}else if(search_facilities_id[j]==8) {
							sql += "tag8=TRUE";
						}else if(search_facilities_id[j]==9) {
							sql += "tag9=TRUE";
						}else if(search_facilities_id[j]==10) {
							sql += "tag10=TRUE";
						}else if(search_facilities_id[j]==11) {
							sql += "tag11=TRUE";
						}else if(search_facilities_id[j]==12) {
							sql += "tag12=TRUE";
						}else if(search_facilities_id[j]==13) {
							sql += "tag13=TRUE";
						}else if(search_facilities_id[j]==14) {
							sql += "tag14=TRUE";
						}else if(search_facilities_id[j]==15) {
							sql += "tag15=TRUE";
						}else if(search_facilities_id[j]==16) {
							sql += "tag16=TRUE";
						}else if(search_facilities_id[j]==17) {
							sql += "tag17=TRUE";
						}else if(search_facilities_id[j]==18) {
							sql += "tag18=TRUE";
						}else if(search_facilities_id[j]==19) {
							sql += "tag19=TRUE";
						}
						//リストの終わりの場合　後に続く要素はない
						if(search_facilities_id.length==j+1) {
						}else {
						//リストの終わりでは無い場合　後に続く検索条件
							sql += " OR ";
						}
					}
					//複数のエリア検索をするときにORを追加
					if(search_area_id.length==2 && search_area_id[i-1]==1) {

					}else {
						sql += " OR ";
					}
				}
				//エリアIDが「3」の場合
				if(search_area_id[i]==3) {
					sql += "M_ROAD_STATIONS.AREA_ID=3 AND ";
					//複数の施設IDが選択された場合
					for(int j=0;j<search_facilities_id.length;j++) {
						if(search_facilities_id[j]==1) {
							sql += "tag1=TRUE";
						}else if(search_facilities_id[j]==2) {
							sql += "tag2=TRUE";
						}else if(search_facilities_id[j]==3) {
							sql += "tag3=TRUE";
						}else if(search_facilities_id[j]==4) {
							sql += "tag4=TRUE";
						}else if(search_facilities_id[j]==5) {
							sql += "tag5=TRUE";
						}else if(search_facilities_id[j]==6) {
							sql += "tag6=TRUE";
						}else if(search_facilities_id[j]==7) {
							sql += "tag7=TRUE";
						}else if(search_facilities_id[j]==8) {
							sql += "tag8=TRUE";
						}else if(search_facilities_id[j]==9) {
							sql += "tag9=TRUE";
						}else if(search_facilities_id[j]==10) {
							sql += "tag10=TRUE";
						}else if(search_facilities_id[j]==11) {
							sql += "tag11=TRUE";
						}else if(search_facilities_id[j]==12) {
							sql += "tag12=TRUE";
						}else if(search_facilities_id[j]==13) {
							sql += "tag13=TRUE";
						}else if(search_facilities_id[j]==14) {
							sql += "tag14=TRUE";
						}else if(search_facilities_id[j]==15) {
							sql += "tag15=TRUE";
						}else if(search_facilities_id[j]==16) {
							sql += "tag16=TRUE";
						}else if(search_facilities_id[j]==17) {
							sql += "tag17=TRUE";
						}else if(search_facilities_id[j]==18) {
							sql += "tag18=TRUE";
						}else if(search_facilities_id[j]==19) {
							sql += "tag19=TRUE";
						}
						//リストの終わりの場合　後に続く要素はない
						if(search_facilities_id.length==j+1) {
						}else {
						//リストの終わりでは無い場合　後に続く検索条件
							sql += " OR ";
						}
					}
					//単体でも複数でもエリアID=3は最後になるのでOR追加文なし
				}
			}

			//SQL命令を準備する
			PreparedStatement pStmt = conn.prepareStatement(sql);

//			//?に値を代入
//			for(int i=0;i<search_area_id.length;i++) {
//				int j=0;
//				for(int k=0;k<search_facilities_id.length;k++) {
//					pStmt.setInt(j+1,search_facilities_id[k]);
//					j++;
//				}
//			}
			//SQL命令を発行する
			ResultSet rs = pStmt.executeQuery();

			//読み込んだレコードを処理する
			while (rs.next()) {
				int michinoeki_id = rs.getInt("michinoeki_id");
				int area_id = rs.getInt("area_id");
				String michinoeki_name = rs.getString("michinoeki_name");
				String alt1 = rs.getString("alt1");
				String photo_path1 = DAOConstant.UPLOADS_MICHIEKI + rs.getString("photo_path1");
				boolean tag1 =rs.getBoolean("tag1");
				String tag1_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag1_icon_path1");
				String tag1_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag1_icon_path2");
				boolean tag2 =rs.getBoolean("tag2");
				String tag2_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag2_icon_path1");
				String tag2_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag2_icon_path2");
				boolean tag3 =rs.getBoolean("tag3");
				String tag3_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag3_icon_path1");
				String tag3_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag3_icon_path2");
				boolean tag4 =rs.getBoolean("tag4");
				String tag4_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag4_icon_path1");
				String tag4_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag4_icon_path2");
				boolean tag5 =rs.getBoolean("tag5");
				String tag5_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag5_icon_path1");
				String tag5_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag5_icon_path2");
				boolean tag6 =rs.getBoolean("tag6");
				String tag6_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag6_icon_path1");
				String tag6_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag6_icon_path2");
				boolean tag7 =rs.getBoolean("tag7");
				String tag7_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag7_icon_path1");
				String tag7_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag7_icon_path2");
				boolean tag8 =rs.getBoolean("tag8");
				String tag8_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag8_icon_path1");
				String tag8_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag8_icon_path2");
				boolean tag9 =rs.getBoolean("tag9");
				String tag9_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag9_icon_path1");
				String tag9_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag9_icon_path2");
				boolean tag10 =rs.getBoolean("tag10");
				String tag10_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag10_icon_path1");
				String tag10_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag10_icon_path2");
				boolean tag11 =rs.getBoolean("tag11");
				String tag11_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag11_icon_path1");
				String tag11_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag11_icon_path2");
				boolean tag12 =rs.getBoolean("tag12");
				String tag12_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag12_icon_path1");
				String tag12_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag12_icon_path2");
				boolean tag13 =rs.getBoolean("tag13");
				String tag13_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag13_icon_path1");
				String tag13_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag13_icon_path2");
				boolean tag14 =rs.getBoolean("tag14");
				String tag14_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag14_icon_path1");
				String tag14_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag14_icon_path2");
				boolean tag15 =rs.getBoolean("tag15");
				String tag15_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag15_icon_path1");
				String tag15_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag15_icon_path2");
				boolean tag16 =rs.getBoolean("tag16");
				String tag16_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag16_icon_path1");
				String tag16_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag16_icon_path2");
				boolean tag17 =rs.getBoolean("tag17");
				String tag17_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag17_icon_path1");
				String tag17_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag17_icon_path2");
				boolean tag18 =rs.getBoolean("tag18");
				String tag18_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag18_icon_path1");
				String tag18_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag18_icon_path2");
				boolean tag19 =rs.getBoolean("tag19");
				String tag19_icon_path1 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag19_icon_path1");
				String tag19_icon_path2 = DAOConstant.UPLOADS_PICTOGRAM + rs.getString("tag19_icon_path2");

				//Searchインスタンス
				Search Search = new Search(michinoeki_id, area_id, michinoeki_name,photo_path1, alt1,
						tag1,tag1_icon_path1,tag1_icon_path2,
						tag2,tag2_icon_path1,tag2_icon_path2,
						tag3,tag3_icon_path1,tag3_icon_path2,
						tag4,tag4_icon_path1,tag4_icon_path2,
						tag5,tag5_icon_path1,tag5_icon_path2,
						tag6,tag6_icon_path1,tag6_icon_path2,
						tag7,tag7_icon_path1,tag7_icon_path2,
						tag8,tag8_icon_path1,tag8_icon_path2,
						tag9,tag9_icon_path1,tag9_icon_path2,
						tag10,tag10_icon_path1,tag10_icon_path2,
						tag11,tag11_icon_path1,tag11_icon_path2,
						tag12,tag12_icon_path1,tag12_icon_path2,
						tag13,tag13_icon_path1,tag13_icon_path2,
						tag14,tag14_icon_path1,tag14_icon_path2,
						tag15,tag15_icon_path1,tag15_icon_path2,
						tag16,tag16_icon_path1,tag16_icon_path2,
						tag17,tag17_icon_path1,tag17_icon_path2,
						tag18,tag18_icon_path1,tag18_icon_path2,
						tag19,tag19_icon_path1,tag19_icon_path2
						);
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
