package beans;

import java.util.Date;

public class CommentBs {

	//
	private int comment_id;
	private int michinoeki_id;
	private String name;
	private String comment;
	private Date post_time;
	private int show_flag;
	private Date update_time;
	private int update_user_id;
	private Date delete_time;
	private int delete_user_id;

	//m_accountsテーブル
	private int account_user_id;
	private String account_name;

	//コンストラクタの定義
		public CommentBs(){}

		//フルバージョン
		public CommentBs(
		int comment_id,int michinoeki_id,String name,String comment,Date post_time,int show_flag,Date update_time,int update_user_id,Date delete_time, int delete_user_id,
		int account_user_id, String account_name){
			this.comment_id = comment_id;
			this.michinoeki_id = michinoeki_id;
			this.name = name;
			this.comment = comment;
			this.post_time = post_time;
			this.show_flag = show_flag;
			this.update_time = update_time;
			this.update_user_id = update_user_id;
			this.delete_time = delete_time;
			this.delete_user_id = delete_user_id;

			this.account_user_id = account_user_id;
			this.account_name = account_name;

		}

		//管理画面、コメント表示非表示用
		public CommentBs(
		int comment_id,int michinoeki_id,String name,String comment,Date post_time,int show_flag,Date update_time,int update_user_id){
			this.comment_id = comment_id;
			this.michinoeki_id = michinoeki_id;
			this.name = name;
			this.comment = comment;
			this.post_time = post_time;
			this.show_flag = show_flag;
			this.update_time = update_time;
			this.update_user_id = update_user_id;
		}

		//道の駅個別ページ、一覧取得用
		public CommentBs
		(int comment_id, String name, String comment, Date post_time){
			this.comment_id = comment_id;
			this.name = name;
			this.comment = comment;
			this.post_time = post_time;
		}

		//管理画面、コメント一覧取得用
		public CommentBs
		(int comment_id, String name, String comment, Date post_time, int show_flag){
			this.comment_id = comment_id;
			this.name = name;
			this.comment = comment;
			this.post_time = post_time;
			this.show_flag = show_flag;
		}

		public int getComment_id() {
			return comment_id;
		}

		public void setComment_id(int comment_id) {
			this.comment_id = comment_id;
		}

		public int getMichinoeki_id() {
			return michinoeki_id;
		}

		public void setMichinoeki_id(int michinoeki_id) {
			this.michinoeki_id = michinoeki_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Date getPost_time() {
			return post_time;
		}

		public void setPost_time(Date post_time) {
			this.post_time = post_time;
		}

		public int getShow_flag() {
			return show_flag;
		}

		public void setShow_flag(int show_flag) {
			this.show_flag = show_flag;
		}

		public Date getUpdate_time() {
			return update_time;
		}

		public void setUpdate_time(Date update_time) {
			this.update_time = update_time;
		}

		public int getUpdate_user_id() {
			return update_user_id;
		}

		public void setUpdate_user_id(int update_user_id) {
			this.update_user_id = update_user_id;
		}

		public Date getDelete_time() {
			return delete_time;
		}

		public void setDelete_time(Date delete_time) {
			this.delete_time = delete_time;
		}

		public int getDelete_user_id() {
			return delete_user_id;
		}

		public void setDelete_user_id(int delete_user_id) {
			this.delete_user_id = delete_user_id;
		}

		public int getAccount_user_id() {
			return account_user_id;
		}

		public void setAccount_user_id(int account_user_id) {
			this.account_user_id = account_user_id;
		}

		public String getAccount_name() {
			return account_name;
		}

		public void setAccount_name(String account_name) {
			this.account_name = account_name;
		}





}
