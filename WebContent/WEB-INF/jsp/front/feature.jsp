<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">


		<c:param name="title" value="${feature.title}　―　みちのえき～未知の駅～" />

		<c:param name="description" value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
											徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
											知られざる未知のスポットをご紹介します。" />
		<c:param name="mycss" value="" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="" />

		<c:param name="content">

			<section id="menu" class="section">

				<h2 class="list">
					特集個別じゃよ～～～
				</h2>
				${feature.feature_name}

			</section>
		</c:param>


</c:import>