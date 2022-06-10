<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト画面だよ</title>
</head>
<body>


	<c:forEach var="searchresult" items="${searchList}">
			<!--<tr>
				<td class="stationname">${searchresult.michinoeki_name}</td>
				<td class="view_photo"><img src="/cafeshop/MenuEdit?menu_id=${searchresult.photo_path1}"alt="${searchresult.alt1}">
				${searchresult.michinoeki_name}</td>
			</tr>-->
		     <div class="grid">
                <div class="search-result-indi checked">
                    <img class="img" src="${searchresult.photo_path1}" alt="${searchresult.alt1}">

                    <p class="title center">${searchresult.michinoeki_name}</p>

                    <div class="pictgram">
                        <div class="pict-facility">
                            設備
                            <hr class="hr-style">
                            <div class="pict-area"></div>
                        </div>

                        <div class="pict-around">
                            周辺施設
                            <hr class="hr-style">
                            <div class="pict-area"></div>
                        </div>
                    </div>
                </div>
            </div>
	</c:forEach>

</body>
</html>