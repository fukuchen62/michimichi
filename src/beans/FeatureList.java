package beans;

import java.io.Serializable;

public class FeatureList implements Serializable {
	//フィールドのカプセル化
	private int feature_type_id;
	private String feature_type_name;
	private String photo_path1;
	private String alt1;
	private String photo_path2;
	private String alt2;
	private String photo_path3;
	private String alt3;
	private String feature_list;

	//コンストラクタの定義
	public FeatureList(){}

	public FeatureList(int feature_type_id, String feature_type_name, String main_photo_path, String alt,String feature_list, String alt2, String alt3, String alt1, String photo_path2, String photo_path3, String photo_path1){

		this.feature_type_id = feature_type_id;
		this.feature_type_name = feature_type_name;
		this.photo_path1 = photo_path1;
		this.alt1 = alt1;
		this.photo_path2 = photo_path2;
		this.alt2 = alt2;
		this.photo_path3 = photo_path3;
		this.alt3 = alt3;
		this.feature_list = feature_list;

	}

	public int getFeature_id() {
		return feature_type_id;
	}

	public void setfeature_type_id(int feature_type_id) {
		this.feature_type_id = feature_type_id;
	}

	public String getFeature_name() {
		return feature_type_name;
	}

	public void setfeature_type_name(String feature_type_name) {
		this.feature_type_name = feature_type_name;
	}

	public String getphoto_path1() {
		return photo_path1;
	}

	public void setphoto_path1(String photo_path1) {
		this.photo_path1 = photo_path1;
	}

	public String getAlt1() {
		return alt1;
	}

	public void setAlt1(String alt1) {
		this.alt1 = alt1;
	}

	public String getphoto_path2() {
		return photo_path2;
	}

	public void setphoto_path2(String photo_path2) {
		this.photo_path2 = photo_path2;
	}

	public String getAlt2() {
		return alt2;
	}

	public void setAlt2(String alt2) {
		this.alt2 = alt2;
	}

	public String getphoto_path3() {
		return photo_path3;
	}

	public void setphoto_path3(String photo_path3) {
		this.photo_path3 = photo_path3;
	}

	public String getAlt3() {
		return alt3;
	}

	public void setAlt3(String alt3) {
		this.alt3 = alt3;
	}


	public String getFeature_list() {
		return feature_list;
	}

	public void setFeature_list(String feature_list) {
		this.feature_list = feature_list;
	}

}