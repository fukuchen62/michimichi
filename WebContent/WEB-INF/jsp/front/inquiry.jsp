<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<c:import url="../layout/template_footerLess.jsp">


		<c:param name="title" value="お問い合わせ　―　みちのえき～未知のえき～" />
		<c:param name="description" value="徳島の18ヶ所の道の駅と周辺スポットの紹介サイトです。
徳島の大自然、グルメ、観光名所など一歩踏み込んだ、
知られざる未知のスポットをご紹介します。" />
		<c:param name="mycss" value="css/inquiry.css" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="" />

		<c:param name="content">

		<section class="container">
        <div class="h1-wrap flexR">
            <h1 class="h1 center">
                お問い合わせ
            </h1>
        </div>

        <p class="center mt20">
            下記入力フォームに<br>
            必要事項を記入してください。
        </p>
        <div class="border">
            <div class="form-wrap">
                <form action="" method="post">
                    <div class="name-box">
                        <span class="name">お名前</span>
                        <input class="name-input" type="text" name="name" maxlength="32" placeholder="お名前を入力してください" required>
                    </div>

                    <div class="email-box">
                        <span class="mail">メールアドレス</span>
                        <input class="email-input" type="email" name="email" maxlength="50" placeholder="メールアドレスを入力してください" required>
                    </div>

                    <div class="text-box">
                        <span class="text"> お問い合わせ内容</span>
                        <textarea class="text-area" name="text" id="" cols="30" rows="40" placeholder="お問い合わせ内容を入力してください"></textarea>
                    </div>

                    <div class="accept-box">
                        <div class="">
                            <input id="accept" class="accept-input" type="checkbox" name="accept" value="1" required>
                            <label class="accept-label" for="accept"> 免責事項を確認しました。</label>
                        </div>
                        <span class="policy">プライバシーポリシー</span>
                    </div>

                    <div class="response-box">
                        <input id="response" class="response-input" type="checkbox" name="response" value="1" required>
                        <label class="response-label" for="response"> お返事が遅れる場合があります。</label><br>
                    </div>

                    <div class="flexR around">
                        <input class="btn-reset" type="reset" value="リセット">
                        <input class="btn-submit" type="submit" value="確認">
                    </div>
                </form>
            </div>
        </div>
    </section>

		</c:param>

</c:import>