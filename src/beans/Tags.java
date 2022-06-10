package beans;

public class Tags {

	private int tages_id;
	private String category_name;
	private String photo_path;
	private String alt;
	private String icon_path1;
	private String icon_path2;
	private int show_flag;


	//コンストラクタの定義
		public Tags(){}

		//フルバージョン
		public Tags(int tages_id, String category_name, String photo_path, String alt, String icon_path1, String icon_path2, int show_flag){
			this.tages_id = tages_id;
			this.category_name = category_name;
			this.photo_path = photo_path;
			this.alt = alt;
			this.icon_path1 = icon_path1;
			this.icon_path2 = icon_path2;
			this.show_flag = show_flag;
		}

		//検索ページ（SP）表示用
		public Tags(int tages_id, String category_name, String alt, String icon_path1){
			this.tages_id = tages_id;
			this.category_name = category_name;
			this.alt = alt;
			this.icon_path1 = icon_path1;
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

		public String getPhoto_path() {
			return photo_path;
		}

		public void setPhoto_path(String photo_path) {
			this.photo_path = photo_path;
		}

		public String getAlt() {
			return alt;
		}

		public void setAlt(String alt) {
			this.alt = alt;
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

		public int getShow_flag() {
			return show_flag;
		}

		public void setShow_flag(int show_flag) {
			this.show_flag = show_flag;
		}


}
