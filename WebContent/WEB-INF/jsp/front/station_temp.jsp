<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<c:import url="../layout/template.jsp">


	<c:param name="title" value="${station.michinoeki_name}　―　みちのえき～未知の駅～" />
	<c:param name="description" value="${station.explanation}" />
	<c:param name="mycss" value="css/slider-pro.min.css" />
	<c:param name="mycss2" value="css/station_temp.css" />
	<c:param name="myjs" value="js/station_temp.js" />
	<c:param name="myjs2" value="js/slider.js" />
	<c:param name="myjs3" value="js/good.js" />
	<c:param name="myjs4" value="js/jquery.sliderPro.min.js" />

	<c:param name="content">
    <section id="introduction">
        <h1>
            <img src="img/temp/station_h1_pc1.svg" srcset="img/temp/station_h1_tab.svg 1024w,
             img/temp/station_h1_pc2.svg 1350w,
             img/temp/station_h1_pc1.svg 1920w" alt="intro_h1">
             <span>道の駅 ${station.michinoeki_name}</span>
        </h1>

        <!-- コンテンツ枠 -->
        <div class="container">
            <div class="wrap">

                <!-- pc表示 -->
                <div class="pc">
                    <figure>
                        <div id="slider-v" class="slider-pro">
                            <div class="sp-slides">
                                <div class="sp-slide">
                                    <img class="sp-image" src="${station.photo_path1}" alt="${station.alt1}">
                                </div>
                                <div class="sp-slide">
                                    <img class="sp-image" src="${station.photo_path2}" alt="${station.alt2}">
                                </div>
                                <div class="sp-slide">
                                    <img class="sp-image" src="${station.photo_path3}" alt="${station.alt3}">
                                </div>
                                <div class="sp-slide">
                                    <img class="sp-image" src="${station.photo_path4}" alt="${station.alt4}">
                                </div>
                            </div>

                            <div class="sp-thumbnails">
                                <img class="sp-thumbnail" src="${station.photo_thum_path1}" alt="${station.alt1}">
                                <img class="sp-thumbnail" src="${station.photo_thum_path2}" alt="${station.alt2}">
                                <img class="sp-thumbnail" src="${station.photo_thum_path3}" alt="${station.alt3}">
                                <img class="sp-thumbnail" src="${station.photo_thum_path4}" alt="${station.alt4}">
                            </div>
                        </div>

                        <figcaption class="station-desc intro-desc">
                            ${station.explanation}
                        </figcaption>
                    </figure>
                </div>

                <!-- sp表示 -->
                <div class="sp">
                    <figure>
                        <!-- sp用の画像表示枠 -->
                        <div class="slider">
                            <div class="slide-01 parent">
                                <img class="img" src="${station.photo_thum_path1}" alt="${station.alt1}">
                            </div>
                            <div class="slide-02 parent">
                                <img class="img" src="${station.photo_thum_path2}" alt="${station.alt2}">
                            </div>
                            <div class="slide-03 parent">
                                <img class="img" src="${station.photo_thum_path3}" alt="${station.alt3}">
                            </div>
                            <div class="slide-04 parent">
                                <img class="img" src="${station.photo_thum_path4}" alt="${station.alt4}">
                            </div>
                        </div>

                        <!-- テキスト表示枠 -->
                        <figcaption class="station-desc intro-desc">
                            ${station.explanation}
                        </figcaption>
                    </figure>
                </div>

                <!-- コメント、いいね -->
                <div class="account flexR">
                    <a class="comment" href="#comment">コメント欄へ(10)</a>
                    <span class="good">
                    <form action="/michimichi/GoodRecords" method ="post">
                        <button class="btn-good">
                            <i id="thumb" class="thumb material-symbols-outlined">
                                thumb_up
                            </i>
                            <i id="heart" class="heart material-symbols-outlined">
                                favorite
                            </i>
                        </button>
                        <input type="hidden" name="id" value="${station.michinoeki_id}">
                    </form>
                    <span id="good">${goodRecordsCount.good_count}</span>
                    </span>
                </div>
            </div>
        </div>
    </section>

    <!-- pick-up -->
    <section id="pick-up">
        <h2>
            <img srcset="img/temp/station_h2_sp.png 1024w,
            img/temp/station_h2_pc2.png 1024w,
            img/temp/station_h2_pc1.png 1350w" src="img/temp/station_h1_pc1.png" alt="pickup_h2">
            <span>特色</span>
        </h2>

        <div class="container">
            <div class="wrap">
                <div class="pc">
                    <figure class="flexC">
                        <img class="img" src="${station.feature1_photo_path}" alt="${station.feature1_alt}">
                        <figcaption class="station-desc pickup-desc">
                        ${station.feature1_overview}</figcaption>
                    </figure>

                    <figure class="flexC">
                        <img class="img" src="${station.feature2_photo_path}" alt="${station.feature2_alt}">
                        <figcaption class="station-desc pickup-desc">
                        ${station.feature2_overview}</figcaption>
                        </figcaption>
                    </figure>
                </div>

                <div class="sp">
                    <figure>
                        <div class="slider">
                            <div class="slide-01 parent">
                                <img class="img" src="${station.feature1_photo_path}" alt="${station.feature1_alt}">
                                <!-- テキスト表示枠 -->
                                <figcaption class="station-desc pickup-desc">
                                    ${station.feature1_overview}</figcaption>
                            </div>

                            <div class="slide-02 parent">
                                <img class="img" src="${station.feature2_photo_path}" alt="${station.feature2_alt}">
                                <!-- テキスト表示枠 -->
                                <figcaption class="station-desc pickup-desc">
                                    ${station.feature2_overview}</figcaption>
                            </div>
                        </div>
                    </figure>

                </div>
            </div>
        </div>
    </section>

    <!-- recommend -->
    <section id="recommend">
        <h2>
            <img srcset="img/temp/station_h2_sp.png 1024w,
            img/temp/station_h2_pc2.png 1024w,
            img/temp/station_h2_pc1.png 1350w" src="img/temp/station_h1_pc1.png" alt="recommend_h2">
            <span>オススメ</span>
        </h2>

        <div class="container">
            <div class="wrap">

                <!-- pc表示 -->
                <div class="pc">
                    <div class="upper-row">
                        <c:forEach var="rec" items="${RecommendsList}" end="2">
                            <figure class="flexC">
                                <img class="img" src="${rec.recommend_photo_path }" alt="${rec.recommend_alt}">
                                <figcaption class="station-desc recommend-desc">
                                    <span>${rec.recommed_overview }</span>
                                </figcaption>
                            </figure>
                        </c:forEach>
                    </div>
                </div>

                <!-- sp表示 -->
                <div class="sp">
                    <ul>
                        <c:forEach var="rec" items="${RecommendsList}" end="3">
                            <li class="commodity">${rec.recommend_name }<i
                                class="btn-plus"> <i></i> <i></i>
                            </i>
                            </li>
                            <figure class="commodity-box">
                                <div class="flexR">
                                    <img class="img" src="${rec.recommend_photo_path }" alt="${rec.recommend_alt }">
                                    <figcaption class="station-desc recommend-desc">
                                        ${rec.recommed_overview }</figcaption>
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
            <img srcset="img/temp/station_h2_sp.png 1024w,
            img/temp/station_h2_pc2.png 1024w,
            img/temp/station_h2_pc1.png 1350w" src="img/temp/station_h1_pc1.png" alt="spot_h2">
            <span>スポット</span>
        </h2>

        <div class="container">
            <div class="pc">
                <div class="spot-wrap">
                    <c:forEach var="spo" items="${SpotList}" end="2">
                        <!-- spot-01 -->
                        <figure class="spot-box spot-box-01 flexC">
                            <img src="${spo.spot_photo_path1}" alt="${spo.spot_alt1}">
                            <figcaption class="station-desc spot-desc center">
                                ${spo.spot_name}</figcaption>
                        </figure>
                        <!-- modal-01 -->
                        <div class="spot-modal">
                            <div class="spot-modal-info">
                                <div class="flexC">
                                    <div class="spot-modal-img flexR between">
                                        <img src="${spo.spot_photo_path2}" alt="${spo.spot_alt2}">
                                        <img src="${spo.spot_photo_path3}" alt="${spo.spot_alt3}">
                                    </div>
                                    <span class="spot-modal-text1"> 名称：${spo.spot_name} </span> <span
                                        class="spot-modal-text2"> 住所：${spo.spot_address} </span> <span
                                        class="spot-modal-text3"> URL: <a
                                        href="${spo.spot_url}" target="_blank"
                                        rel="noopener noreferrer"> ${spo.spot_url} </a>
                                    </span> <span class="spot-modal-text4"> ${spo.spot_overview} </span>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <div class="sp">
                <figure>
                    <div class="slider">
                        <c:forEach var="spo" items="${SpotList}" end="2">
                            <div class="flexC">

                                <img src="${spo.spot_photo_path1}" alt="${spo.spot_alt1}">

                                <figcaption class="station-desc spot-desc">
                                	<b>${spo.spot_name}</b><br>
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
            <img srcset="img/temp/station_h2_sp.png 1024w,
            img/temp/station_h2_pc2.png 1024w,
            img/temp/station_h2_pc1.png 1350w" src="img/temp/station_h1_pc1.png" alt="feature_h2">
			<span>特集リンク</span>
        </h2>

        <div class="container">
            <div class="wrap">
                <c:if test="${station.feature_banner1 != 0}">
                    <a href="CtrlForFront?pge_id=4&con_id=${station.feature_banner1}"><img src="${banner_img1} "alt="${banner_alt1}">
                </c:if>
                <c:if test="${station.feature_banner2 != 0}">
                    <a href="CtrlForFront?pge_id=4&con_id=${station.feature_banner2}"><img src="${banner_img2} "alt="${banner_alt2}">
                </c:if>
                <c:if test="${station.feature_banner3 != 0}">
                    <a href="CtrlForFront?pge_id=4&con_id=${station.feature_banner3}" class="pc"><img src="${banner_img3} "alt="${banner_alt3}">
                </c:if>
            </div>
        </div>
    </section>

    <!-- information -->
    <section id="information">
        <h2>
            <img srcset="img/temp/station_h2_sp.png 1024w,
            img/temp/station_h2_pc2.png 1024w,
            img/temp/station_h2_pc1.png 1350w" src="img/temp/station_h1_pc1.png" alt="info_h2">
            <span>施設案内</span>
        </h2>

        <div class="container">
            <div class="wrap">
                <div class="info">
                    <table>
                        <tr>
                            <th>道の駅名</th>
                            <td class="name">${station.michinoeki_name}</td>
                        </tr>
                        <tr>
                            <th>所在地</th>
                            <td class="postal-code">
                                〒${station.post_code} <Br>
                                ${station.address}
                            </td>
                        </tr>
                        <tr>
                            <th>TEL</th>
                            <td class="tel">
                                ${station.tel}
                            </td>
                        </tr>
                        <tr>
                            <th>駐車場</th>
                            <td class="parking">
                                ${station.parking}
                            </td>
                        </tr>
                        <tr>
                            <th>営業時間</th>
                            <td class="business-hour">
                                ${station.service_time}
                            </td>
                        </tr>
                        <tr>
                            <th>定休日</th>
                            <td class="regular-holiday">
                                ${station.closed}
                            </td>
                        </tr>
                        <tr>
                            <th>HP</th>
                            <td class="url">
                                <a href="${station.url}" target="_blank" rel="noopener noreferrer">
                                    ${station.url}
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <th>設備</th>
								<td class="facility">
									<div class="pictogram">
										<c:forEach var="list" items="${FacilityList}" begin="0" end="10">
											<div class="pict-parent">
												<c:choose>
													<c:when test="${list.status}">
														<img src="${list.icon_path1}" alt="${list.tages_alt}">
													</c:when>
													<c:otherwise>
														<img src="${list.icon_path2}" alt="${list.tages_alt}">
													</c:otherwise>
												</c:choose>
												<span class="pict-child">${list.category_name}</span>
											</div>
										</c:forEach>

									</div>
								</td>
                        </tr>
                        <tr>
                            <th>周辺施設</th>
								<td class="around-facility">
									<div class="pictogram">
										<c:forEach var="list" items="${FacilityList}" begin="11" end="18">
											<div class="pict-parent">
												<c:choose>
													<c:when test="${list.status}">
														<img src="${list.icon_path1}" alt="${list.tages_alt}">
													</c:when>
													<c:otherwise>
														<img src="${list.icon_path2}" alt="${list.tages_alt}">
													</c:otherwise>
												</c:choose>
												<span class="pict-child">${list.category_name}</span>
											</div>
										</c:forEach>

									</div>
								</td>
                        </tr>

                        <table class="info-more">
                            <tr>
                                <th>ガソリンスタンド</th>
                                <td class="gas-stand">${station.gas_station}</td>
                            </tr>
                            <tr>
                                <th>病院</th>
                                <td class="hospital">${station.hospital}</td>
                            </tr>
                            <tr>
                                <th>最寄り駅/バス停</th>
                                <td class="station">${station.near_station}</td>
                            </tr>
                        </table>
                    </table>

                    <div class="flexR">
                        <p class="attention">※2022年5月現在<br>今後変更の可能性があります</p>
                        <input class="btn-more" type="button" value="周辺施設">
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section id="map">
        <div class="container">
            ${station.iframe_src}
        </div>
    </section>


    <section id="comment">
        <h2>
            <img srcset="img/temp/station_h2_sp.png 1024w,
            img/temp/station_h2_pc2.png 1024w,
            img/temp/station_h2_pc1.png 1350w" src="img/temp/station_h1_pc1.png" alt="comment_h2">
            <span>コメント</span>
        </h2>

	<div class="container">
    	<div class="comment-wrap mt60">
			<c:forEach var="com" items="${CommentList}" end="4">
				<div>
				    <p class="comment-name">${com.name}　<fmt:formatDate pattern = "yyyy年MM月dd日　HH：mm" value = "${com.post_time}"/></p>
				    <hr>
				    <p class="comment-text">${com.comment}</p>
				</div>
			</c:forEach>

			<!-- コメント折り畳みアコーディオン -->
			<div class="comment-accordion">
				<c:forEach var="com" items="${CommentList}" begin="5" end="100">
				    <div>
			            <p class="comment-name">${com.name}　<fmt:formatDate pattern = "yyyy年MM月dd日　HH：mm" value = "${com.post_time}"/></p>
			            <hr>
			            <p class="comment-text">${com.comment} </p>
				    </div>
				</c:forEach>
			</div>

			<!-- もっと見るボタン -->
            <div class="comment-more">
                <hr>
                <p class="center">もっと見る</p>
                <!-- <p class="arrow center">　</p> -->
                <div class="arrow center">
                    <i class="material-symbols-outlined">expand_more</i>
                </div>
                <hr>
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
	                <input id="comment-name" type="text" name="name" maxlength="30" required>
	            </div>

	            <textarea id="comment-text" name="textarea" id="" cols="30" rows="4" maxlength="1024" required></textarea>

				<div class="btn-wrap">
					<div id="warning-wrap">
						<p id="warning-name"></p>
						<p id="warning-comment"></p>
					</div>
	            	<input class="btn-comment" type="button" value="投稿">
				</div>

	            <div class="comment-modal">
	                <div class="comment-modal-area">
	                    <div class="center mb60">
	                        以下の内容で投稿します。<br>
	                        よろしいですか？
	                    </div>


	                    <form action="/michimichi/Comment" method="post">
	                        <div class="comment-modal-name flexR">
	                            <span>お名前　：</span>
	                            <span>
	                                <input id="res-name" type="text" name="name" readonly required>
	                            </span>
	                        </div>

	                        <div class="comment-modal-text flexR">
	                            <span>コメント：</span>
	                            <span class="res-comment-wrap">
                                        <textarea id="res-text" name="comment" cols="60" rows="10" readonly></textarea>
	                            </span>
	                        </div>

	                        <div class="btn flexR">
	                            <input class="btn-return" type="button" value="戻る">
	                            <input class="btn-submit" type="submit" value="送信">
	                        </div>
	                        <input type="hidden" name="id" value="${station.michinoeki_id}">
	                    </form>
                     </div>
                  </div>
            </div>
		</div>
	</div>
    </section>

	</c:param>

</c:import>