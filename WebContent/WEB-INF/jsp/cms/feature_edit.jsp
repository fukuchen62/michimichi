<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- コメントアウト風になっているのはIEの対応 -->
<script>
<!--
	function check(fnc) {
		var str;

		if (fnc == 1) {
			str = '記事を登録します。よろしいですか？';
		} else if (fnc == 2) {
			str = '記事を更新します。よろしいですか？';
		} else if (fnc == 3) {
			str = '記事を削除します。よろしいですか？';
		}

		if (window.confirm(str)) {
			var ele = document.createElement('input');
			// データを設定
			ele.setAttribute('type', 'hidden');
			ele.setAttribute('name', 'fnc');
			ele.setAttribute('value', fnc);
			// 要素を追加
			document.inputForm.appendChild(ele);

			return true;
		} else {
			//window.alert('キャンセルされました');
			return false;
		}
	}
// -->
</script>

<c:import url="../layout/template_back.jsp">

	<c:param name="title" value="記事作成" />
	<c:param name="keywords" value="" />
	<c:param name="description" value="description。description" />
	<c:param name="mycss" value="" />
	<c:param name="mycss2" value="" />
	<c:param name="myjs" value="js/vendor/lightbox_plus.js" />

	<c:param name="content">

		<div id="wrap">
			<p id="login">
				<c:out value="${loginUser.name}" />
				さまオンライン中 <a href="/michimichi/Logout">ログアウト</a>
			</p>

			<!--while文-->
			<c:choose>
				<c:when test="${!empty post}">
					<h2>記事の編集</h2>
				</c:when>

				<c:otherwise>
					<h2>新規記事作成</h2>
				</c:otherwise>
			</c:choose>

			<c:if test="${!empty errorMsg}">
				<p style="color: #ff0000;">
					<c:out value="${errorMsg}" />
				</p>
			</c:if>

			<form name="inputForm" action="/michimichi/FeatureEdit" method="post">

				<!-- 記事編集 -->
				<c:choose>
					<c:when test="${!empty post}">
						<input type="hidden" name="feature_id" value="${post.feature_id}">
						<table class="entryForm">
							<tr>
								<th width="20">記事の種別ID</th>
								<td width="80%"><select name="type">
										<option value="1"
											<c:if test="${feature.type == 1}"><c:out value="selected"/></c:if>>1:スイーツ</option>
										<option value="2"
											<c:if test="${feature.type == 2}"><c:out value="selected"/></c:if>>2:お土産</option>
										<option value="3"
											<c:if test="${feature.type == 3}"><c:out value="selected"/></c:if>>3:観光名所</option>
										<option value="4"
											<c:if test="${feature.type == 4}"><c:out value="selected"/></c:if>>4:温泉</option>
										<option value="5"
											<c:if test="${feature.type == 5}"><c:out value="selected"/></c:if>>5:くるくるなると</option>
										<option value="6"
											<c:if test="${feature.type == 6}"><c:out value="selected"/></c:if>>6:周辺グルメ</option>
										<option value="7"
											<c:if test="${feature.type == 7}"><c:out value="selected"/></c:if>>7:道の駅グルメ</option>

								</select></td>
							</tr>

							<tr>
								<th width="20%">タイトル</th>
								<td width="80%"><input type="text" name="feature_name"
									value="${post.feature_name}" size="60" required></td>
							</tr>
							<tr>
								<th width="20%">記事内容</th>
								<td width="80%"><textarea rows="4" cols="85" name="content"
										required>${post.content}</textarea></td>
							</tr>

							<tr>
								<th width="20%">画像のURL</th>
								<td width="80%"><input type="text" name="main_photo_path"
									value="${post.main_photo_path}" size="50"></td>
							</tr>

							<tr>
								<th width="20%">画像説明</th>
								<td width="80%"><input type="text" name="alt"
									value="${post.alt}" size="50"></td>
							</tr>

							<tr>
								<th width="20%">表示</th>
								<td width="80%"><input type="radio" name="show_flag"
									value="1"
									<c:if test="${feature.show_flag == 1}"><c:out value="checked"/></c:if>>表示
									<input type="radio" name="show_flag" value="0"
									<c:if test="${feature.show_flag == 0}"><c:out value="checked"/></c:if>>非表示
								</td>
							</tr>

						</table>

						<p class="btn">
							<c:if test="${feature.feature_id != -1}">
								<input class="btns btn-clear" type="submit" name="delete"
									value="削除" onClick="return check(3)">
							</c:if>

							<c:choose>
								<c:when test="${feature.feature_id == -1}">
									<input class="btns btn-send" type="submit" name="save"
										value="登録" onClick="return check(1)">
								</c:when>

								<c:otherwise>
									<input class="btns btn-send" type="submit" name="save"
										value="更新" onClick="return check(2)">
								</c:otherwise>
							</c:choose>
						</p>
					</c:when>

					<%-- 記事の新規作成 --%>
					<c:otherwise>
						<input type="hidden" name="feature_id" value="-1">
						<table class="entryForm">
							<tr>
								<th width="20">記事の種別ID</th>
								<td width="80%"><select name="type">
										<option value="1" selected>1:スイーツ</option>
										<option value="2">2:お土産</option>
										<option value="3">3:観光名所</option>
										<option value="4">4:温泉</option>
										<option value="5">5:くるくるなると</option>
										<option value="6">6:周辺グルメ</option>
										<option value="7">7:道の駅グルメ</option>
								</select></td>

							</tr>
							<tr>
								<th width="20%">タイトル</th>
								<td width="80%"><input type="text" name="feature_name"
									value="" size="30" required></td>
							</tr>

							<tr>
								<th width="20%">記事内容</th>
								<td width="80%"><textarea rows="4" cols="85" name="content"
										required></textarea></td>
							</tr>

							<tr>
								<th width="20%">画像のURL</th>
								<td width="80%"><input type="text" name="main_photo_path"
									value="" size="50"></td>
							</tr>

							<tr>
								<th width="20%">画像説明</th>
								<td width="80%"><input type="text" name="alt" value=""
									size="50"></td>
							</tr>

							<tr>
								<th width="20%">表示</th>
								<td width="80%"><input type="radio" name="showflag"
									value="1" checked>表示 <input type="radio"
									name="show_flag" value="0">非表示</td>
							</tr>

						</table>
						<%-- 隠すデータ 自動採番のものをユーザーに入力させない --%>

						<p class="btn">
							<input class="btns btn-clear" type="reset" value="クリア"> <input
								class="btns btn-send" type="submit" value="登録"
								onClick="return check(1)">
						</p>
					</c:otherwise>
				</c:choose>

			</form>

			<div id="opbtns">
				<a href="/michimichi/CtrlForCms?pge_id=13">管理者ページ</a> <a
					href="/michimichi/CtrlForCms?pge_id=17">特集記事一覧</a>
			</div>
		</div>
		<!-- #wrap end -->
	</c:param>
</c:import>