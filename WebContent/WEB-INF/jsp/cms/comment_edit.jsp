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
					<a href="/michimichi/CtrlForCms?pge_id=19">コメント管理</a>  <a
						href="/michimichi/CtrlForCms?pge_id=17">特集管理</a>
				</div>
			</section>
			<section>
				<h2>記事一覧</h2>

				<table class="entryForm">
					<tr>
						<th class="subtitle" width="5%"></th>
						<th class="subtitle" width="20%">日時</th>
						<th class="subtitle" width="20%">発信者</th>
						<th class="subtitle" width="60%">コメント</th>
					</tr>
					<c:forEach var="post" items="${AdminCommentList}">
						<tr>
							<td class="show"><c:choose>
									<c:when test="${post.show_flag==1}">
										<button class="btnshow btnRed"
											onclick="featureShowChange( ${post.comment_id },${post.show_flag},'${post.name }');">表</button>
									</c:when>
									<c:otherwise>
										<button class="btnshow btnBlue"
											onclick="featureShowChange( ${post.comment_id },${post.show_flag},'${post.name }');">非</button>
									</c:otherwise>
								</c:choose></td>

							<td class="time"><fmt:formatDate type="time"
									value="${post.post_time}" pattern="yyyy/MM/dd HH:mm" /></td>
							<td class="name">${post.name}</td>

							<td class="title" ></michimichi/comment_edit?comment_id = ${post.comment_id }> ${post.comment}</td>
						</tr>
					</c:forEach>

				</table>
			</section>
		</div>

		<!-- Trigger/Open The Modal -->
		<!-- <button id="myBtn">Open Modal</button> -->
		<!-- The Modal -->
		<div id="myModal" class="modal">
			<!-- Modal content -->
			<div class="modal-content">
				<span class="close">&times;</span>
				<h3 id="modal-title">title</h3>
				<p id="modal-detail">modal-detailmodal-detailmodal-detail</p>

				<div id="sendform">
					<form id="modal-input" action="/michimichi/CommentEdit" method="get">
						<input type="hidden" name="comment_id" id="comment_id"> <input
							type="hidden" name="showflag" id="showflag"> <input
							type="hidden" name="fnc" id="fnc"> <input type="submit"
							id="modal-send" value="サーバーに送信">
					</form>
				</div>
			</div>
		</div>

	</c:param>
</c:import>