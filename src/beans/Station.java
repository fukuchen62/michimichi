package beans;

public class Station {

	//フィールドのカプセル化
	//m_road_stationsから（道の駅マスター）
	private int michinoeki_id;
	private String michinoeki_name;
	private String photo_path1;
	private String photo_thum_path1;
	private String alt1;
	private String photo_path2;
	private String photo_thum_path2;
	private String alt2;
	private String photo_path3;
	private String photo_thum_path3;
	private String alt3;
	private String photo_path4;
	private String photo_thum_path4;
	private String alt4;
	private String explanation;

	private String post_code;
	private String address;
	private String tel;
	private String parking;
	private String service_time;
	private String closed;
	private String url;

	private String gas_station;
	private String hospital;
	private String near_station;

	private String iframe_src;

	private String feature1_photo_path;
	private String feature1_alt;
	private String feature1_overview;
	private String feature2_photo_path;
	private String feature2_alt;
	private String feature2_overview;

	private int feature_banner1;
	private int feature_banner2;
	private int feature_banner3;

	//m_recommendsから（おすすめマスター）
	private int recommend_id;
	private String recommend_name;
	private String recommend_photo_path;
	private String recommend_alt;
	private String recommed_overview;

	//m_spotsから（周辺スポットマスター）
	private int spot_id;
	private String spot_name;
	private String spot_photo_path1;
	private String spot_alt1;
	private String spot_photo_path2;
	private String spot_alt2;
	private String spot_photo_path3;
	private String spot_alt3;
	private String spot_overview;
	private String spot_address;
	private String spot_url;

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

	//t_good_recordsから（いいねテーブル）
	private int good_id;
	private String user_ip_address;


	//コンストラクタの定義
	public Station(){}

	//TOP　検索sectionの道の駅個別リンク用
	public Station(int michinoeki_id, String michinoeki_name, String photo_thum_path1, String alt1){
		this.michinoeki_id = michinoeki_id;
		this.michinoeki_name = michinoeki_name;
		this.photo_thum_path1 = photo_thum_path1;
		this.alt1 = alt1;
	}

	//道の駅個別　基本情報
	public Station(
			//m_road_stationsから（道の駅マスター）
			int michinoeki_id, String michinoeki_name, String photo_path1, String photo_thum_path1, String alt1, String photo_path2, String photo_thum_path2, String alt2, String photo_path3, String photo_thum_path3, String alt3, String photo_path4, String photo_thum_path4, String alt4, String explanation,

			 String post_code, String address, String tel, String parking, String service_time, String closed, String url,

			 String gas_station, String hospital, String near_station,

			 String iframe_src,

			 String feature1_photo_path, String feature1_alt, String feature1_overview, String feature2_photo_path, String feature2_alt, String feature2_overview,

			 int feature_banner1, int feature_banner2, int feature_banner3
			){

		//m_road_stationsから（道の駅マスター）
		this.michinoeki_id = michinoeki_id;
		this.michinoeki_name = michinoeki_name;
		this.photo_path1 = photo_path1;
		this.photo_thum_path1 = photo_thum_path1;
		this.alt1 = alt1;
		this.photo_path2 = photo_path2;
		this.photo_thum_path2 = photo_thum_path2;
		this.alt2 = alt2;
		this.photo_path3 = photo_path3;
		this.photo_thum_path3 = photo_thum_path3;
		this.alt3 = alt3;
		this.photo_path4 = photo_path4;
		this.photo_thum_path4 = photo_thum_path4;
		this.alt4 = alt4;
		this.explanation = explanation;

		this.post_code = post_code;
		this.address = address;
		this.tel = tel;
		this.parking = parking;
		this.service_time = parking;
		this.closed = closed;
		this.url = url;

		this.gas_station = gas_station;
		this.hospital = hospital;
		this.near_station = near_station;

		this.iframe_src = iframe_src;

		this.feature1_photo_path = feature1_photo_path;
		this.feature1_alt = feature1_alt;
		this.feature1_overview = feature1_overview;
		this.feature2_photo_path = feature2_photo_path;
		this.feature2_alt = feature2_alt;
		this.feature2_overview = feature2_overview;

		this.feature_banner1 = feature_banner1;
		this.feature_banner2 = feature_banner2;
		this.feature_banner3 = feature_banner3;

	}

