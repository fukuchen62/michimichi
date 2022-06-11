package model;

import java.util.List;

import beans.CommentBs;
import dao.T_commentsDAO;


public class CommentLogic {

	//指定された道の駅IDのイイネのCount数を表示する
	public List<CommentBs> getCommentsById(int showflag,int con_id) {
		//DAOオブジェクト生成
		T_commentsDAO dao = new T_commentsDAO();
		//DBから全レコードを取得する
		List<CommentBs> CommentList = dao.getCommentsById(showflag,con_id);
		return CommentList;
	}

	//入力されたイイネ情報をDBに書き込む
	public boolean insertComment(int con_id,String name, String comment) {
		//DAOオブジェクト生成
		T_commentsDAO dao = new T_commentsDAO();
		if(dao.insertComment(con_id, name, comment) != false) {
			return true;
		}else {
			return false;
		}
	}

}
