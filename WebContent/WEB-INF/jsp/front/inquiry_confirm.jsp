<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<c:import url="../layout/template.jsp">


		<c:param name="title" value="お問い合わせ　―　みちのえき～未知の駅～" />
		<c:param name="description" value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
知られざる未知のスポットをご紹介します。" />
		<c:param name="mycss" value="css/inquiry_confirm.css" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="" />

		<c:param name="content">

		<section id="inquiry-confirm">
        <div class="container">

            <h3 class="center">
                以下の内容で送信します。
            </h3>
            <br>
            <p class="center">内容をご確認の上、<br>送信ボタンを押してください。</p>

            <div class="confirm-wrap">
                <table>
                    <tr>
                        <th>
                            お名前
                        </th>
                        <td>
                            クリップ太郎
                        </td>
                    </tr>

                    <tr>
                        <th>
                            メールアドレス
                        </th>
                        <td>
                            qlip@gmail.com
                        </td>
                    </tr>

                    <tr>
                        <th>
                            お問い合わせ内容
                        </th>
                        <td>
                            胃が激しく痛いです。<br>
                            助けてください。
                        </td>
                    </tr>
                </table>
            </div>

            <div class="btn flexR">
                <input class="btn-return" type="button" value="戻る" onclick="history.back()">
                <input class="btn-submit" type="submit" value="送信">
            </div>
        </div>
    	</section>

		</c:param>

</c:import>