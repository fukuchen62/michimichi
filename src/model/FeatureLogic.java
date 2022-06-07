package model;

import java.util.List;

import beans.Feature;
import dao.T_featuresDAO;

public class FeatureLogic {

	//指定されたIDの記事内容を表示する
	public List<Feature> getAllFeature(int showflag, int con_id) {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		List<Feature> FList = dao.getFeature(showflag,con_id);
		return FList;
	}

	/**
	 * feature_idによる指定記事を取得
	 * @param id
	 * @return
	 */
	public Feature getMenuById(int id){
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		Feature feature = dao.findByFeatures(id);
		return feature;
	}

	/**
	 * 特集新規登録
	 * @param post
	 * @return
	 */
	public boolean createFeature(Feature feature) {
		T_featuresDAO dao = new T_featuresDAO();
		if(dao.insert(feature) != false) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 特集の内容を更新
	 * @param menu
	 * @return
	 */
	public boolean updateFeature(Feature feature) {
		T_featuresDAO dao = new T_featuresDAO();
		if(dao.update(feature) != false) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 指定の特集の表示・非表示処理
	 * @param id
	 * @param showflag
	 * @return
	 */
	public boolean updateFeature(int id,int showflag) {
		T_featuresDAO dao = new T_featuresDAO();
		if(dao.update(id,showflag) != false) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * 指定の特集を削除
	 * @param id
	 * @return
	 */
	public boolean deleteMenu(int id) {
		T_featuresDAO dao = new T_featuresDAO();
		if(dao.delete(id) != false) {
			return true;
		}else {
			return false;
		}
	}
}
