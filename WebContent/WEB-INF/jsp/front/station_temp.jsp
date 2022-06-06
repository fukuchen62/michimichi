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
		            <h2>
		                <!-- <img src="img/temp/station_h2_pc1.svg" srcset="img/temp/station_h2_tab.svg 1024w,
		                img/temp/station_h2_pc2.svg 1350w,
		                img/temp/station_h2_pc1.svg 1920w" alt="intro_h2"> -->
		                <span>道の駅　どなり</span>
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
		                                        <img class="sp-image" src="${item.photo_path1}" alt="${item.alt1}">
		                                    </div>
		                                    <div class="sp-slide">
		                                        <img class="sp-image" src="${item.photo_path2}" alt="${item.alt2}">
		                                    </div>
		                                    <div class="sp-slide">
		                                        <img class="sp-image" src="${item.photo_path3}" alt="${item.alt3}">
		                                    </div>
		                                    <div class="sp-slide">
		                                        <img class="sp-image" src="${item.photo_path4}" alt="${item.alt4}">
		                                    </div>
		                                </div>

		                                <div class="sp-thumbnails">
		                                    <img class="sp-thumbnail" src="${item.photo_thum_path1}" alt="${item.alt1}">
		                                    <img class="sp-thumbnail" src="${item.photo_thum_path2}" alt="${item.alt2}">
		                                    <img class="sp-thumbnail" src="${item.photo_thum_path3}" alt="${item.alt3}">
		                                    <img class="sp-thumbnail" src="${item.photo_thum_path4}" alt="${item.alt4}">
		                                </div>
		                            </div>

		                            <figcaption class="station-desc intro-desc">
		                                ${item.explanation}

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
		        </section>

		        <!-- pick-up -->
		        <section id="pick-up">
		            <h2>
		                <span>特色</span>
		            </h2>

		            <div class="container">
		                <div class="wrap">
		                    <div class="pc">
		                        <figure class="flexC">
		                            <img class="img" src="img/station/donari/pickup/pickup01.jpg" alt="pick-up_01">
		                            <figcaption class="station-desc pickup-desc">
		                                大たらいの上に鳥居や賽銭箱、見たことある妖怪も鎮座している不思議空間！<br>
		                                なんとお賽銭はpaypay対応！
		                            </figcaption>
		                        </figure>

		                        <figure class="flexC">
		                            <img class="img" src="img/station/donari/pickup/pickup02.jpg" alt="pick-up_02">
		                            <figcaption class="station-desc pickup-desc">
		                                道の駅前道路に植えられた桜が春になると満開に！<br>
		                                道路向かいには川が流れていて、花見に最適！
		                            </figcaption>
		                        </figure>
		                    </div>

		                    <div class="sp">
		                        <figure>
		                            <div class="slider">
		                                <div class="slide-01 parent">
		                                    <img class="img" src="img/station/donari/pickup/pickup01.jpg" alt="">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc pickup-desc">
		                                        大たらいの上に鳥居や賽銭箱<br>
		                                        見たことある妖怪も鎮座している不思議空間！<br>
		                                        なんとお賽銭はpaypay対応！
		                                    </figcaption>
		                                </div>

		                                <div class="slide-02 parent">
		                                    <img class="img" src="img/station/donari/pickup/pickup02.jpg" alt="">
		                                    <!-- テキスト表示枠 -->
		                                    <figcaption class="station-desc pickup-desc">
		                                        道の駅前道路に植えられた桜が<br>
		                                        春になると満開に！<br>
		                                        道路向かいには川が流れていて、花見に最適！
		                                    </figcaption>
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
		                <span>オススメ</span>
		            </h2>

		            <div class="container">
		                <div class="wrap">

		                    <!-- pc表示 -->
		                    <div class="pc">
		                        <div class="upper-row">
		                            <figure class="flexC">
		                                <img class="img" src="img/station/donari/recommend/recom01.jpg" alt="recommend_01">
		                                <figcaption class="station-desc recommend-desc">
		                                    衝撃のうまさ！！<br>
		                                    奇跡のコラボ
		                                </figcaption>
		                            </figure>

		                            <figure class="flexC">
		                                <img class="img" src="img/station/donari/recommend/recom02.jpg" alt="recommend_02">
		                                <figcaption class="station-desc recommend-desc">
		                                    焼き目香ばし<br>
		                                    カリっともちもち
		                                </figcaption>
		                            </figure>

		                            <figure class="flexC">
		                                <img class="img" src="img/station/donari/recommend/recom03.jpg" alt="recommend_03">
		                                <figcaption class="station-desc recommend-desc">
		                                    自家製で！<br>
		                                    作れるたらいうどん
		                                </figcaption>
		                            </figure>
		                        </div>

		                        <!-- <div class="lower-row">
		                            <figure class="flexC">
		                                <img class="img" src="" alt="recommend_04">
		                                <figcaption class="station-description">
		                                    セールスコピー
		                                </figcaption>
		                            </figure>

		                            <figure class="flexC">
		                                <img class="img" src="" alt="recommend_05">
		                                <figcaption class="station-description">
		                                    セールスコピー
		                                </figcaption>
		                            </figure>

		                            <figure class="flexC">
		                                <img class="img" src="" alt="recommend_06">
		                                <figcaption class="station-description">
		                                    セールスコピー
		                                </figcaption>
		                            </figure>
		                        </div> -->
		                    </div>

		                    <!-- sp表示 -->
		                    <div class="sp">
		                        <ul>
		                            <li class="commodity">
		                                パンケーキうどん
		                                <i class="btn-plus">
		                                    <i></i>
		                                    <i></i>
		                                </i>
		                            </li>
		                            <figure class="commodity-box">
		                                <div class="flexR">
		                                    <img class="img" src="img/station/donari/recommend/recom01.jpg" alt="recommend01">
		                                    <figcaption class="station-desc recommend-desc">
		                                        パンケーキうどん<br><br>
		                                        衝撃のうまさ！！<br>
		                                        奇跡のコラボ
		                                    </figcaption>
		                                </div>
		                            </figure>

		                            <li class="commodity">
		                                団子の卯月屋
		                                <i class="btn-plus">
		                                    <i></i>
		                                    <i></i>
		                                </i>
		                            </li>
		                            <figure class="commodity-box">
		                                <div class="flexR">
		                                    <img class="img" src="img/station/donari/recommend/recom02.jpg" alt="recommend02">
		                                    <figcaption class="station-desc recommend-desc">
		                                        団子の卯月屋<br><br>
		                                        焼き目香ばしカリっともちもち
		                                    </figcaption>
		                                </div>
		                            </figure>

		                            <li class="commodity">
		                                たらいうどんとたらい買える
		                                <i class="btn-plus">
		                                    <i></i>
		                                    <i></i>
		                                </i>
		                            </li>
		                            <figure class="commodity-box">
		                                <div class="flexR">
		                                    <img class="img" src="img/station/donari/recommend/recom03.jpg" alt="recommend03">
		                                    <figcaption class="station-desc recommend-desc">
		                                        たらいうどんと<br>たらい買える<br><br>
		                                        自家製で！<br>
		                                        作れるたらいうどん
		                                    </figcaption>
		                                </div>
		                            </figure>
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

		                        <!-- spot-01 -->
		                        <figure class="spot-box spot-box-01 flexC">
		                            <img src="img/station/donari/spot/spot01.jpg" alt="spot_01">
		                            <figcaption class="station-desc spot-desc center">
		                                土柱
		                            </figcaption>
		                        </figure>
		                        <!-- modal-01 -->
		                        <div class="spot-modal">
		                            <div class="spot-modal-info">
		                                <div class="flexC">
		                                    <div class="spot-modal-img flexR between">
		                                        <img src="img/station/donari/spot/spot02.jpg" alt="modal_01">
		                                        <img src="img/station/donari/spot/spot03.jpg" alt="modal_02">
		                                    </div>
		                                    <span class="spot-modal-text1">
		                                        名称：土柱
		                                    </span>
		                                    <span class="spot-modal-text2">
		                                        住所：〒771-1705 徳島県阿波市阿波町北山５４０
		                                    </span>
		                                    <span class="spot-modal-text3">
		                                        URL:
		                                        <a href="https://www.awanavi.jp/spot/20320.html" target="_blank" rel="noopener noreferrer">
		                                            https://www.awanavi.jp/spot/20320.html
		                                        </a>
		                                    </span>
		                                    <span class="spot-modal-text4">
		                                        世界三大土柱がひとつ<br>
		                                        太古の昔より土や砂礫が堆積した土地が隆起し、雨水の浸食によって削られ、<br>
		                                        長い年月をかけて形造られた大地の芸術。
		                                    </span>
		                                </div>
		                            </div>
		                        </div>

		                        <!-- spot-02 -->
		                        <figure class="spot-box spot-box-02 flexC">
		                            <img src="img/station/donari/spot/spot04.jpg" alt="spot_02">
		                            <figcaption class="station-desc spot-desc center">
		                                たらいうどん新見屋
		                            </figcaption>
		                        </figure>
		                        <!-- modal-02 -->
		                        <div class="spot-modal">
		                            <div class="spot-modal-info">
		                                <div class="flexC">
		                                    <div class="spot-modal-img flexR between">
		                                        <img src="img/station/donari/spot/spot05.jpg" alt="modal_01">
		                                        <img src="img/station/donari/spot/spot06.jpg" alt="modal_02">
		                                    </div>
		                                    <span class="spot-modal-text1">
		                                        名称：たらいうどん新見屋
		                                    </span>
		                                    <span class="spot-modal-text2">
		                                        住所：〒771-1508 徳島県阿波市土成町宮川内上畑１００−１
		                                    </span>
		                                    <span class="spot-modal-text3">
		                                        URL：
		                                        <a href="https://www.awa-kankou.jp/odekake/niimiya/" target="_blank" rel="noopener noreferrer">
		                                            https://www.awa-kankou.jp/odekake/niimiya/
		                                        </a>
		                                    </span>
		                                    <span class="spot-modal-text4">
		                                        阿波市名物たらいうどん<br>
		                                        いりこ、昆布、かつお節など十数種類のだし素材を使った味わい深い秘伝のつゆ。<br>
		                                        つゆと麺の相性が抜群！
		                                    </span>
		                                </div>
		                            </div>
		                        </div>

		                        <!-- spot-03 -->
		                        <figure class="spot-box spot-box-03 flexC pc">
		                            <img src="img/station/donari/spot/spot07.jpg" alt="spot_03">
		                            <figcaption class="station-desc spot-desc center">
		                                御所温泉
		                            </figcaption>
		                        </figure>
		                        <!-- modal-03 -->
		                        <div class="spot-modal">
		                            <div class="spot-modal-info">
		                                <div class="flexC">
		                                    <div class="spot-modal-img flexR between">
		                                        <img src="img/station/donari/spot/spot08.jpg" alt="modal_01">
		                                        <img src="img/station/donari/spot/spot09.jpg" alt="modal_02">
		                                    </div>
		                                    <span class="spot-modal-text1">
		                                        名称：御所温泉
		                                    </span>
		                                    <span class="spot-modal-text2">
		                                        住所：〒771-1507 徳島県阿波市土成町吉田梨木原１
		                                    </span>
		                                    <span class="spot-modal-text3">
		                                        URL：
		                                        <a href="https://goshonosato.com/" target="_blank" rel="noopener noreferrer">
		                                            https://goshonosato.com/
		                                        </a>
		                                    </span>
		                                    <span class="spot-modal-text4">
		                                        阿讃の麓に湧く極上湯<br>
		                                        阿讃の山々に抱かれるようにひろがる、
		                                        土御門上皇ゆかりの地に湧き出た極上の天然温泉。
		                                    </span>
		                                </div>
		                            </div>
		                        </div>
		                    </div>
		                </div>

		                <div class="sp">
		                    <figure>
		                        <div class="slider">
		                            <div class="flexC">
		                                <img class="img" src="img/station/donari/spot/spot01.jpg" alt="spot01">
		                                <figcaption class="station-desc spot-desc">
		                                    世界三大土柱がひとつ<br>
		                                    <br>
		                                    太古の昔より土や砂礫が堆積した土地が隆起し、雨水の浸食によって削られ、長い年月をかけて形造られた大地の芸術。
		                                </figcaption>
		                            </div>

		                            <div class="flexC">
		                                <img class="img" src="img/station/donari/spot/spot04.jpg" alt="spot01">
		                                <figcaption class="station-desc spot-desc">
		                                    阿波市名物たらいうどん<br>
		                                    <br>
		                                    いりこ、昆布、かつお節など十数種類のだし素材を使った味わい深い秘伝のつゆ。<br>
		                                    つゆと麺の相性が抜群！

		                                </figcaption>
		                            </div>

		                            <div class="flexC">
		                                <img class="img" src="img/station/donari/spot/spot07.jpg" alt="spot01">
		                                <figcaption class="station-desc spot-desc">
		                                    阿讃の麓に湧く極上湯<br>
		                                    <br>
		                                    阿讃の山々に抱かれるようにひろがる、
		                                    土御門上皇ゆかりの地に湧き出た極上の天然温泉。
		                                </figcaption>
		                            </div>
		                        </div>
		                    </figure>
		                </div>
		        </section>

		        <!-- feature -->
		        <section id="feature">
		            <h2>
		                <span>特集リンク</span>
		            </h2>

		            <div class="container">
		                <div class="wrap">
		                    <a href="CtrlForFront?pge_id=9&con_id=${list.feature_banner1}"><img src="" alt="feature_01"></a>
		                    <a href="CtrlForFront?pge_id=9&con_id=${list.feature_banner2}"><img src="" alt="feature_02"></a>
		                    <a href="CtrlForFront?pge_id=9&con_id=${list.feature_banner3}" class="pc"><img src="" alt="feature_03"></a>
		                </div>
		        </section>

		        <!-- information -->
		        <section id="information">
		            <h2>
		                <span>施設案内</span>
		            </h2>

		            <div class="container">
		                <div class="wrap">
		                    <div class="info">
		                        <table>
		                            <tr>
		                                <th>道の駅名</th>
		                                <td class="name">${item.michinoeki_name}</td>
		                            </tr>
		                            <tr>
		                                <th>所在地</th>
		                                <td class="postal-code">
		                                    ${item.post_code} ${item.address}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>TEL</th>
		                                <td class="tel">
		                                    ${item.tel}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>駐車場</th>
		                                <td class="parking">
		                                    ${item.parking}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>営業時間</th>
		                                <td class="business-hour">${item.service_time}</td>
		                            </tr>
		                            <tr>
		                                <th>定休日</th>
		                                <td class="regular-holiday">
		                                    ${item.closed}
		                                </td>
		                            </tr>
		                            <tr>
		                                <th>HP</th>
		                                <td class="url">
		                                    <a href="${item.url}" target="_blank" rel="noopener noreferrer">
		                                        ${item.url}
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
		                                    <td class="gas-stand">${item.gas_station}</td>
		                                </tr>
		                                <tr>
		                                    <th>病院</th>
		                                    <td class="hospital">${item.hospital}</td>
		                                </tr>
		                                <tr>
		                                    <th>最寄り駅/バス停</th>
		                                    <td class="station">${item.near_station}</td>
		                                </tr>
		                            </table>
		                        </table>

		                        <div class="flexR">
		                            ${item.iframe_src}
		                            <p class="attention">※2022年5月現在<br>今後変更の可能性があります</p>
		                            <input class="btn-more" type="button" value="周辺施設">
		                        </div>
		                    </div>
		                </div>
		        </section>

		        <section id="map">
		            <div class="container">
		                <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d13209.578912092118!2d134.4743706!3d34.1362421!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x5c853bde9aaf461e!2z6YGT44Gu6aeFIOOBhOOBn-OBrg!5e0!3m2!1sja!2sjp!4v1653057573454!5m2!1sja!2sjp" width="100%" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
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