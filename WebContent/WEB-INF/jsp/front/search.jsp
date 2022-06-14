<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:import url="../layout/template.jsp">

	<c:param name="title" value="カテゴリー検索　―　みちのえき〜未知のえき〜" />
	<c:param name="description"
		value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
知られざる未知のスポットをご紹介します。" />
	<c:param name="mycss" value="test.css" />
	<c:param name="mycss2" value="css/search.css" />
	<c:param name="myjs" value="js/search.js" />

	<c:param name="content">

		<!-- pc -->
		<section id="search">
			<div class="container pc">
				<h1 class="center">
					<img src="img/search/search_h1sp.svg" alt=""> <span>検索</span>
				</h1>

				<form action="/michimichi/CtrlForSearch" method="get">
					<div id="district">
						<div class="container90">
							<h2>地域</h2>

							<div class="district-wrap">
								<div class="flexR">
									<input id="all" class="all" type="checkbox" name="district">
									<label for="all"> 全域</label>
								</div>

								<div class="flexR">
									<input id="east" class="dist" type="checkbox" name="area"
										value="1"> <label for="east">東部</label>
								</div>

								<div class="flexR">
									<input id="west" class="dist" type="checkbox" name="area"
										value="2"> <label for="west">西部</label>
								</div>

								<div class="flexR">
									<input id="south" class="dist" type="checkbox" name="area"
										value="3"> <label for="south">南部</label>
								</div>
							</div>
						</div>
					</div>

					<div id="facility">
						<div class="container90">

							<h2>設備</h2>
							<div class="facility-wrap">
								<div>
									<input id="eat" type="checkbox" name="facility" value="1">
									<label for="eat">食事処</label>
								</div>

								<div class="flexR">
									<input id="shop" type="checkbox" name="facility" value="2">
									<label for="shop">ショップ</label>
								</div>

								<div class="flexR">
									<input id="dog" type="checkbox" name="facility" value="3">
									<label for="dog">介助犬</label>
								</div>
								<div class="flexR">
									<input id="wi-fi" type="checkbox" name="facility" value="4">
									<label for="wi-fi">Wi-Fi</label>
								</div>

								<div class="flexR">
									<input id="wc" type="checkbox" name="facility" value="5">
									<label for="wc">障碍者用トイレ</label>
								</div>

								<div class="flexR">
									<input id="baby" type="checkbox" name="facility" value="6">
									<label for="baby">おむつ台</label>
								</div>

								<div class="flexR">
									<input id="parking" type="checkbox" name="facility" value="7">
									<label for="parking">障碍者用駐車場</label>
								</div>

								<div class="flexR">
									<input id="gs" type="checkbox" name="facility" value="8">
									<label for="gs">ガソリンスタンド</label>
								</div>

								<div class="flexR">
									<input id="ev" type="checkbox" name="facility" value="9">
									<label for="ev">EVスタンド</label>
								</div>

								<div class="flexR">
									<input id="info" type="checkbox" name="facility" value="10">
									<label for="info">観光案内</label>
								</div>
									<div class="flexR">
										<input id="exp" type="checkbox" name="facility" value="11">
										<label for="exp">体験施設</label>
									</div>
								<div class="flexR">
									<input id="hotspring" type="checkbox" name="facility"
										value="12"> <label for="hotspring">温泉</label>
								</div>
							</div>
						</div>
					</div>

					<div id="around">
						<div class="container90">
							<h2>周辺施設</h2>

							<div class="wrap">
								<div class="around-wrap">
									<div>
										<input id="conveni" type="checkbox" name="facility" value="13">
										<label for="conveni">コンビニ</label>
									</div>

									<div class="flexR">
										<input id="drug" type="checkbox" name="facility" value="14">
										<label for="drug">ドラッグストア</label>
									</div>

									<div class="flexR">
										<input id="a-gs" type="checkbox" name="facility" value="15">
										<label for="a-gs">ガソリンスタンド</label>
									</div>

									<div class="flexR">
										<input id="hospital" type="checkbox" name="facility"
											value="15"> <label for="hospital">病院</label>
									</div>

									<div class="flexR">
										<input id="station" type="checkbox" name="facility" value="17">
										<label for="station">最寄り駅/バス停</label>
									</div>
									<div class="flexR">
										<input id="a-hotspring" type="checkbox" name="facility"
											value="18"> <label for="a-hotspring">温泉</label>
									</div>

									<div class="flexR">
										<input id="hotel" type="checkbox" name="facility" value="19">
										<label for="hotel">宿泊施設</label>
									</div>
								</div>

								<hr>

								<div class="search-btn">
									<input class="btn-reset" type="reset" value="リセット"> <input
										class="btn-search" type="submit" value="検索">
								</div>
							</div>
						</div>
					</div>
				</form>

				<!-- pc end -->

			</div>
			<!-- sp -->
			<h1 class="sp center">
				<img src="img/search/search_h1sp.svg" alt=""> <span>検索</span>
			</h1>

			<div class="container sp">
				<form action="" method="">
					<div id="district-sp">
						<div class="container90">
							<h2>地域</h2>

							<div class="district-wrap">
								<div class="flexR">
									<input id="all-sp" class="all" type="checkbox" name="district">
									<label for="all-sp"> 全域</label>
								</div>

								<div class="flexR">
									<input id="east-sp" class="dist" type="checkbox" name="area"
										value="1"> <label for="east-sp">東部</label>
								</div>

								<div class="flexR">
									<input id="west-sp" class="dist" type="checkbox" name="area"
										value="2"> <label for="west-sp">西部</label>
								</div>

								<div class="flexR">
									<input id="south-sp" class="dist" type="checkbox" name="area"
										value="3"> <label for="south-sp">南部</label>
								</div>
							</div>
						</div>
					</div>

					<div id="facility-sp">
						<div class="container90">

							<h2>設備</h2>
							<div class="facility-wrap">
								<div class="flexR">
									<input id="eat-sp" class="checkbox" type="checkbox"
										name="facility" value="1"> <label for="eat-sp">
										<img class="img" src="img/pictgram/eat.svg" alt="eat">
										食事処
									</label>
								</div>

								<div class="flexR">
									<input id="shop-sp" type="checkbox" name="facility" value="2">
									<label for="shop-sp"> <img class="img"
										src="img/pictgram/shop.svg" alt="shop"> ショップ
									</label>
								</div>

								<div class="flexR">
									<input id="dog-sp" type="checkbox" name="facility" value="3">
									<label for="dog-sp"> <img class="img"
										src="img/pictgram/dog.svg" alt="dog"> 介助犬
									</label>
								</div>
								<div class="flexR">
									<input id="wi-fi-sp" type="checkbox" name="facility" value="4">
									<label for="wi-fi-sp"> <img class="img"
										src="img/pictgram/wifi.svg" alt="wifi"> Wi-Fi
									</label>
								</div>

								<div class="flexR">
									<input id="wc-sp" type="checkbox" name="facility" value="5">
									<label for="wc-sp"> <img class="img"
										src="img/pictgram/wc.svg" alt="wc"> 障碍者用トイレ
									</label>
								</div>

								<div class="flexR">
									<input id="baby-sp" type="checkbox" name="facility" value="6">
									<label for="baby-sp"> <img class="img"
										src="img/pictgram/baby.svg" alt="baby"> おむつ台
									</label>
								</div>

								<div class="flexR">
									<input id="parking-sp" type="checkbox" name="facility"
										value="7"> <label for="parking-sp"> <img
										class="img" src="img/pictgram/parking.svg" alt="parking">
										障碍者用駐車場
									</label>
								</div>

								<div class="flexR">
									<input id="gs-sp" type="checkbox" name="facility" value="8">
									<label for="gs-sp"> <img class="img"
										src="img/pictgram/gas.svg" alt="gas"> ガソリンスタンド
									</label>
								</div>

								<div class="flexR">
									<input id="ev-sp" type="checkbox" name="facility" value="9">
									<label for="ev-sp"> <img class="img"
										src="img/pictgram/ev.svg" alt="ev"> EVスタンド
									</label>
								</div>

								<div class="flexR">
									<input id="info-sp" type="checkbox" name="facility" value="10">
									<label for="info-sp"> <img class="img"
										src="img/pictgram/info.svg" alt="info"> 観光案内
									</label>
								</div>
									<div class="flexR">
										<input id="exp-sp" type="checkbox" name="facility" value="11">
										<label for="exp-sp"> <img class="img"
											src="img/pictgram/exp.svg" alt="exp"> 体験施設
										</label>
									</div>
								<div class="flexR">
									<input id="hotspring-sp" type="checkbox" name="facility"
										value="12"> <label for="hotspring-sp"> <img
										class="img" src="img/pictgram/hotspring.svg" alt="hotspring">
										温泉
									</label>
								</div>
							</div>
						</div>
					</div>

					<div id="around-sp">
						<div class="container90">
							<h2>周辺施設</h2>

							<div class="wrap">
								<div class="around-wrap">
									<div class="flexR">
										<input id="conveni-sp" type="checkbox" name="facility"
											value="13"> <label for="conveni-sp"> <img
											class="img" src="img/pictgram/conveni.svg" alt="conveni">
											コンビニ
										</label>
									</div>

									<div class="flexR">
										<input id="drug-sp" type="checkbox" name="facility" value="14">
										<label for="drug-sp"> <img class="img"
											src="img/pictgram/drug.svg" alt="drug"> ドラッグストア
										</label>
									</div>

									<div class="flexR">
										<input id="a-gs-sp" type="checkbox" name="facility" value="15">
										<label for="a-gs-sp"> <img class="img"
											src="img/pictgram/gas.svg" alt="gas"> ガソリンスタンド
										</label>
									</div>

									<div class="flexR">
										<input id="hospital-sp" type="checkbox" name="facility"
											value="16"> <label for="hospital-sp"> <img
											class="img" src="img/pictgram/hospital.svg" alt="hospital">
											病院
										</label>
									</div>

									<div class="flexR">
										<input id="station-sp" type="checkbox" name="facility"
											value="17"> <label for="station-sp"> <img
											class="img" src="img/pictgram/station.svg" alt="station">
											最寄り駅<br> バス停
										</label>
									</div>
									<div class="flexR">
										<input id="a-hotspring-sp" type="checkbox" name="facility"
											value="18"> <label for="a-hotspring-sp"> <img
											class="img" src="img/pictgram/hotspring.svg" alt="hotspring">
											温泉
										</label>
									</div>

									<div class="flexR">
										<input id="hotel-sp" type="checkbox" name="facility"
											value="19"> <label for="hotel-sp"> <img
											class="img" src="img/pictgram/hotel.svg" alt="hotel">
											宿泊施設
										</label>
									</div>
								</div>

								<hr>

								<div class="search-btn">
									<input class="btn-reset" type="reset" value="リセット"> <input
										class="btn-search" type="submit" value="検索">
								</div>
							</div>
						</div>
					</div>
				</form>

				<!-- sp end -->
			</div>

			<!-- search-result -->
			<div class="search-result container">
				<div class="search-result-area">
					<h2>検索結果一覧</h2>
					<div class="search-tag">
						<div class="search-tag-district">
							地域：
							<c:forEach var="i" begin="0" end="${areasList_length}" step="1">
							${areasList[i]}
						</c:forEach>
						</div>
						<div class="search-tag-facility">
							設備：
							<c:forEach var="i" begin="0" end="${facilitiesList_length}" step="1">
							${facilitiesList[i]}
						</c:forEach>
						</div>
						<div class="search-tag-around">周辺施設：
						<c:forEach var="i" begin="0" end="${aroundList_length}" step="1">
							${aroundList[i]}
						</c:forEach>
						</div>
					</div>
					<div class="grid">
						<c:forEach var="searchresult" items="${searchList}">
							<div class="search-result-indi checked">
								<a
									href="CtrlForFront?pge_id=9&con_id=${searchresult.michinoeki_id}"><img
									class="img" src="${searchresult.photo_path1}"
									alt="${searchresult.alt1}"></a>
								<p class="title center">${searchresult.michinoeki_name}</p>
								<div class="pictgram">
									<div class="pict-facility">
										設備
										<hr class="hr-style">
										<div class="pict-area">
											<c:choose>
												<c:when test="${searchresult.tag1}">
													<img src="${searchresult.tag1_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag1_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag2}">
													<img src="${searchresult.tag2_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag2_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag3}">
													<img src="${searchresult.tag3_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag3_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag4}">
													<img src="${searchresult.tag4_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag4_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag5}">
													<img src="${searchresult.tag5_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag5_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag6}">
													<img src="${searchresult.tag6_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag6_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag7}">
													<img src="${searchresult.tag7_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag7_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag8}">
													<img src="${searchresult.tag8_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag8_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag9}">
													<img src="${searchresult.tag9_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag9_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag10}">
													<img src="${searchresult.tag10_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag10_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag11}">
													<img src="${searchresult.tag11_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag11_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag12}">
													<img src="${searchresult.tag12_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag12_icon_path2}">
												</c:otherwise>
											</c:choose>
										</div>
									</div>
									<div class="pict-around">
										周辺施設
										<hr class="hr-style">
										<div class="pict-area">
											<c:choose>
												<c:when test="${searchresult.tag13}">
													<img src="${searchresult.tag13_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag13_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag14}">
													<img src="${searchresult.tag14_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag14_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag15}">
													<img src="${searchresult.tag15_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag15_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag16}">
													<img src="${searchresult.tag16_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag16_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag17}">
													<img src="${searchresult.tag17_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag17_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag18}">
													<img src="${searchresult.tag18_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag18_icon_path2}">
												</c:otherwise>
											</c:choose>
											<c:choose>
												<c:when test="${searchresult.tag19}">
													<img src="${searchresult.tag19_icon_path1}">
												</c:when>
												<c:otherwise>
													<img src="${searchresult.tag19_icon_path2}">
												</c:otherwise>
											</c:choose>
										</div>
									</div>
								</div>
							</div>

						</c:forEach>
					</div>
				</div>
			</div>

		</section>

		<script>
			"use strict";
			$(document).ready(function() {
				let all = document.getElementById("all");
				let all_sp = document.getElementById("all-sp");
				const district = document.getElementsByName("area");

				function CheckAll() {
					if (this.checked == true) {
						for (let i = 0; i < district.length; i++) {
							district[i].checked = true;
						}
					} else {
						for (let i = 0; i < district.length; i++) {
							district[i].checked = false;
						}
					}
				}
				all.addEventListener("click", CheckAll, false);
				all_sp.addEventListener("click", CheckAll, false);

				$(".dist").click(function() {
					all.checked = false;
					all_sp.checked = false;
				});
			});
		</script>

	</c:param>
</c:import>

