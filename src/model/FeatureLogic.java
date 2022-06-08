package model;

import beans.Feature;
import beans.FeatureList;
import dao.T_featuresDAO;

public class FeatureLogic {

	//指定されたIDの記事内容を表示する
	public Feature getFeature(int con_id) {
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		Feature feature = dao.getFeature(con_id);
		return feature;
	}

	//feature_idによる特定記事を取得
	public Feature getMenuById(int id){
		//DAOオブジェクト生成
		T_featuresDAO dao = new T_featuresDAO();
		//DBから全レコードを取得する
		Feature feature = dao.findByFeatures(id);
		return feature;
	}

	//新規特集記事の作成(まだできてないからコメントアウト)
//		public boolean createPost(Feature feature) {
//			T_featuresDAO dao = new T_featuresDAO();
//			if(dao.insert(feature) != false) {
//				return true;
//			}else {
//				return false;
//			}
//		}

	//記事内容の更新
		public boolean updatePost(FeatureList feature) {
			T_featuresDAO dao = new T_featuresDAO();
			if (dao.update(feature) != false) {
				return true;
			} else {
				return false;
			}
		}

	//指定の特集の表示・非表示処理
	public boolean updateFeature(int id,int showflag) {
		T_featuresDAO dao = new T_featuresDAO();
		if(dao.update(id,showflag) != false) {
			return true;
		}else {
			return false;
		}
	}

	//特集内容の削除
		public boolean deletePost(int id) {
			T_featuresDAO dao = new T_featuresDAO();
			if (dao.delete(id) != false) {
				return true;
			} else {
				return false;
			}
		}
}
