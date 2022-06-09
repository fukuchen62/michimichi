<%@page pageEncoding="UTF-8" contentType="text/html" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template_back.jsp">

	<c:param name="title" value="特集記事一覧" />
	<c:param name="keywords" value="" />
	<c:param name="description" value="description。description" />
	<c:param name="mycss" value="" />
	<c:param name="mycss2" value="" />
	<c:param name="myjs" value="js/vendor/lightbox_plus.js" />

	<c:param name="content">

		<div id="wrap">
			<p id="login">
				<c:out value="${loginUser.login_id }" />
				さまオンライン中 <a href="/michimichi/Logout">ログアウト</a>
			</p>

			<section>
				<h2>記事一覧</h2>
				<p class="btn">
					<input class="btns btn-send" type="button" value="新規登録"
						onClick="location.href='/michimichi/CtrlForCms?pge_id=16'">
				</p>
				<table class="entryForm">
					<tr>
						<th class="subtitle" width="5%"></th>
						<th class="subtitle" width="18%">日時</th>
						<th class="subtitle" width="10%">発信者</th>
						<th class="subtitle" width="25%">タイトル</th>
						<th class="subtitle" width="40%">概要</th>
					</tr>
					<c:forEach var="post" items="${featureList}" end="20">
						<tr>
							<td class="show"><c:choose>
									<c:when test="${feature.show_flag==1}">
										<button class="btnshow btnRed"
											onclick="featureShowChange( ${feature.feature_type_id },${feature.show_flag},'${feature.title }');">表</button>
									</c:when>
									<c:otherwise>
										<button class="btnshow btnBlue"
											onclick="featureShowChange( ${feature.feature_type_id },${feature.show_flag},'${feature.title }');">非</button>
									</c:otherwise>
								</c:choose></td>

							<td class="time"><fmt:formatDate type="time"
									value="${feature.createtime}" pattern="yyyy/MM/dd HH:mm" /></td>
							<td class="name">${feature.name}</td>
							<td class="title"><a
								href="/michimichi/FeatureEdit?feature_type_id=${feature.feature_type_id }">${feature.title}</a>
							<td class="post">${fn:escapeXml(feature.summary)}</td>
						</tr>
					</c:forEach>
				</table>
			</section>

			<div id="opbtns">
				<a href="/michimichi/CtrlForCms?pge_id=13">管理者ページへ</a>
			</div>
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
					<form id="modal-input" action="/michimichi/FeatureEdit"
						method="get">
						<input type="hidden" name="feature_id" id="feature_id"> <input
							type="hidden" name="showflag" id="showflag"> <input
							type="hidden" name="fnc" id="fnc"> <input type="submit"
							id="modal-send" value="サーバーに送信">
					</form>
				</div>
			</div>
		</div>

	</c:param>
</c:import>