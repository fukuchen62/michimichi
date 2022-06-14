<%@page pageEncoding="UTF-8" contentType="text/html" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template_back.jsp">

	<c:param name="title" value="ユーザーコメント一覧" />
	<c:param name="keywords" value="" />
	<c:param name="description" value="" />
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
					<a href="/michimichi/CtrlForCms?pge_id=19">コメント管理</a>
					<a href="/michimichi/CtrlForCms?pge_id=14">道の駅管理</a>
					<a href="/michimichi/CtrlForCms?pge_id=17">特集管理</a>
					<a href="/michimichi/CtrlForCms?pge_id=20">アカウント管理</a>
				</div>
			</section>
						<section>
				<h2>記事一覧</h2>
				<p class="btn">
					<input class="btns btn-send" type="button" value="新規登録"
						onClick="location.href='/cafeshop/PostEdit?fnc=1'">
				</p>
				<table class="entryForm">
					<tr>
						<th class="subtitle" width="5%"></th>
						<th class="subtitle" width="18%">日時</th>
						<th class="subtitle" width="10%">発信者</th>
						<th class="subtitle" width="25%">タイトル</th>
						<th class="subtitle" width="40%">概要</th>
					</tr>
					<c:forEach var="post" items="${postList}" end="20">
						<tr>
							<td class="show"><c:choose>
									<c:when test="${post.show_flag==1}">
										<button class="btnshow btnRed"
											onclick="postShowChange( ${post.post_id },${post.show_flag},'${post.title }');">表</button>
									</c:when>
									<c:otherwise>
										<button class="btnshow btnBlue"
											onclick="postShowChange( ${post.post_id },${post.show_flag},'${post.title }');">非</button>
									</c:otherwise>
								</c:choose></td>

							<td class="time"><fmt:formatDate type="time"
									value="${post.createtime}" pattern="yyyy/MM/dd HH:mm" /></td>
							<td class="name">${post.name}</td>
							<td class="title"><a
								href="/cafeshop/PostEdit?post_id=${post.post_id }">${post.title}</a>
							<td class="post">${fn:escapeXml(post.summary)}</td>
						</tr>
					</c:forEach>
				</table>
			</section>
		</div>

	</c:param>
</c:import>