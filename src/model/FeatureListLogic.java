package model;

import java.util.List;

import beans.Feature;
import dao.T_featuresDAO;

public class FeatureListLogic {

	//	//記事一覧リストにアプリケーションスコープに追加するメソッド(いらんかも)
	//	public void execute(FeatureList feature, List<FeatureList> FLList) {
	//		FLList.add(0,feature);
	//	}

	//記事作成時に失敗したときのメソッド（管理側）
	public void execute(Feature feature) {
		T_featuresDAO dao = new T_featuresDAO();
		if (dao.create(feature) == false) {
		}
	}

	//すべての記事をID降順で取得する
	public List<Feature> getFeatureList(int showflag) {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> FLList = dao.getFeatureList(showflag);
		return FLList;
	}

	//TOP特集個別リンクを取得する
	public List<Feature> getTopFeature(int showflag) {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> TLList = dao.getTopFeature(showflag);
		return TLList;
	}

	//道の駅ページの特集個別リンクを取得する
	public List<Feature> getStationFeature(int showflag) {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> SFList = dao.getStationFeature(showflag);
		return SFList;
	}

	//新規特集記事の作成
	public static boolean createFeatureList(Feature feature) {
		T_featuresDAO dao = new T_featuresDAO();
		if (dao.insert(feature) != false) {
			return true;
		} else {
			return false;
		}
	}

	//記事内容編集
	public static boolean updateFeature(Feature feature) {
		T_featuresDAO dao = new T_featuresDAO();
		if (dao.update(feature) != false) {
			return true;
		} else {
			return false;
		}
	}

	//指定の特集の表示・非表示処理
	public boolean updateFeature(int feature_id, int showflag) {
		T_featuresDAO dao = new T_featuresDAO();
		if (dao.update(feature_id, showflag) != false) {
			return true;
		} else {
			return false;
		}
	}

	//特集を１つ呼び出す。
	public Feature findFeatureById(int feature_id) {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		Feature feature = dao.findFeatureById(feature_id);
		return feature;
	}

	//特集内容の削除
	public boolean deleteFeatureList(int id) {
		T_featuresDAO dao = new T_featuresDAO();
		if (dao.delete(id) != false) {
			return true;
		} else {
			return false;
		}
	}

	public Feature getFeatureById(int feature_id) {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		Feature feature = dao.findFeatureById(feature_id);
		return feature;
	}

	//すべての記事をID降順で取得する
	public List<Feature> getAdminFeatureList() {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> adminfeaturelist = dao.getAdminFeatureList();
		return adminfeaturelist;
	}
}
