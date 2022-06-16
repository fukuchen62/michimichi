<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<c:import url="../layout/template.jsp">


		<c:param name="title" value="お問い合わせ　―　みちのえき～未知のえき～" />
		<c:param name="description" value="徳島（とくしま）の道の駅、観光名所、ご当地を紹介するサイトです。
話題のくるくるなると、インスタ映え、お出かけスポット、地域の特産物など、まだまだ知らない「未知」の情報が盛りだくさん！" />
		<c:param name="mycss" value="css/inquiry.css" />
		<c:param name="mycss2" value="" />
		<c:param name="myjs" value="js/inquiry.js" />

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
                <form action="/michimichi/Form"  method="post">
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
                        <textarea id="inquiry-text" class="text-area" name="text" id="" cols="30" rows="40" placeholder="お問い合わせ内容を入力してください"></textarea>
                    </div>

                    <div class="accept-box">
                        <div class="">
                            <input id="accept" class="accept-input" type="checkbox" name="accept" value="1" required>
                            <label class="accept-label" for="accept"> 免責事項を確認しました。</label>
                        </div>

                        <span class="policy policy-link">プライバシーポリシー</span>

                        <div class="policy-modal">
                            <div class="modal-text left">
                                <h2 class="center">プライバシーポリシー</h2>

                                基本方針<br>
                                <span class="offset-text">
                                    当サイトは、個人情報の重要性を認識し、個人情報を保護することが社会的責務であると考え、個人情報に関する法令を遵守し、当サイトで取扱う個人情報の取得、利用、管理を適正に行います。
                                </span>
                                <br>
                                <br>
                                適用範囲<br>
                                <span class="offset-text">
                                    本プライバシーポリシーは、お客様の個人情報もしくはそれに準ずる情報を取り扱う際に、当サイトが遵守する方針を示したものです。
                                </span>
                                <br>
                                <br>
                                著作権・肖像権について<br>
                                <span class="offset-text">
                                    当サイトで掲載しているすべてのコンテンツ（文章、画像、動画、音声、ファイル等）の著作権・肖像権等は当サイト所有者または各権利所有者が保有し、許可なく無断利用（転載、複製、譲渡、二次利用等）することを禁止します。また、コンテンツの内容を変形・変更・加筆修正することも一切認めておりません。<br>
                                    各権利所有者におかれましては、万一掲載内容に問題がございましたら、ご本人様よりお問い合わせください。迅速に対応いたします。
                                </span>
                                <br>
                                <br>
                                当サイトのリンクについて<br>
                                <span class="offset-text">
                                    当サイトは原則リンクフリーです。リンクを行う場合の許可や連絡は不要です。引用する際は、引用元の明記と該当ページへのリンクをお願いします。
                                    ただし、画像ファイルへの直リンク、インラインフレームを使用したHTMLページ内で表示する形でのリンクはご遠慮ください。
                                </span>
                                <br>
                                <br>
                                個人情報の利用目的<br>
                                <span class="offset-text">
                                    当サイトは、お客様からご提供いただく情報を以下の目的の範囲内において利用します。<br>
                                    ・ご本人確認のため<br>
                                    ・お問い合わせ、コメント等の確認・回答のため<br>
                                    ・利用規約等で禁じている行為などの調査のため<br>
                                </span>
                                <br>
                                個人情報の管理<br>
                                <span class="offset-text">
                                    当サイトは、個人情報の正確性及び安全確保のために、セキュリティ対策を徹底し、個人情報の漏洩、改ざん、不正アクセスなどの危険については、必要かつ適切なレベルの安全対策を実施します。<br>
                                    当サイトは、第三者に重要な情報を読み取られたり、改ざんされたりすることを防ぐために、SSLによる暗号化を使用しております。
                                </span>
                                <br>
                                <br>
                                免責事項<br>
                                <span class="offset-text">
                                    当サイトのコンテンツ・情報について、可能な限り正確な情報を掲載するよう努めておりますが、正確性や安全性を保証するものではありません。当サイトに掲載された内容によって生じた損害等の一切の責任を負いかねますのでご了承ください。<br>
                                    当サイトからリンクやバナーなどによって他のサイトに移動した場合、移動先サイトで提供される情報、サービス等について一切の責任を負いません。
                                </span>
                            </div>
                        </div>

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