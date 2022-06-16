<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">


		<c:param name="title" value="${feature.feature_name}　―　みちのえき～未知のえき～" />

		<c:param name="description" value="徳島（とくしま）の道の駅、観光名所、ご当地を紹介するサイトです。
話題のくるくるなると、インスタ映え、お出かけスポット、地域の特産物など、まだまだ知らない「未知」の情報が盛りだくさん！" />
		<c:param name="mycss" value="css/feature_temp.css" />
		<c:param name="mycss2" value="${feature.content_css}" />
		<c:param name="myjs" value="" />

		<c:param name="content">

				${feature.content}

		</c:param>


</c:import>