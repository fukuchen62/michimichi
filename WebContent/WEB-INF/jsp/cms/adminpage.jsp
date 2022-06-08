<%@page pageEncoding="UTF-8" contentType="text/html" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template_back.jsp">

	<c:param name="title" value="管理ページ" />
	<c:param name="keywords" value="" />
	<c:param name="description" value="description。description" />
	<c:param name="mycss" value="" />
	<c:param name="mycss2" value="" />
	<c:param name="myjs" value="js/vendor/lightbox_plus.js" />

	<c:param name="content">

		<div id="wrap">
			<p id="login">
				<c:out value="${loginUser.login_id }" />
				様ログイン中 <a href="/michimichi/Logout">ログアウト</a>
			</p>

			<section>
				<h1>管理者ページ</h1>
				<div id="opbtns">
					<a href="/michimichi/CtrlForCms?pge_id=18">コメント管理</a>
					<a href="/michimichi/CtrlForCms?pge_id=14">道の駅管理</a>
					<!--	特集一覧表示→特集新規・編集	-->
					<a href="/michimichi/CtrlForCms?pge_id=17">特集管理</a>
					<a href="/michimichi/CtrlForCms?pge_id=20">アカウント管理</a>
				</div>
			</section>
			<section>
				<h2>特集一覧</h2>
				<table class="entryForm">
					<tr>
						<th class="subtitle" width="18%">投稿日時</th>
						<th class="subtitle" width="12%">投稿者</th>
						<th class="subtitle" width="25%">特集タイトル</th>
						<th class="subtitle" width="45%">概要</th>
					</tr>
					<c:forEach var="post" items="${FeatureList}" end="20">
						<tr>
							<td class="time"><fmt:formatDate type="time"
									value="${feature.createtime}" pattern="yyyy/MM/dd HH:mm" /></td>
							<td class="name">${feature.name}</td>
							<td class="title">${feature.title}</td>
							<td class="mutter">${fn:escapeXml(feature.summary)}</td>
						</tr>
					</c:forEach>
				</table>
			</section>
		</div>

	</c:param>
</c:import>