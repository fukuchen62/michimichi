<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">

	<c:param name="title" value="Cafe Leaf　美しい" />
	<c:param name="keywords" value="徳島,Coffee,Cafe Leaf" />
	<c:param name="description" value="description。description" />
	<c:param name="mycss" value="test.css" />
	<c:param name="mycss2" value="" />
	<c:param name="myjs" value="" />

	<c:param name="content">

		<a href="CtrlForFront?pge_id=1">TOP</a>
		<a href="CtrlForFront?pge_id=3">記事一覧</a>
		<a href="CtrlForFront?pge_id=4&con_id=1">記事個別＿ID1</a>

		 <main id="contents" class="contents">
				<form action="/michimichi/CtrlForSearch" method="get">
	<h2>地域</h2>
	<label>
		<input type="checkbox" name="area" value="1">東部
	</label>
	<label>
		<input type="checkbox" name="area" value="2">西部
	</label><label>
		<input type="checkbox" name="area" value="3">南部
	</label>
	<h2>施設</h2>
	<label>
		<input type="checkbox" name="facility" value="1">食事処
	</label><label>
		<input type="checkbox" name="facility" value="2">ショップ
	</label><label>
		<input type="checkbox" name="facility" value="3">介助犬
	</label><label>
		<input type="checkbox" name="facility" value="4">wifi
	</label><label>
		<input type="checkbox" name="facility" value="5">障害者向けトイレ
	</label><label>
		<input type="checkbox" name="facility" value="6">オムツ台
	</label><label>
		<input type="checkbox" name="facility" value="7">障害者用駐車場
	</label><label>
		<input type="checkbox" name="facility" value="8">ガソリンスタンド
	</label><label>
		<input type="checkbox" name="facility" value="9">EVスタンド
	</label><label>
		<input type="checkbox" name="facility" value="10">観光案内
	</label><label>
		<input type="checkbox" name="facility" value="11">温泉
	</label>
	<h2>周辺施設</h2>
	<label>
		<input type="checkbox" name="facility" value="12">コンビニ
	</label><label>
		<input type="checkbox" name="facility" value="13">ドラッグストア
	</label><label>
		<input type="checkbox" name="facility" value="14">ガソリンスタンド
	</label><label>
		<input type="checkbox" name="facility" value="15">病院
	</label><label>
		<input type="checkbox" name="facility" value="16">最寄りの駅
	</label><label>
		<input type="checkbox" name="facility" value="17">体験施設
	</label><label>
		<input type="checkbox" name="facility" value="18">温泉
	</label><label>
		<input type="checkbox" name="facility" value="19">宿泊施設
	</label>
	<br>
	<input type="submit"value="送信">
	</form>
		</main>
		<!-- main -->

	</c:param>
</c:import>
