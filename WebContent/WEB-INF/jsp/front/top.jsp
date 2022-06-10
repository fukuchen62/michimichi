<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template_top.jsp">

	<c:param name="title" value="みちのえき～未知のえき～" />
	<c:param name="description" value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
										徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
										知られざる未知のスポットをご紹介します。" />
	<c:param name="mycss" value="css/index.css" />
	<c:param name="mycss2" value="" />
	<c:param name="myjs" value="js/index.js" />

	<c:param name="content">

	    <div id="keyVisual">
        <h1 class="keyVisual">
            <div class="pc">
                <div class="keyVisual-wrap">
                    <img class="keyVisual-bg" src="img/index/key_visual_pc_bg.jpg" alt="keyVisual_pc_bg">
                    <img class="keyVisual-map" src="img/index/tokushima_map_pc.png" alt="keyVisual_pc">
                </div>
                <p class="catch-copy">道の駅で、<br>
                    満ちる
                    <span>HOUR</span>
                    (アワー)
                </p>
                <div class="logo">
                    <img src="img/logo/mainlogo.png" alt="logo_pc">
                </div>
            </div>

            <div class="sp">
                <div class="keyVisual-wrap">
                    <img class="keyVisual-bg" src="img/index/key_visual_tabbg.jpg" alt="keyVisual_sp_bg">
                    <img class="keyVisual-map" src="img/index/tokushima_map_tab.png" alt="keyVisual_sp">
                </div>
                <p class="catch-copy">道の駅で、<br>
                    満ちる
                    <span>HOUR</span>
                    (アワー)
                </p>
            </div>
        </h1>

        <div class="search-links">
            <form class="form" action="">
                <input id="west-link" type="submit" name="west" value="東の駅はこちら">
            </form>
            <form class="form" action="">
                <input id="east-link" type="submit" name="east" value="西の駅はこちら">
            </form>
            <form class="form" action="">
                <input id="south-link" type="submit" name="south" value="南の駅はこちら">
            </form>
        </div>
    </div>

    <section id="top-search">
        <h2 class="sp">
            <img src="img/temp/top_h2sp.svg" alt="">
            <span>検索</span>
        </h2>

        <div class="container">
            <h2 class="pc">
                <img src="img/temp/top_h2pc.svg" alt="">
                <span>検索</span>
            </h2>

            <div class="grid-search grid wrap">
                <c:forEach var="list" items="${TSList}" end="5">
	                <div class="items">
	                	<a href="CtrlForFront?pge_id=9&con_id=${list.michinoeki_id}">
	            	        <img src="${list.photo_thum_path1}" alt="${list.alt1}">
	                    	<p class="center">${list.michinoeki_name}</p>
	                	</a>
	                </div>
                </c:forEach>
                <!-- grid-search end -->
            </div>

            <a class="btn btn-top-search" href="CtrlForFront?pge_id=2">
                <img src="img/temp/button01.svg" alt="btn-search">
                <span>検索へ</span>
            </a>
        </div>
    </section>

    <section id="pickup">
        <h2 class="sp">
            <img src="img/temp/top_h2sp.svg" alt="">
            <span>特集</span>
        </h2>

        <div class="container">
            <h2 class="pc">
                <img src="img/temp/top_h2pc.svg" alt="">
                <span>特集</span>
            </h2>
            <div class="pc">
                <div class="grid-pickup grid wrap">
                    <c:forEach var="list" items="${TLList}" end="2">
                        <div class="items">
                            <!-- <c:set var="itemType" value="${featureImg_random}" /> -->
                            <a href="CtrlForFront?pge_id=4&con_id=${list.feature_id}">
                               <!--
                               <%
                                    //0,1,2の乱数を作成
                                    int select = (int) Math.random() * 3;
                                %>

                                <% if(select == 0) {%>
                                    <img src="${list.photo_path1}" alt="${list.alt1}">
                                <% }else if(select == 1) {%>
                                    <img src="${list.photo_path2}" alt="${list.alt2}">
                                <% }else {%>
                                    <img src="${list.photo_path3}" alt="${list.alt3}">
                                <% }%>
                                -->
                                <img src="${list.photo_path1}" alt="${list.alt1}">
                            </a>
                            <p class="center">${list.feature_name}</p>
                        </div>
                    </c:forEach>
                </div>
                <!-- grid-pickup end -->
            </div>

            <div class="sp">
                <div class="grid-pickup grid wrap">
                    <c:forEach var="list" items="${TLList}" end="3">
                        <div class="items">
                            <!-- <c:set var="itemType" value="${featureImg_random}" /> -->
                            <a href="CtrlForFront?pge_id=4&con_id=${list.feature_id}">

                                <!-- <%
                                    //0,1,2の乱数を作成
                                    int select = (int) Math.random() * 3;
                                %>

                                <% if(select == 0) {%>
                                    <img src="${list.photo_path1}" alt="${list.alt1}">
                                <% }else if(select == 1) {%>
                                    <img src="${list.photo_path2}" alt="${list.alt2}">
                                <% }else {%>
                                    <img src="${list.photo_path3}" alt="${list.alt3}">
                                <% }%> -->
                                <img src="${list.photo_path1}" alt="${list.alt1}">
                            </a>
                            <p class="center">${list.feature_name}</p>
                        </div>
                    </c:forEach>
                </div>
                <!-- grid-pickup end -->
            </div>

            <a class="btn btn-pickup" href="CtrlForFront?pge_id=3">
                <img src="img/temp/button01.svg" alt="btn-search">
                <span>特集一覧へ</span>
            </a>
        </div>
    </section>

    <section id="sns">
        <h2 class="sp">
            <img src="img/temp/top_h2sp.svg" alt="">
            <span>SNS(instagram)</span>
        </h2>

        <div class="container">
            <h2 class="pc">
                <img src="img/temp/top_h2pc.svg" alt="">
                <span>SNS(instagram)</span>
            </h2>

            <div class="grid-sns grid wrap">
                <div class="items">
                    <img src="img/dammy/donari.jpg" alt="sns_01">
                </div>

                <div class="items">
                    <img src="img/dammy/hiwasa.jpg" alt="sns_02">
                </div>

                <div class="items">
                    <img src="img/dammy/momijigawa.jpg" alt="sns_03">
                </div>

                <div class="items">
                    <img src="img/dammy/sadamitsu.jpg" alt="sns_04">
                </div>

                <div class="items">
                    <img src="img/dammy/shishikui.jpg" alt="sns_05">
                </div>

                <div class="items">
                    <img src="img/dammy/wajiki.jpg" alt="sns_06">
                </div>

                <div class="items">
                    <img src="img/dammy/donari.jpg" alt="sns_07">
                </div>

                <div class="items">
                    <img src="img/dammy/hiwasa.jpg" alt="sns_08">
                </div>

                <div class="items">
                    <img src="img/dammy/momijigawa.jpg" alt="sns_09">
                </div>

                <div class="items">
                    <img class="pc" src="img/dammy/sadamitsu.jpg" alt="sns_10">
                </div>

                <div class="items">
                    <img class="pc" src="img/dammy/shishikui.jpg" alt="sns_11">
                </div>

                <div class="items">
                    <img class="pc" src="img/dammy/wajiki.jpg" alt="sns_12">
                </div>

                <div class="items">
                    <img class="pc" src="img/dammy/donari.jpg" alt="sns_13">
                </div>

                <div class="items">
                    <img class="pc" src="img/dammy/hiwasa.jpg" alt="sns_14">
                </div>

                <div class="items">
                    <img class="pc" src="img/dammy/momijigawa.jpg" alt="sns_15">
                </div>


                <!-- grid-sns end -->
            </div>

            <a class="btn btn-sns" href="">
                <img src="img/temp/button02.svg" alt="btn-search">
                <span>#徳島　#道の駅で検索しよう！</span>
            </a>
        </div>
    </section>
	</c:param>
</c:import>
