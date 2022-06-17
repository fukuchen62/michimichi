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
					<a href="/michimichi/CtrlForCms?pge_id=19">コメント管理</a> <a
						href="/michimichi/CtrlForCms?pge_id=17">特集管理</a>
				</div>
			</section>
			<section>
				<h2>道の駅一覧</h2>
				<table class="entryForm">
					<tr>
						<th class="subtitle" width="10%">N0</th>
						<th class="subtitle" width="90%">道の駅名</th>
					</tr>
					<%
					int num = 1;
					//Integer[] commnet_count = (Integer[])request.getAttribute("comment_counts");
					%>
					<c:forEach var="post" items="${AdminStaionList}">
						<% int count = 1;  %>
						<tr>
							<td class="no" width="10%" style="text-align: center"><%=num%></td>
							<td class="title" width="90%">
							<% if(count>0){  %>
							<a
								href="CtrlForCms?pge_id=18&con_id=${post.michinoeki_id}">${post.michinoeki_name}
							</a>
							<% }else{  %>
								${post.michinoeki_name}(0)
							<% }  %>
							</td>
						</tr>
						<%
						num++;
						%>
					</c:forEach>

				</table>
			</section>

		</div>

	</c:param>
</c:import>