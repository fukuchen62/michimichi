<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="beans.LoginUser"%>
<%
	LoginUser loginUser = (LoginUser) session.getAttribute("loginUser");
%>
<!DOCTYPE html">
<html>
<head>
<meta charset="UTF-8">
<link href="/michimichi/css/style-cms.css" rel="stylesheet" media="all">
<title>LoginResult</title>
</head>
<body>
	<div id="wrap">
		<jsp:include page="../layout/header_cms.jsp" />

		<%
			if (loginUser != null){
		%>

		<p>
			ようこそ <a
				href="/michimichi/AcountEdit&user_id=<%=loginUser.getLogin_id()%>">
				<%=loginUser.getLogin_id()%>
			</a> さま
		</p>

		<p>
			<a href="/michimichi/CtrlForCms"></a>
		</p>

		<%
			} else {
		%>
		<p>
			ログインに失敗しました。<br>再度ログインしてください。
		</p>
		<p>
			<a href="/michimichi/CtrlForCms?pge_id=10">LoginTOPへ</a>
		</p>
		<%
			}
		%>

		<hr>
		<br>
		<jsp:include page="../layout/footer_back2.jsp" />
	</div>
</body>
</html>