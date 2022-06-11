<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<c:import url="../layout/template.jsp">


		<c:param name="title" value="このサイトについて　―　みちのえき～未知のえき～" />
		<c:param name="description" value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
知られざる未知のスポットをご紹介します。" />
		<c:param name="mycss" value="css/white_paper.css" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="js/white_paper.js" />

		<c:param name="content">

		    <section id="topView">
        <div class="container">
            <div class="topView">
                <img class="topView-img" src="img/whitepaper/wp_top_pc.jpg" alt="wp_top_pc">
            </div>
        </div>
    </section>

    <section class="container">
        <div class="whitepaper center mt80">

            <p class="whitepaper-text">
                このサイトは<br>
                国の求職者支援制度に基づく
                <br><br><br>
                「株式会社QLIP WEBシステム開発実践科2」<br>
                第4期生
                <br><br><br>
                によって2022年に制作された、<br>
                地域貢献を目的とした<br>
                徳島県の道の駅を紹介するウェブサイトです。
            </p>

            <br>

        </div>
    </section>

    <section id="disclaimer">
        <div class="disclaimer flexR around">
            <span class="disclaimer-link">免責事項</span>
            <span class="sponsorship-link">協賛</span>
        </div>
        <br><br>
        <p class="center">
            Created by Qlip WebSystemDevelopment2 [4th] Gen
        </p>
        <br><br>
    </section>

    <div class="disclaimer-modal">
        <div class="modal-text left">
            <h2 class="center">免責事項</h2>
            当サイトのコンテンツ・情報について、可能な限り正確な情報を掲載するよう努めておりますが、正確性や安全性を保証するものではありません。<br><br>
            当サイトに掲載された内容によって生じた損害等の一切の責任を負いかねますのでご了承ください。<br><br>
            当サイトからリンクやバナーなどによって他のサイトに移動した場合、移動先サイトで提供される情報、サービス等について一切の責任を負いません。
        </div>
    </div>
    <div class="sponsorship-modal">
        <div class="modal-text center">
            <h2 class="center">協賛</h2>
            美馬市役所<br>
            三好市役所<br>
            那賀町観光協会<br>
            海陽町商工観光課<br>
            美波町観光協会<br>
            阿波市観光協会<br>
            鳴門市うずしお観光協会<br>
            阿南市観光協会<br>
            神山町役場<br>
            徳島県観光情報サイト阿波ナビ
        </div>
    </div>

		</c:param>

</c:import>