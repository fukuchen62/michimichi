<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="beans.FormBs" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
//リクエストスコープから取得
	FormBs form =(FormBs)session.getAttribute("form");
%>


<c:import url="../layout/template.jsp">


		<c:param name="title" value="お問い合わせ　―　みちのえき～未知のえき～" />
		<c:param name="description" value="徳島（とくしま）の道の駅、観光名所、ご当地を紹介するサイトです。
話題のくるくるなると、インスタ映え、お出かけスポット、地域の特産物など、まだまだ知らない「未知」の情報が盛りだくさん！" />
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
                            <%= form.getName() %>
                        </td>
                    </tr>

                    <tr>
                        <th>
                            メールアドレス
                        </th>
                        <td>
                            <%= form.getEmail() %>
                        </td>
                    </tr>

                    <tr>
                        <th>
                            お問い合わせ内容
                        </th>
                        <td>
							<%= form.getText() %>
                        </td>
                    </tr>
                </table>
            </div>

            <div class="btn flexR">
                <input class="btn-return" type="button" value="戻る" onclick="history.back()">
                <input class="btn-submit" type="submit" value="送信"onclick="location.href='/michimichi/Form?action=done'">
            </div>

        </div>
    	</section>

		</c:param>

</c:import>