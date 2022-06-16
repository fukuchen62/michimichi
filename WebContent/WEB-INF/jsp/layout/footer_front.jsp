<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

    <footer id="footer">
        <div class="pc">
            <img src="img/index/footer/foot_line1.svg" alt="footer_line">
            <div class="container">
                <div class="footer-wrap flexR around">
                    <div class="left-column">
                        <div class="left-column-wrap flexC between">
                            <div class="logo">
                            	<a href="CtrlForFront?pge_id=1">
                                	<img class="img" src="img/logo/main_logo.svg" alt="footer-logo">
                                </a>
                            </div>

                            <div class="site-map flexC">
                                <a href="CtrlForFront?pge_id=1">マップ検索</a>
                                <a href="CtrlForFront?pge_id=2">検索</a>
                                <a href="CtrlForFront?pge_id=5">お問い合わせ</a>
                                <a href="CtrlForFront?pge_id=8">このHPについて</a>
                            </div>

                            <div class="sns flexR">
                            	<a href="https://twitter.com/websys41" target="_blank" rel="noopener noreferrer">
	                                <i class="bi bi-twitter"></i>
	                            </a>
                            	<a href="https://www.facebook.com/profile.php?id=100081959956254" target="_blank" rel="noopener noreferrer">
	                                <i class="bi bi-facebook"></i>
	                            </a>
	                            <a href="https://www.instagram.com/" target="_blank" rel="noopener noreferrer">
                                	<i class="bi bi-instagram"></i>
                                </a>
                                <a href="https://www.youtube.com/channel/UCEGVW46hPvYgrRTleTq9PXA" target="_blank" rel="noopener noreferrer">
                                	<i class="bi bi-youtube"></i>
                                </a>
                                <a href="https://www.tiktok.com/ja-JP?lang=ja-JP" target="_blank" rel="noopener noreferrer">
                                	<i class="bi bi-tiktok"></i>
                                </a>
                            </div>
                        </div>
                    </div>

                    <div class="right-column">
                        <div class="right-column-wrap">
                            <div class="right-column-inner">
                                <div class="map-search flexC">
                                    <div class="flexR">
                                        <span>
                                            <p>
                                                <img class="search" src="img/index/footer/search.svg" alt="search">
                                                地域別検索
                                            </p>
                                        </span>
                                        <span id="footer-west" class="dist">
                                            <p>東部</p>
                                        </span>
                                        <span id="footer-east" class="dist">
                                            <p>西部</p>
                                        </span>
                                        <span id="footer-south" class="dist">
                                            <p>南部</p>
                                        </span>
                                    </div>
                                    <div class="district-wrap">
                                        <div class="district flexR">
                                            <div class="west">
                                                <div class="img">
                                                    <img src="img/index/footer/tab_toubu.svg" alt="map-west">
                                                </div>

                                                <div class="district-list flexC">
                                                    <p>東部の道の駅</p>
                                                    <div class="dist-west">
                                                        <a href="CtrlForFront?pge_id=9&con_id=8">どなり</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=9">いたの</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=10">第九の里</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=11">くるくるなると</a>
                                                        <img src="img/temp/car01.svg" alt="">
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="east">
                                                <div class="img">
                                                    <img src="img/index/footer/tab_seibu.svg" alt="map-west">
                                                </div>

                                                <div class="district-list flexC">
                                                    <p>西部の道の駅</p>
                                                    <div>
                                                        <a href="CtrlForFront?pge_id=9&con_id=1">大歩危</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=2">にしいや</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=3">三野</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=4">みまの里</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=5">貞光ゆうゆう館</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=6">藍ランドうだつ</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=7">温泉の里神山</a>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="south">
                                                <div class="img">
                                                    <img src="img/index/footer/tab_nanbu.svg" alt="map-south">
                                                </div>

                                                <div class="district-list flexC">
                                                    <p>南部の道の駅</p>
                                                    <div>
                                                        <a href="CtrlForFront?pge_id=9&con_id=12">公方の郷なかがわ</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=13">ひなの郷かつうら</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=14">鷲の里</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=15">わじき</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=16">もみじ川温泉</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=17">日和佐</a>
                                                        <a href="CtrlForFront?pge_id=9&con_id=18">宍喰温泉</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- right-column-inner -->
                                </div>
                                <!-- right-column-inner end -->
                            </div>
                            <!-- right-column-wrap end -->
                        </div>
                        <!-- right-column end -->
                    </div>
                    <!-- footer-wrap     -->
                </div>

                <p class="copyright center">
                    Copyright All Rights Reserved Team 繋
                </p>
                <!-- container end -->
            </div>

            <img src="img/index/footer/foot_line1.svg" alt="footer_line">
            <!-- pc end -->
        </div>



        <div class="sp center">
            <img src="img/index/footer/foot_line1.svg" alt="footer_line">

            <div class="logo">
                <img class="footer-logo" src="img/logo/main_logo.svg" alt="footer-logo">
            </div>

            <br>
            <br>

            <span class="copyright">
                <small>
                    Copyright All Rights Reserved Team 繋
                </small>
            </span>

            <br>
            <br>

            <img src="img/index/footer/foot_line1.svg" alt="footer_line">
        </div>

        <!-- 管理者用ページリンク -->
        <div class="admin">
            <a href="CtrlForFront?pge_id=10" target="_blank">
                <img src="img/temp/car01.svg" alt="admin">
            </a>
        </div>
    </footer>

    <script>
    "use strict";
    $(document).ready(function(){
        function changeColors(dist){
            $("#footer-west,#footer-east,#footer-south").css({"z-index":"1"});
            if(dist == "footer-west"){
                $("#footer-west").css({"z-index":"3"});
                $(".district").css("left",0);
            }
            else if(dist == "footer-east"){
                $("#footer-east").css({"z-index":"3"});
                $(".district").css("left","-480px");
            }
            else if(dist == "footer-south"){
                $("#footer-south").css({"z-index":"3"});
                $(".district").css("left","-960px");
            }
        }

        $(".dist").click(function(){
            changeColors($(this).attr("id"));
        });

        $("#logo").click(function () {
            $("html,body").animate({
                scrollTop: 0
            }, 400, "linear");
        });
    });
    </script>