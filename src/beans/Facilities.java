package beans;

public class Facilities {

	//m_tages（タグマスター）
	private int tages_id;
	private String category_name;
	private String tages_photo_path;
	private String tages_alt;
	private String icon_path1;
	private String icon_path2;

	//m_facilities（道の駅の施設、周辺施設マスター）
	private int facilities_id;
	private boolean status;



	//タグ（Facility）管理用
	public Facilities(int tages_id, String category_name, String tages_photo_path, String tages_alt, String icon_path1, String icon_path2,
					int facilities_id, boolean status){
		//m_tages
		this.tages_id = tages_id;
		this.category_name = category_name;
		this.tages_photo_path = tages_photo_path;
		this.tages_alt = tages_alt;
		this.icon_path1 = icon_path1;
		this.icon_path2 = icon_path2;

		//m_facilities
		this.facilities_id = facilities_id;
		this.status = status;
	}



	public int getTages_id() {
		return tages_id;
	}



	public void setTages_id(int tages_id) {
		this.tages_id = tages_id;
	}



	public String getCategory_name() {
		return category_name;
	}



	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}



	public String getTages_photo_path() {
		return tages_photo_path;
	}



	public void setTages_photo_path(String tages_photo_path) {
		this.tages_photo_path = tages_photo_path;
	}



	public String getTages_alt() {
		return tages_alt;
	}



	public void setTages_alt(String tages_alt) {
		this.tages_alt = tages_alt;
	}



	public String getIcon_path1() {
		return icon_path1;
	}



	public void setIcon_path1(String icon_path1) {
		this.icon_path1 = icon_path1;
	}



	public String getIcon_path2() {
		return icon_path2;
	}



	public void setIcon_path2(String icon_path2) {
		this.icon_path2 = icon_path2;
	}



	public int getFacilities_id() {
		return facilities_id;
	}



	public void setFacilities_id(int facilities_id) {
		this.facilities_id = facilities_id;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}


}