<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">

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
                    <img class="keyVisual-map" src="img/index/tokushima_map_pc.png" alt="keyVisual_pc">
                </div>
                <div class="catch-copy"></div>
                <div class="logo"></div>
            </div>

            <div class="sp">
                <div class="keyVisual-wrap">
                    <img class="keyVisual-map" src="img/index/tokushima_map_tab.png" alt="keyVisual_sp">
                </div>
                <div class="catch-copy"></div>
            </div>
        </h1>

        <div class="search-links">
            <a href="">東の駅はこちら</a>
            <a href="">西の駅はこちら</a>
            <a href="">南の駅はこちら</a>
        </div>
    </div>

    <section id="top-search">
        <h2 class="sp">
            <img src="img/temp/top_h2sp.svg" alt="h2_sp">
            <span>検索</span>
        </h2>

        <div class="container">
            <h2 class="pc">
                <img src="img/temp/h2_01.svg" alt="h2_pc">
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
            <img src="img/temp/top_h2sp.svg" alt="h2_sp">
            <span>特集</span>
        </h2>

        <div class="container">
            <h2 class="pc">
                <img src="img/temp/h2_01.svg" alt="h2_pc">
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
            <img src="img/temp/top_h2sp.svg" alt="h2_sp">
            <span>SNS(instagram)</span>
        </h2>

        <div class="container">
            <h2 class="pc">
                <img src="img/temp/h2_01.svg" alt="h2_pc">
                <span>SNS(instagram)</span>
            </h2>

            <div class="grid-sns grid wrap">
                <div class="items">
                    <a href="https://www.instagram.com/p/CenSJEnLLkW/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_01.jpg" alt="sns_01">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenSQHgLW3_/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_02.jpg" alt="sns_02">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenSj5Krdxn/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_03.jpg" alt="sns_03">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenSw_VLgUs/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_04.jpg" alt="sns_04">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenUijyLOv6/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_05.jpg" alt="sns_05">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenUwfSLZbo/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_06.jpg" alt="sns_06">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenU9DzLKZb/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_07.jpg" alt="sns_07">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenVLHYrE8g/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_08.jpg" alt="sns_08">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenVlr4L4oD/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img src="img/sns/sns_09.jpg" alt="sns_09">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenV1iFr2ge/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img class="pc" src="img/sns/sns_10.jpg" alt="sns_10">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenWKUKLABf/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img class="pc" src="img/sns/sns_11.jpg" alt="sns_11">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenWgWUrReD/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img class="pc" src="img/sns/sns_12.jpg" alt="sns_12">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenWv5_LEvn/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img class="pc" src="img/sns/sns_13.jpg" alt="sns_13">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenXDV-LNaJ/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img class="pc" src="img/sns/sns_14.jpg" alt="sns_14">
                    </a>
                </div>

                <div class="items">
                    <a href="https://www.instagram.com/p/CenXV2zrV_C/?utm_source=ig_web_copy_link" target="_blank" rel="noopener noreferrer">
                        <img class="pc" src="img/sns/sns_15.jpg" alt="sns_15">
                    </a>
                </div>


                <!-- grid-sns end -->
            </div>

            <a class="btn btn-sns" href="https://www.instagram.com/team_tsunagu/" target="_blank" rel="noopener noreferrer">
                <img src="img/temp/button02.svg" alt="btn-search">
                <span>#徳島　#道の駅で検索しよう！</span>
            </a>
        </div>
    </section>

	</c:param>
</c:import>
