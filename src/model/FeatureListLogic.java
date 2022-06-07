package model;

import java.util.List;

import beans.Feature;
import beans.FeatureList;
import dao.T_featuresDAO;


public class FeatureListLogic {

//	//記事一覧リストにアプリケーションスコープに追加するメソッド(いらんかも)
//	public void execute(FeatureList feature, List<FeatureList> FLList) {
//		FLList.add(0,feature);
//	}

	//記事作成時に失敗したときのメソッド（管理側）
	public void execute(FeatureList feature) {
		T_featuresDAO dao = new T_featuresDAO();
		if(dao.create(feature) == false) {

		}
	}

	//すべての記事をID降順で取得する
	public static List<Feature> getAllFeatureList(int showflag){
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> FLList = dao.getFeatureList(showflag);
		return FLList;
	}

	//TOP特集個別リンクを取得する
	public List<Feature> getAllTopFeature(int showflag){
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> TLList = dao.getTopFeature(showflag);
		return TLList;
	}

	//道の駅ページの特集個別リンクを取得する
	public List<Feature> getAllStationFeature(int showflag){
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> SFList = dao.getStationFeature(showflag);
		return SFList;
	}

}
