package beans;

import java.io.Serializable;

public class FeatureList implements Serializable {
	//フィールドのカプセル化
	private int feature_id;
	private String feature_name;
	private String main_photo_path;
	private String alt;
	private String feature_list;

	//コンストラクタの定義
	public FeatureList(){}

	public FeatureList(int feature_id, String feature_name, String main_photo_path, String alt,String feature_list){

		this.feature_id = feature_id;
		this.feature_name = feature_name;
		this.main_photo_path = main_photo_path;
		this.alt = alt;
		this.feature_list = feature_list;

	}

	public int getId() {
		return feature_id;
	}

	public void setId(int feature_id) {
		this.feature_id = feature_id;
	}

	public String getName() {
		return feature_name;
	}

	public void setName(String feature_name) {
		this.feature_name = feature_name;
	}

	public String getPhotoPass() {
		return main_photo_path;
	}

	public void setPhotoPass(String main_photo_path) {
		this.main_photo_path = main_photo_path;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getFeature_list() {
		return feature_list;
	}

	public void setFeature_list(String feature_list) {
		this.feature_list = feature_list;
	}


}
