package beans;

import java.util.Date;

public class GoodRecordsBs {


	//フィールドのカプセル化

	//t_good_recordsから（いいねテーブル）
	private int good_id;
	private int michinoeki_id;
	private String user_ip_address;
	private Date create_time;

	private int good_count;


	//コンストラクタの定義
	public GoodRecordsBs(){}


	//イイネのカウント数取得用
	public GoodRecordsBs(
			int michinoeki_id,int good_count
			 ){
				this.michinoeki_id = michinoeki_id;
				this.good_count = good_count;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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

	public int getGood_count() {
		return good_count;
	}

	public void setGood_count(int good_count) {
		this.good_count = good_count;
	}

	public int getMichinoeki_id() {
		return michinoeki_id;
	}

	public void setMichinoeki_id(int michinoeki_id) {
		this.michinoeki_id = michinoeki_id;
	}



}
