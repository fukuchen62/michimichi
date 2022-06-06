package beans;

import java.io.Serializable;

public class Search implements Serializable {
	private int michinoeki_id;
	private int area_id;
	//private int facilities_id;
	//private int tages_id;
	private String michinoeki_name;
	private String photo_path1;
	private String alt1;
	//private String photo_path;
	//private String icon_path1;
	//private String icon_path2;

	/**
	 * コンストラクタ
	 */
	public Search() {

	}

	/**
	 * コンストラクタ
	 */
	public Search(int michinoeki_id,
			 int area_id,
			 //int facilities_id,
			 //int tages_id,
			 String michinoeki_name,
			 String photo_path1,
			 String alt1
			 //,String photo_path,
			 //String icon_path1,
			 //String icon_path2
			 ) {
		this.michinoeki_id= michinoeki_id;
		this.area_id=area_id;
		//this.facilities_id=facilities_id;
		//this.tages_id=tages_id;
		this.michinoeki_name=michinoeki_name;
		this.photo_path1=photo_path1;
		this.alt1=alt1;
		//this.photo_path=photo_path;
		//this.icon_path1=icon_path1;
		//this.icon_path2=icon_path2;

	}

	public int getMichinoeki_id() {
		return michinoeki_id;
	}

	public int getArea_id() {
		return area_id;
	}

//	public int getFacilities_id() {
//		return facilities_id;
//	}
//
//	public int getTages_id() {
//		return tages_id;
//	}

	public String getMichinoeki_name() {
		return michinoeki_name;
	}

	public String getPhoto_path1() {
		return photo_path1;
	}

	public String getAlt1() {
		return alt1;
	}

//	public String getPhoto_path() {
//		return photo_path;
//	}

//	public String getIcon_path1() {
//		return icon_path1;
//	}

//	public String getIcon_path2() {
//		return icon_path2;
//	}

	public void setMichinoeki_id(int michinoeki_id) {
		this.michinoeki_id = michinoeki_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

//	public void setFacilities_id(int facilities_id) {
//		this.facilities_id = facilities_id;
//	}

//	public void setTages_id(int tages_id) {
//		this.tages_id = tages_id;
//	}

	public void setMichinoeki_name(String michinoeki_name) {
		this.michinoeki_name = michinoeki_name;
	}

	public void setPhoto_path1(String photo_path1) {
		this.photo_path1 = photo_path1;
	}

	public void setAlt1(String alt1) {
		this.alt1 = alt1;
	}

//	public void setPhoto_path(String photo_path) {
//		this.photo_path = photo_path;
//	}

//	public void setIcon_path1(String icon_path1) {
//		this.icon_path1 = icon_path1;
//	}
//
//	public void setIcon_path2(String icon_path2) {
//		this.icon_path2 = icon_path2;
//	}
}
