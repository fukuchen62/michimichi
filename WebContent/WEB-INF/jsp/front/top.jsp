<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">

	<c:param name="title" value="みちのえき～未知の駅～" />
	<c:param name="description" value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
知られざる未知のスポットをご紹介します。" />
	<c:param name="mycss" value="test.css" />
	<c:param name="mycss2" value="" />
	<c:param name="myjs" value="" />

	<c:param name="content">

		<a href="CtrlForFront?pge_id=1">TOP</a>
		<a href="CtrlForFront?pge_id=4&con_id=1">記事個別＿ID1</a>
		<a href="CtrlForFront?pge_id=10">管理ログインページ</a>
		<a href="CtrlForCms?pge_id=13">マイページ</a>
		<br/>
		<br/>

		<br/>
				<section id="menu" class="section">
			<h2 class="list">検索関係</h2>
			<ul class="pc-grid-col3 menu-list">
				<c:forEach var="list" items="${TSList}" end="5">
					<li class="col"><img src="${list.photo_thum_path1}" alt="${list.alt1}">
						<p class="menu-text">${list.feature_name}<br>
						${list.michinoeki_name}<br>
						<a href="CtrlForFront?pge_id=9&con_id=${list.michinoeki_id}">こっちじゃよ</a>
						</p></li>
				</c:forEach>

			</ul>
		</section>
		<br/>
		<a href="CtrlForFront?pge_id=2">検索へ</a>
		<br/>
		<br/>
		<h2>特集</h2>
		<br/>
		<br/>
		<a href="CtrlForFront?pge_id=3">記事一覧</a>

	</c:param>
</c:import>
