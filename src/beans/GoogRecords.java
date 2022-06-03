package beans;

public class GoogRecords {


	//フィールドのカプセル化

	//t_good_recordsから（いいねテーブル）
	private int good_id;
	private String user_ip_address;



	//コンストラクタの定義
	public GoogRecords(){}

	public GoogRecords(
			//t_good_recordsから（いいねテーブル）
			 int good_id, String user_ip_address
			 ){

				//t_good_recordsから（いいねテーブル）
				this.good_id = good_id;
				this.user_ip_address = user_ip_address;

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
