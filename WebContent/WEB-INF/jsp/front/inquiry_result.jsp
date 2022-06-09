<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<c:import url="../layout/template.jsp">


		<c:param name="title" value="お問い合わせ　―　みちのえき～未知の駅～" />
		<c:param name="description" value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
知られざる未知のスポットをご紹介します。" />
		<c:param name="mycss" value="css/inquiry_result.css" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="" />

		<c:param name="content">
		    <section id="inquiry-result">
        <div class="container">
            <h3 class="center">
                送信しました。<br><br>
                トップページへ戻ります。
            </h3>
            <br>

            <input class="btn-toTop" type="button" value="確認">
        </div>
    	</section>

		</c:param>

</c:import>