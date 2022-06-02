package dao;

/**
 * カテゴリページ用DAO
 *
 * null扱いのデータ表現などの揺れを吸収するためのUtilクラス
 */
public class DAOConstant {

	public final static String UPLOADS_MICHIEKI = "uploads/michieki/"; //コンテンツの画像フォルダ
	public final static String UPLOADS_OTHERS = "uploads/others/"; //コンテンツの画像フォルダ
	public final static String UPLOADS_PICTOGRAM = "uploads/pictogram/"; //コンテンツの画像フォルダ
	public final static String UPLOADS_TOPIC = "uploads/topic/"; //コンテンツの画像フォルダ

	public static final String NULL = "-";
	public static final String NULL2 = "－";

	public static String convStr(String data) {
		return isNULL(data) ? null : data;
	}

	public static String convImg(String data) {
		return isNULL(data) ? "noImage.jpg" : data;
	}

	private static boolean isNULL(String data) {
		if(data==null) return true;
		return (data.equals(NULL) || data.equals(NULL2));
	}
}