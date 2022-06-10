package model;

import java.util.List;

import beans.Tags;
import dao.M_tagsDAO;


public class TagsLogic {

	//すべての記事をID降順で取得する
	public List<Tags> getSPSearchTags(int showflag){
		//DAOオブジェクト生成
		M_tagsDAO dao = new M_tagsDAO();
		//DBから全レコードを取得する
		List<Tags> SPSearchTagsList = dao.getSPSearchTags(showflag);
		return SPSearchTagsList;
	}

}