	//おすすめ管理用
	public Station(
			//m_recommendsから（おすすめマスター）
			 int recommend_id, String recommend_name, String recommend_photo_path, String recommend_alt, String recommed_overview){

		//m_recommendsから（おすすめマスター）
		this.recommend_id = recommend_id;
		this.recommend_name = recommend_name;
		this.recommend_photo_path = recommend_photo_path;
		this.recommend_alt = recommend_alt;
		this.recommed_overview = recommed_overview;

	}

	//周辺スポット管理用
	public Station(
			 int spot_id, String spot_name, String spot_photo_path1, String spot_alt1, String spot_photo_path2, String spot_alt2, String spot_photo_path3, String spot_alt3, String spot_overview, String spot_address, String spot_url

			 ){
		//m_spotsから（周辺スポットマスター）
		this.spot_id = spot_id;
		this.spot_name = spot_name;
		this.spot_photo_path1 = spot_photo_path1;
		this.spot_alt1 = spot_alt1;
		this.spot_photo_path2 = spot_photo_path2;
		this.spot_alt2 = spot_alt2;
		this.spot_photo_path3 = spot_photo_path3;
		this.spot_alt3 = spot_alt3;
		this.spot_overview = spot_overview;
		this.spot_address = spot_address;
		this.spot_url = spot_url;

	}


