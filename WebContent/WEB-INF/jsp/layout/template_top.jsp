<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<!-- META -->
<meta charset="utf-8">
<meta name="keywords" content="未知,未知の駅,みちのえき,道の駅,mitinoeki,徳島,tokusima,とくしま,四国,観光,温泉,遊ぶ,ツーリング,お出かけ,ドライブ,景色,家族で遊ぶ場,休息,休憩,産直市場,イベント,特産物,お土産,田舎,ご当地,インスタ映え,くるくるなると,ドイツ館,うだつの街並み,祖谷,鳴門,阿波,かずら橋">
<meta name="description" content="${param.description}">

<!-- META VIEWPOINT -->
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=2.0, user-scalable=yes" />

<!-- TITLE -->
<title>${param.title}</title>

<!-- font M PLUS Rounded 1c & Quicksand-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=M+PLUS+Rounded+1c:wght@100;300;400;500;700;800;900&family=Quicksand:wght@300;400;500;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,700,0,0" />

<!-- icon font -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,1,0" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">

<!-- CSS -->
<link href="<c:url value='css/reset.css'/>" rel="stylesheet">
<link href="<c:url value='css/format.css'/>" rel="stylesheet">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/footer.css">
<link rel="stylesheet" href="css/scroll_top.css">

<!-- 独自のCSS -->
<c:if test="${!empty param.mycss}">
	<link href="<c:url value="${param.mycss}" />" rel="stylesheet">
</c:if>
<c:if test="${!empty param.mycss2}">
	<link href="<c:url value="${param.mycss2}" />" rel="stylesheet">
</c:if>
<c:if test="${!empty param.mycss3}">
	<link href="<c:url value="${param.mycss3}" />" rel="stylesheet">
</c:if>

<!-- JS LINK -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.9.0/slick-theme.css">


<!-- ローカルJS -->
<%-- js/script.jsは、～より下部で読み込む必要があるため、 --%>
<script src="<c:url value="js/script.js" />"></script>
<script src="js/header.js"></script>
<script src="js/footer.js"></script>
<script src="js/scroll_top.js"></script>

<!-- 独自のJS -->
<c:if test="${!empty param.myjs}">
	<script src="<c:url value="${param.myjs}" />"></script>
</c:if>
<c:if test="${!empty param.myjs2}">
	<script src="<c:url value="${param.myjs2}" />"></script>
</c:if>
<c:if test="${!empty param.myjs3}">
	<script src="<c:url value="${param.myjs3}" />"></script>
</c:if>


<!-- icon -->
<link rel="apple-touch-icon" href="apple-touch-icon.png">
<link rel="icon" href="favicon.ico">
<link rel="apple-touch-icon" sizes="152x152" href="apple_touch_icon_152.png">
<link rel="icon" type="image/png" sizes="16x16" href="favicon_16.ico">
<link rel="icon" type="image/png" sizes="32x32" href="favicon_32.ico">

</head>
<body>
	<jsp:include page="scroll_top.jsp" />
	<jsp:include page="header_top.jsp" />
	<div>${param.content}</div>
	<jsp:include page="footer_front.jsp" />
</body>
</html>