package model;

import java.util.List;

import beans.CommentBs;
import beans.Station;
import dao.M_road_stationsDAO;
import dao.T_commentsDAO;

public class CommentListLogic {

	//管理画面 道の駅一覧（昇順）
	public List<Station> getadminStaionList() {
		//DAOオブジェクト生成
		M_road_stationsDAO dao = new M_road_stationsDAO();
		//DBから全レコードを取得する
		List<Station> AdminStaionList = dao.getadminStaionList();
		return AdminStaionList;
	}


	//道の駅個別に入力された全てのコメントを取得
	public List<CommentBs> getAdminCommentList(int station_id) {
		//DAOオブジェクト生成
		T_commentsDAO dao = new T_commentsDAO();
		//DBから全レコードを取得する
		List<CommentBs> admincommentlist = dao.getAdminCommentsById(station_id);
		return admincommentlist;
	}

	//コメントIDによるコメント詳細を取得
	public CommentBs getCommentById(int comment_id) {
		//DAOオブジェクト生成
		T_commentsDAO dao = new T_commentsDAO();
		//DBから全レコードを取得する
		CommentBs comment = dao.getCommentById(comment_id);
		return comment;
	}



	//指定コメントの表示・非表示処理
	public boolean updateComment(int comment_id, int showflag) {
		T_commentsDAO dao = new T_commentsDAO();
		if (dao.updateComment(comment_id, showflag) != false) {
			return true;
		} else {
			return false;
		}
	}



}