	//タグ（Facility）管理用
	public Station(int tages_id, String category_name, String tages_photo_path, String tages_alt, String icon_path1, String icon_path2,
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


	public int getMichinoeki_id() {
		return michinoeki_id;
	}

	public void setMichinoeki_id(int michinoeki_id) {
		this.michinoeki_id = michinoeki_id;
	}

	public String getMichinoeki_name() {
		return michinoeki_name;
	}

	public void setMichinoeki_name(String michinoeki_name) {
		this.michinoeki_name = michinoeki_name;
	}

	public String getPhoto_path1() {
		return photo_path1;
	}

	public void setPhoto_path1(String photo_path1) {
		this.photo_path1 = photo_path1;
	}

	public String getPhoto_thum_path1() {
		return photo_thum_path1;
	}

	public void setPhoto_thum_path1(String photo_thum_path1) {
		this.photo_thum_path1 = photo_thum_path1;
	}

	public String getAlt1() {
		return alt1;
	}

	public void setAlt1(String alt1) {
		this.alt1 = alt1;
	}

	public String getPhoto_path2() {
		return photo_path2;
	}

	public void setPhoto_path2(String photo_path2) {
		this.photo_path2 = photo_path2;
	}

	public String getPhoto_thum_path2() {
		return photo_thum_path2;
	}

	public void setPhoto_thum_path2(String photo_thum_path2) {
		this.photo_thum_path2 = photo_thum_path2;
	}

	public String getAlt2() {
		return alt2;
	}

	public void setAlt2(String alt2) {
		this.alt2 = alt2;
	}

	public String getPhoto_path3() {
		return photo_path3;
	}

	public void setPhoto_path3(String photo_path3) {
		this.photo_path3 = photo_path3;
	}

	public String getPhoto_thum_path3() {
		return photo_thum_path3;
	}

	public void setPhoto_thum_path3(String photo_thum_path3) {
		this.photo_thum_path3 = photo_thum_path3;
	}

	public String getAlt3() {
		return alt3;
	}

	public void setAlt3(String alt3) {
		this.alt3 = alt3;
	}

	public String getPhoto_path4() {
		return photo_path4;
	}

	public void setPhoto_path4(String photo_path4) {
		this.photo_path4 = photo_path4;
	}

	public String getPhoto_thum_path4() {
		return photo_thum_path4;
	}

	public void setPhoto_thum_path4(String photo_thum_path4) {
		this.photo_thum_path4 = photo_thum_path4;
	}

	public String getAlt4() {
		return alt4;
	}

	public void setAlt4(String alt4) {
		this.alt4 = alt4;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getService_time() {
		return service_time;
	}

	public void setService_time(String service_time) {
		this.service_time = service_time;
	}

	public String getClosed() {
		return closed;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGas_station() {
		return gas_station;
	}

	public void setGas_station(String gas_station) {
		this.gas_station = gas_station;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getNear_station() {
		return near_station;
	}

	public void setNear_station(String near_station) {
		this.near_station = near_station;
	}

	public String getIframe_src() {
		return iframe_src;
	}

	public void setIframe_src(String iframe_src) {
		this.iframe_src = iframe_src;
	}

	public String getFeature1_photo_path() {
		return feature1_photo_path;
	}

	public void setFeature1_photo_path(String feature1_photo_path) {
		this.feature1_photo_path = feature1_photo_path;
	}

	public String getFeature1_alt() {
		return feature1_alt;
	}

	public void setFeature1_alt(String feature1_alt) {
		this.feature1_alt = feature1_alt;
	}

	public String getFeature1_overview() {
		return feature1_overview;
	}

	public void setFeature1_overview(String feature1_overview) {
		this.feature1_overview = feature1_overview;
	}

	public String getFeature2_photo_path() {
		return feature2_photo_path;
	}

	public void setFeature2_photo_path(String feature2_photo_path) {
		this.feature2_photo_path = feature2_photo_path;
	}

	public String getFeature2_alt() {
		return feature2_alt;
	}

	public void setFeature2_alt(String feature2_alt) {
		this.feature2_alt = feature2_alt;
	}

	public String getFeature2_overview() {
		return feature2_overview;
	}

	public void setFeature2_overview(String feature2_overview) {
		this.feature2_overview = feature2_overview;
	}

	public int getFeature_bunner1() {
		return feature_banner1;
	}

	public void setFeature_bunner1(int feature_banner1) {
		this.feature_banner1 = feature_banner1;
	}

	public int getFeature_bunner2() {
		return feature_banner2;
	}

	public void setFeature_bunner2(int feature_banner2) {
		this.feature_banner2 = feature_banner2;
	}

	public int getFeature_bunner3() {
		return feature_banner3;
	}

	public void setFeature_bunner3(int feature_banner3) {
		this.feature_banner3 = feature_banner3;
	}

	public int getRecommend_id() {
		return recommend_id;
	}

	public void setRecommend_id(int recommend_id) {
		this.recommend_id = recommend_id;
	}

	public String getRecommend_name() {
		return recommend_name;
	}

	public void setRecommend_name(String recommend_name) {
		this.recommend_name = recommend_name;
	}

	public String getRecommend_photo_path() {
		return recommend_photo_path;
	}

	public void setRecommend_photo_path(String recommend_photo_path) {
		this.recommend_photo_path = recommend_photo_path;
	}

	public String getRecommend_alt() {
		return recommend_alt;
	}

	public void setRecommend_alt(String recommend_alt) {
		this.recommend_alt = recommend_alt;
	}

	public String getRecommed_overview() {
		return recommed_overview;
	}

	public void setRecommed_overview(String recommed_overview) {
		this.recommed_overview = recommed_overview;
	}

	public int getSpot_id() {
		return spot_id;
	}

	public void setSpot_id(int spot_id) {
		this.spot_id = spot_id;
	}

	public String getSpot_name() {
		return spot_name;
	}

	public void setSpot_name(String spot_name) {
		this.spot_name = spot_name;
	}

	public String getSpot_photo_path1() {
		return spot_photo_path1;
	}

	public void setSpot_photo_path1(String spot_photo_path1) {
		this.spot_photo_path1 = spot_photo_path1;
	}

	public String getSpot_alt1() {
		return spot_alt1;
	}

	public void setSpot_alt1(String spot_alt1) {
		this.spot_alt1 = spot_alt1;
	}

	public String getSpot_photo_path2() {
		return spot_photo_path2;
	}

	public void setSpot_photo_path2(String spot_photo_path2) {
		this.spot_photo_path2 = spot_photo_path2;
	}

	public String getSpot_alt2() {
		return spot_alt2;
	}

	public void setSpot_alt2(String spot_alt2) {
		this.spot_alt2 = spot_alt2;
	}

	public String getSpot_photo_path3() {
		return spot_photo_path3;
	}

	public void setSpot_photo_path3(String spot_photo_path3) {
		this.spot_photo_path3 = spot_photo_path3;
	}

	public String getSpot_alt3() {
		return spot_alt3;
	}

	public void setSpot_alt3(String spot_alt3) {
		this.spot_alt3 = spot_alt3;
	}

	public String getSpot_overview() {
		return spot_overview;
	}

	public void setSpot_overview(String spot_overview) {
		this.spot_overview = spot_overview;
	}

	public String getSpot_adress() {
		return spot_address;
	}

	public void setSpot_adress(String spot_address) {
		this.spot_address = spot_address;
	}

	public String getSpot_url() {
		return spot_url;
	}

	public void setSpot_url(String spot_url) {
		this.spot_url = spot_url;
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

	public int getGood_id() {
		return good_id;
	}

	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}

	public String getUser_ip_address() {
		return user_ip_address;
	}

	public void setUser_ip_address(String user_ip_address) {
		this.user_ip_address = user_ip_address;
	}



}