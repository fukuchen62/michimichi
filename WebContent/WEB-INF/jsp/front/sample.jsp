<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト画面だよ</title>
</head>
<body>

	<table border="1">
		<c:forEach var="searchresult" items="${searchList}">
			<tr>
				<td class="stationname">${searchresult.michinoeki_name}</td>
				<td class="view_photo"><img
					src="/cafeshop/MenuEdit?menu_id=${searchresult.photo_path1}"
					alt="${searchresult.alt1}">${searchresult.michinoeki_name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>