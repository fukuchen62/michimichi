<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">
	<c:forEach var="item" items="${FList}">

		<c:param name="title" value="aaa" />
		<c:param name="description" value="description。description" />
		<c:param name="mycss" value="" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="" />

		<c:param name="content">

			<section id="menu" class="section">
				<h2 class="list">
					特集一覧じゃよ～～～
				</h2>
				<c:out value="${item}" />

			</section>

		</c:param>
	</c:forEach>
</c:import>