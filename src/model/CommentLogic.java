package model;

import java.util.List;

import beans.CommentBs;
import dao.T_commentsDAO;

public class CommentLogic {

	//指定された道の駅IDのコメント情報を取ってくる
	public List<CommentBs> getCommentsById(int showflag, int con_id) {
		//DAOオブジェクト生成
		T_commentsDAO dao = new T_commentsDAO();
		//DBから全レコードを取得する
		List<CommentBs> CommentList = dao.getCommentsById(showflag, con_id);
		return CommentList;
	}

	//入力されたコメント情報をDBに書き込む
	public boolean insertComment(int con_id, String name, String comment) {
		//DAOオブジェクト生成
		T_commentsDAO dao = new T_commentsDAO();
		if (dao.insertComment(con_id, name, comment) != false) {
			return true;
		} else {
			return false;
		}
	}


	//(管理画面用)指定された道の駅IDのコメント情報を取ってくる
	public List<CommentBs> getAdminCommentsById(int con_id) {
		//DAOオブジェクト生成
		T_commentsDAO dao = new T_commentsDAO();
		//DBから全レコードを取得する
		List<CommentBs> AdminCommentList = dao.getAdminCommentsById(con_id);
		return AdminCommentList;
	}

}
