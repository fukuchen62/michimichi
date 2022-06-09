package beans;

import java.io.Serializable;
import java.util.Date;

public class Feature implements Serializable {

	//フィールドのカプセル化
	//t_featuresから
	private int feature_id;
	private String feature_name;
	private String main_photo_path;
	private String alt;
	private String feature_list;
	private String content;
	private String content_css;

	//m_feature_typesから
	private int feature_type_id;
	private String feature_type_name;
	private String photo_path1;
	private String alt1;
	private String photo_path2;
	private String alt2;
	private String photo_path3;
	private String alt3;

	//t_features(続き)
	private int show_flag;
	private Date create_time;
	private int create_user_id;
	private Date delete_time;
	private int delete_user_id;
	private Date update_time;
	private int update_user_id;

	//コンストラクタの定義
	public Feature() {
	}

	public Feature(int feature_id, String feature_name, String main_photo_path, String alt, String feature_list,
			String content, String content_css,
			int feature_type_id, String feature_type_name, String photo_path1, String alt1,
			String photo_path2, String alt2, String photo_path3, String alt3) {

		this.feature_id = feature_id;
		this.feature_name = feature_name;
		this.main_photo_path = main_photo_path;
		this.alt = alt;
		this.feature_list = feature_list;
		this.content = content;
		this.content_css = content_css;

		this.feature_type_id = feature_type_id;
		this.feature_type_name = feature_type_name;
		this.photo_path1 = photo_path1;
		this.alt1 = alt1;
		this.photo_path2 = photo_path2;
		this.alt2 = alt2;
		this.photo_path3 = photo_path3;
		this.alt3 = alt3;
	}

	//特集一覧用　FLList
	public Feature(int feature_id, String feature_name, String main_photo_path, String alt, String feature_list) {

		this.feature_id = feature_id;
		this.feature_name = feature_name;
		this.main_photo_path = main_photo_path;
		this.alt = alt;
		this.feature_list = feature_list;
	}

	//TOP個別リンクランダム用　TFList
	public Feature(int feature_id, String feature_name,
			int feature_type_id, String feature_type_name, String photo_path1, String alt1,
			String photo_path2, String alt2, String photo_path3, String alt3) {

		this.feature_id = feature_id;
		this.feature_name = feature_name;

		this.feature_type_id = feature_type_id;
		this.feature_type_name = feature_type_name;
		this.photo_path1 = photo_path1;
		this.alt1 = alt1;
		this.photo_path2 = photo_path2;
		this.alt2 = alt2;
		this.photo_path3 = photo_path3;
		this.alt3 = alt3;
	}

	//道の駅個別　特集リンク用　SFList
	public Feature(int feature_id, String feature_name, String main_photo_path, String alt) {

		this.feature_id = feature_id;
		this.feature_name = feature_name;
		this.main_photo_path = main_photo_path;
		this.alt = alt;
	}



	//特集単体（show_Flagまで）
		public Feature(
				int feature_id,
				String feature_name,
				int feature_type_id,
				String main_photo_path,
				String alt,
				String feature_list,
				String content,
				String content_css,
				int show_flag
				) {
			this.feature_id = feature_id;
			this.feature_name = feature_name;
			this.feature_type_id = feature_type_id;
			this.main_photo_path = main_photo_path;
			this.alt = alt;
			this.feature_list = feature_list;
			this.content = content;
			this.content_css = content_css;
			this.show_flag = show_flag;}


	//特集追加（t_features全部のやつ）
	public Feature(
			int feature_id,
			String feature_name,
			int feature_type_id,
			String main_photo_path,
			String alt,
			String feature_list,
			String content,
			String content_css,
			int show_flag,
			int create_user_id,
			Date create_time,
			int delete_user_id,
			Date delete_time,
			int update_user_id,
			Date update_time) {
		this.feature_id = feature_id;
		this.feature_name = feature_name;
		this.feature_type_id = feature_type_id;
		this.main_photo_path = main_photo_path;
		this.alt = alt;
		this.feature_list = feature_list;
		this.content = content;
		this.content_css = content_css;
		this.show_flag = show_flag;
		this.create_time = create_time;
		this.create_user_id = create_user_id;
		this.delete_time = delete_time;
		this.delete_user_id = delete_user_id;
		this.update_user_id = update_user_id;
		this.update_time = update_time;
	}

	public int getFeature_id() {
		return feature_id;
	}

	public void setFeature_id(int feature_id) {
		this.feature_id = feature_id;
	}

	public String getFeature_name() {
		return feature_name;
	}

	public void setFeature_name(String feature_name) {
		this.feature_name = feature_name;
	}

	public String getMain_photo_path() {
		return main_photo_path;
	}

	public void setMain_photo_path(String main_photo_path) {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent_css() {
		return content_css;
	}

	public void setContent_css(String content_css) {
		this.content_css = content_css;
	}

	public int getFeature_type_id() {
		return feature_type_id;
	}

	public void setFeature_type_id(int feature_type_id) {
		this.feature_type_id = feature_type_id;
	}

	public String getFeature_type_name() {
		return feature_type_name;
	}

	public void setFeature_type_name(String feature_type_name) {
		this.feature_type_name = feature_type_name;
	}

	public String getPhoto_path1() {
		return photo_path1;
	}

	public void setPhoto_path1(String photo_path1) {
		this.photo_path1 = photo_path1;
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

	public String getAlt3() {
		return alt3;
	}

	public void setAlt3(String alt3) {
		this.alt3 = alt3;
	}

	public int getshow_flag() {
		return show_flag;
	}

	public void setShow_flag(int show_flag) {
		this.show_flag = show_flag;
	}

	public Date getcreate_time() {
		return create_time;
	}

	public void setcreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getcreate_user_id() {
		return create_user_id;
	}

	public void setcreate_user_id(int create_user_id) {
		this.create_user_id = create_user_id;
	}

	public Date getupdate_time() {
		return update_time;
	}

	public void setupdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public int getupdate_user_id() {
		return update_user_id;
	}

	public void setupdate_user_id(int update_user_id) {
		this.update_user_id = update_user_id;
	}

	public Date getdelete_time() {
		return delete_time;
	}

	public void setdelete_time(Date delete_time) {
		this.delete_time = delete_time;
	}

	public int getdelete_user_id() {
		return delete_user_id;
	}

	public void setdelete_user_id(int delete_user_id) {
		this.delete_user_id = delete_user_id;
	}
}
