<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<c:import url="../layout/template.jsp">


		<c:param name="title" value="${title}　―　みちのえき～未知の駅～" />
		<c:param name="description" value="${description}" />
		<c:param name="mycss" value="" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="" />

		<c:param name="content">
		        <!-- introduction -->
		        <section id="introduction">
		         	<c:forEach var="sta" items="${StationList}" >
		            <h2>
		                <!-- <img src="img/temp/station_h2_pc1.svg" srcset="img/temp/station_h2_tab.svg 1024w,
		                img/temp/station_h2_pc2.svg 1350w,
		                img/temp/station_h2_pc1.svg 1920w" alt="intro_h2"> -->
		                <span>道の駅　${sta.michinoeki_name}</span>
		            </h2>
		            <!-- コンテンツ枠 -->
		            <div class="container">
		                <div class="wrap">

		                    <!-- pc表示 -->
		                    <div class="pc">
		                        <figure>
		                            <div id="slider-v" class="slider-pro">
		                                <div class="sp-slides">
		                                    <div class="sp-slide">
		                                        <img class="sp-image" src="${sta.photo_path1}" alt="${sta.alt1}">
		                                    </div>
		                                    <div class="sp-slide">
		                                        <img class="sp-image" src="${sta.photo_path2}" alt="${sta.alt2}">
		                                    </div>
		                                    <div class="sp-slide">
		                                        <img class="sp-image" src="${sta.photo_path3}" alt="${sta.alt3}">
		                                    </div>
		                                    <div class="sp-slide">
		                                        <img class="sp-image" src="${sta.photo_path4}" alt="${sta.alt4}">
		                                    </div>
		                                </div>

		                                <div class="sp-thumbnails">
		                                    <img class="sp-thumbnail" src="${sta.photo_thum_path1}" alt="${sta.alt1}">
		                                    <img class="sp-thumbnail" src="${sta.photo_thum_path2}" alt="${sta.alt2}">
		                                    <img class="sp-thumbnail" src="${sta.photo_thum_path3}" alt="${sta.alt3}">
		                                    <img class="sp-thumbnail" src="${sta.photo_thum_path4}" alt="${sta.alt4}">
		                                </div>
		                            </div>

		                            <figcaption class="station-desc intro-desc">
		                                ${sta.explanation}

		                            </figcaption>
		                        </figure>
		                    </div>

		                    <!-- sp表示 -->
		                    <div class="sp">
		                        <figure>
		                            <!-- sp用の画像表示枠 -->
		                            <div class="slider">
		                                <div class="slide-01 parent">
		                                    <img class="img" src="img//station/donari/intro/intro01thumb.jpg" alt="">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc intro-desc">
		                                        ここに道の駅の説明文を記述する1。

		                                    </figcaption>
		                                </div>

		                                <div class="slide-02 parent">
		                                    <img class="img" src="img//station/donari/intro/intro02thumb.jpg" alt="">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc intro-desc">
		                                        アンダーグラウンド感満載の不思議スポット！<br>
		                                        インベーダーゲームを筆頭にレトロゲーム
		                                    </figcaption>
		                                </div>

		                                <div class="slide-03 parent">
		                                    <img class="img" src="img//station/donari/intro/intro03thumb.jpg" alt="">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc intro-desc">
		                                        ここに道の駅の説明文を記述する3。

		                                    </figcaption>
		                                </div>

		                                <div class="slide-04 parent">
		                                    <img class="img" src="img//station/donari/intro/intro04thumb.jpg" alt="">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc intro-desc">
		                                        ここに道の駅の説明文を記述する4。
		                                    </figcaption>
		                                </div>
		                            </div>
		                        </figure>
		                    </div>

		                    <!-- コメント、いいね -->
		                    <div class="account flexR">
		                        <a class="comment" href="#comment">コメント欄へ(10)</a>
		                        <span class="good">いいね！♡ 12</span>
		                    </div>
		                </div>
		            </div>
		            </c:forEach>
		        </section>

		        <!-- pick-up -->
		        <section id="pick-up">
		        	<c:forEach var="sta" items="${StationList}" >
		            <h2>
		                <span>特色</span>
		            </h2>

		            <div class="container">
		                <div class="wrap">
		                    <div class="pc">
		                        <figure class="flexC">
		                            <img class="img" src="${sta.feature1_photo_path}" alt="${sta.feature1_alt}">
		                            <figcaption class="station-desc pickup-desc">
										${sta.feature1_overview}
		                            </figcaption>
		                        </figure>

		                        <figure class="flexC">
		                            <img class="img" src="${sta.feature2_photo_path}" alt="${sta.feature2_alt}">
		                            <figcaption class="station-desc pickup-desc">
		                                ${sta.feature2_overview}
		                            </figcaption>
		                        </figure>
		                    </div>

		                    <div class="sp">
		                        <figure>
		                            <div class="slider">
		                                <div class="slide-01 parent">
		                                    <img class="img" src="${sta.feature1_photo_path}" alt="${sta.feature1_alt}">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc pickup-desc">
		                                        ${sta.feature1_overview}
		                                    </figcaption>
		                                </div>

		                                <div class="slide-02 parent">
		                                    <img class="img" src="${sta.feature2_photo_path}" alt="${sta.feature2_alt}">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc pickup-desc">
		                                        ${sta.feature2_overview}
		                                    </figcaption>
		                                </div>
		                            </div>
		                        </figure>

		                    </div>
		                </div>
		            </div>
		            </c:forEach>
		        </section>

		        <!-- recommend -->
		        <section id="recommend">

		            <h2>
		                <span>オススメ</span>
		            </h2>

		            <div class="container">
		                <div class="wrap">

		                    <!-- pc表示 -->

		                    <div class="pc">
		                    	<c:forEach var="rec" items="${RecommendsList}" end = "2" >
		                        <div class="upper-row">
		                            <figure class="flexC">
		                                <img class="img" src="${rec.recommend_photo_path }" alt="${rec.recommend_alt}">
		                                <figcaption class="station-desc recommend-desc">
		                                    ${rec.recommed_overview }
		                                </figcaption>
		                            </figure>
		                        </div>

		                        </c:forEach>
		                    </div>


		                    <!-- sp表示 -->

		                    <div class="sp">
		                        <ul>
		                        	<c:forEach var="rec" items="${RecommendsList}" end = "3">
		                            <li class="commodity">
		                                ${rec.recommend_name }
		                                <i class="btn-plus">
		                                    <i></i>
		                                    <i></i>
		                                </i>
		                            </li>
		                            <figure class="commodity-box">
		                                <div class="flexR">
		                                    <img class="img" src="${rec.recommend_photo_path }" alt="${rec.recommend_alt }">
		                                    <figcaption class="station-desc recommend-desc">
		                                        ${rec.recommed_overview }
		                                    </figcaption>
		                                </div>
		                            </figure>
		                            </c:forEach>
		                        </ul>
		                    </div>

		                </div>
		            </div>

		        </section>

		        <!-- spot -->
		        <section id="spot">
		            <h2>
		                <span>スポット</span>
		            </h2>

		            <div class="container">
		                <div class="pc">
		                    <div class="spot-wrap">
							<c:forEach var="spo" items="${SpotList}" end = "2">
		                        <!-- spot-01 -->
		                        <figure class="spot-box spot-box-01 flexC">
		                            <img src="${spo.spot_photo_path1} }" alt="${spo.spot_alt1}">
		                            <figcaption class="station-desc spot-desc center">
		                                ${spo.spot_name}
		                            </figcaption>
		                        </figure>
		                        <!-- modal-01 -->
		                        <div class="spot-modal">
		                            <div class="spot-modal-info">
		                                <div class="flexC">
		                                    <div class="spot-modal-img flexR between">
		                                        <img src="${spo.spot_photo_path2}" alt="${spo.spot_alt2}">
		                                        <img src="${spo.spot_photo_path3}" alt="${spo.spot_alt3}">
		                                    </div>
		                                    <span class="spot-modal-text1">
		                                        名称：${spo.spot_name}
		                                    </span>
		                                    <span class="spot-modal-text2">
		                                        住所：${spo.spot_address}
		                                    </span>
		                                    <span class="spot-modal-text3">
		                                        URL:
		                                        <a href="${spo.spot_url}" target="_blank" rel="noopener noreferrer">
		                                            ${spo.spot_url}
		                                        </a>
		                                    </span>
		                                    <span class="spot-modal-text4">
		                                        ${spo.spot_overview}
		                                    </span>
		                                </div>
		                            </div>
		                        </div>
	                        </c:forEach>
		                    </div>
		                </div>

		                <div class="sp">
		                    <figure>
		                        <div class="slider">
		                        	<c:forEach var="spo" items="${SpotList}" end = "3">
		                            <div class="flexC">
		                                <img src="${spo.spot_photo_path1} }" alt="${spo.spot_alt1}">
		                                <figcaption class="station-desc spot-desc">
		                                    ${spo.spot_overview}
		                                </figcaption>
		                            </div>
		                           </c:forEach>
		                        </div>
		                    </figure>
		                </div>
	                </div>
		        </section>

		        <!-- feature -->


		        <section id="feature">
		            <h2>
		                <span>特集リンク</span>
		            </h2>

		            <%
		            int id1 = (int) request.getAttribute("featureLink1");
		            int id2 = (int) request.getAttribute("featureLink2");
		            int id3 = (int) request.getAttribute("featureLink3");


		    		/* SFList.get(0).getFeature_id();
		    		SFList.get(0).getMain_photo_path();
		    		SFList.get(0).getAlt();
		    		 */

		             if(id1 != 0){
		            	 //SFList.get(id1).getFeature_name();

		             }
		            %>
		            <div class="container">
		                <div class="wrap">
		                    <a href="CtrlForFront?pge_id=4&con_id=${SFList.get(0).feature_id}"><img src="" alt="feature_01"></a>
		                    <a href="CtrlForFront?pge_id=4&con_id="><img src="" alt="feature_02"></a>
		                    <a href="CtrlForFront?pge_id=4&con_id=" class="pc"><img src="" alt="feature_03"></a>
		                </div>
	                </div>
		        </section>


		        <!-- information -->
		        <section id="information">
		            <h2>
		                <span>施設案内</span>
		            </h2>
					<c:forEach var="sta" items="${StationList}" >
		            <div class="container">
		                <div class="wrap">
		                    <div class="info">
		                        <table>
		                            <tr>
		                                <th>道の駅名</th>
		                                <td class="name">${sta.michinoeki_name}</td>
		                            </tr>
		                            <tr>
		                                <th>所在地</th>
		                                <td class="postal-code">
		                                    ${sta.post_code} ${sta.address}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>TEL</th>
		                                <td class="tel">
		                                    ${sta.tel}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>駐車場</th>
		                                <td class="parking">
		                                    ${sta.parking}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>営業時間</th>
		                                <td class="business-hour">${sta.service_time}</td>
		                            </tr>
		                            <tr>
		                                <th>定休日</th>
		                                <td class="regular-holiday">
		                                    ${sta.closed}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>HP</th>
		                                <td class="url">
		                                    <a href="${sta.url}" target="_blank" rel="noopener noreferrer">
		                                        ${sta.url}
		                                    </a>
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>設備</th>
		                                <td class="facility">
		                                    <div class="pictogram">
		                                        <img src="img/pictgram/facility01.svg" alt="">
		                                        <img src="img/pictgram/facility02.svg" alt="">
		                                        <img src="img/pictgram/facility03.svg" alt="">
		                                        <img src="img/pictgram/facility04.svg" alt="">
		                                        <img src="img/pictgram/facility05.svg" alt="">
		                                        <img src="img/pictgram/facility06.svg" alt="">
		                                        <img src="img/pictgram/facility07.svg" alt="">
		                                        <img src="img/pictgram/facility08.svg" alt="">
		                                        <img src="img/pictgram/facility09.svg" alt="">
		                                        <img src="img/pictgram/facility10.svg" alt="">
		                                        <img src="img/pictgram/facility11.svg" alt="">
		                                    </div>
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>周辺施設</th>
		                                <td class="around-facility">
		                                    <img src="img/pictgram/facility01.svg" alt="">
		                                    <img src="img/pictgram/facility02.svg" alt="">
		                                    <img src="img/pictgram/facility03.svg" alt="">
		                                    <img src="img/pictgram/facility04.svg" alt="">
		                                    <img src="img/pictgram/facility05.svg" alt="">
		                                    <img src="img/pictgram/facility06.svg" alt="">
		                                    <img src="img/pictgram/facility07.svg" alt="">
		                                    <img src="img/pictgram/facility08.svg" alt="">
		                                </td>
		                            </tr>

		                            <table class="info-more">
		                                <tr>
		                                    <th>ガソリンスタンド</th>
		                                    <td class="gas-stand">${sta.gas_station}</td>
		                                </tr>
		                                <tr>
		                                    <th>病院</th>
		                                    <td class="hospital">${sta.hospital}</td>
		                                </tr>
		                                <tr>
		                                    <th>最寄り駅/バス停</th>
		                                    <td class="station">${sta.near_station}</td>
		                                </tr>
		                            </table>
		                        </table>

		                        <div class="flexR">
		                            ${sta.iframe_src}
		                            <p class="attention">※2022年5月現在<br>今後変更の可能性があります</p>
		                            <input class="btn-more" type="button" value="周辺施設">
		                        </div>
		                    </div>
		                </div>
		                </c:forEach>
		        </section>

		        <section id="map">
		            <div class="container">
		                ${StationList.get(0).iframe_src}
		            </div>
		        </section>


		        <section id="comment">
		            <h2>
		                <span>コメント</span>
		            </h2>

		            <div class="container">
		                <div class="comment-wrap mt60">
		                    <div>
		                        <p class="comment-name">お名前　2020-2-12 17:00</p>
		                        <hr>

		                        <p class="comment-text">
		                            text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text text </p>
		                    </div>

		                    <div class="flexC mt80">
		                        <div class="flexR">
		                            <i class="material-symbols-outlined">
		                                comment
		                            </i>
		                            <p class="comment-leave">コメントを残す</p>
		                        </div>

		                        <div class="name">
		                            お名前
		                            <input type="text" name="name" id="">
		                        </div>

		                        <textarea name="textarea" id="" cols="30" rows="4"></textarea>

		                        <input class="comment-button" type="submit" value="投稿">
		                    </div>
		        </section>
		        <!-- footer -->

		</c:param>

</c:import>