<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">

	<c:param name="title" value="特集一覧　―　みちのえき～未知のえき～" />
	<c:param name="description" value="徳島（とくしま）の道の駅、観光名所、ご当地を紹介するサイトです。
話題のくるくるなると、インスタ映え、お出かけスポット、地域の特産物など、まだまだ知らない「未知」の情報が盛りだくさん！" />
	<c:param name="mycss" value="css/feature_top.css" />
	<c:param name="mycss2" value="" />
	<c:param name="myjs" value="" />

	<c:param name="content">

	    <section id="feature-top">
        <div class="container">
            <div class="wrap">
                <div class="wrap-img">
                    <div class="feature-link-wrap">
                        <img class="pc" src="img/feature_top/feature_h1_pc1.svg" alt="feature_h1">
                        <img class="sp" src="img/feature_top/feature_h1_tab.svg" alt="feature_h1">
                        <div class="feature-link-grid pc">
                            <a href="#sweets">
                                <img src="img/feature_top/feature_link_sweets.jpg" alt="sweets">
                            </a>
                            <a href="#gift">
                                <img src="img/feature_top/feature_link_gift.jpg" alt="gift">
                            </a>
                            <a href="#attractions">
                                <img src="img/feature_top/feature_link_attractions.jpg" alt="attractions">
                            </a>
                            <a href="#hotspring">
                                <img src="img/feature_top/feature_link_hotspring.jpg" alt="hotspring">
                            </a>
                            <a href="#naruto">
                                <img src="img/feature_top/feature_link_naruto.jpg" alt="naruto">
                            </a>
                            <a href="#agourmet">
                                <img src="img/feature_top/feature_link_agourmet.jpg" alt="agourmet">
                            </a>
                            <a href="#gourmet">
                                <img src="img/feature_top/feature_link_gourmet.jpg" alt="gourmet">
                            </a>
                        </div>

                        <div class="feature-link-grid sp">
                            <div class="col-01 flexR">
                                <a href="">
                                    <img src="img/feature_top/feature_link_sweets.jpg" alt="sweets">
                                </a>
                                <a href="">
                                    <img src="img/feature_top/feature_link_gift.jpg" alt="gift">
                                </a>
                                <a href="">
                                    <img src="img/feature_top/feature_link_attractions.jpg" alt="attractions">
                                </a>
                                <a href="">
                                    <img src="img/feature_top/feature_link_hotspring.jpg" alt="hotspring">
                                </a>
                            </div>

                            <div class="col-02 flexR">
                                <a href="">
                                    <img src="img/feature_top/feature_link_naruto.jpg" alt="naruto">
                                </a>

                                <a href="">
                                    <img src="img/feature_top/feature_link_gourmet.jpg" alt="gourmet">
                                </a>
                                <a href="">
                                    <img src="img/feature_top/feature_link_agourmet.jpg" alt="agourmet">
                                </a>
                            </div>
                        </div>
                    </div>

                    <!-- row -->
                    <c:forEach var="list" items="${FLList}">
						${list.feature_list}
				    </c:forEach>


                </div>
            </div>
        </div>
    </section>

	</c:param>
</c:import>