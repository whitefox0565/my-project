<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <script src="<c:url value='/js/jquery-3.7.1.min.js'/>"></script>
  <script src="<c:url value='/js/imageFileUpload.js'/>"></script>
  <script src="<c:url value='/js/myPageForm.js'/>"></script>
  <script src="<c:url value='/js/myPageInfo.js'/>"></script>
  <c:import url="/WEB-INF/views/layout/head.jsp" />
 </head>
 <body>
  	<c:import url="/WEB-INF/views/layout/top.jsp" />
  	<div class="bodyContents">
        <div id="myPageForm">
            <div id="myPageContainer" class="noto-sans-kr">
                <div id="myPageTitleBox">
                    <div id="myPageTitle">마이페이지</div>
                </div>
                <div id="myPageContentsBox">
                    <div id="myPageLeftBox">
                        <div id="myPageInfoBox">
                            <input type="file" id="fileInput" name="profileImage">
                            <div id="myPageImageBox">
                                <img id="memImg" src="<c:url value='/images/${vo.memImgNo}' />">
                                <img id="memImgModify" src="<c:url value='/image/myPageImageModify.png' />">
                            </div>
                            <div id="myPageInfoNick">테스트계정1</div>
                            <div id="myPageInfoEmail">qwerty1234@gmail.com</div>
                        </div>
                        <div id="myPageMenuBox">
                            <div class="myPageMenuEach">
                            	<a href="<c:url value='/member/myPageForm' />">내 프로필</a>
                            </div>
                            <div class="myPageMenuEach">
                            	<a href="<c:url value='/member/myPageChildInfo' />">등록정보</a>
                            </div>
                            <div class="myPageMenuEach" style="font-weight: 600; font-size: 21px; text-decoration: underline; text-underline-offset: 15px; text-decoration-thickness: 2px;">
                            	<a href="/awards">수상내역</a>
                            </div>
                            <div id="memDeleteAccount">
                            	회원탈퇴
                            </div>
                        </div>
                    </div>
                    <div id="myPageRightBox">
			<div id="memberManageContentsBox">
				<div id="memberManageLeftBox">
					<div id="memberManageNameSearchBox">
						<img id="memberManageNameSearchImage" src="<c:url value='/image/mapSearch.png' />">
						<input type="text" id="memberManageNameSearch" name="memberManageNameSearch"
							placeholder="이름 검색" value="">
					</div>
					<div id="memberManageNameBox1">
							<div class="memberManageNameEach">김대현</div>
							<div class="memberManageNameEach">박동수</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">이명해</div>
							<div class="memberManageNameEach">박동수</div>
							<div class="memberManageNameEach">박동수</div>
					</div>
					<div id="memberManageNameBox2">
						<div id="memberManageGymSearchBox"></div>
					</div>
				</div>
				<div id="memberManageRightBox">
					<div id="memberManageMemberInfo">
						<img id="memberManageMainImage" src="<c:url value='/image/whiteFox.png' />">
						<div id="memberManageMemberName"></div>
						<div class="memberManageMemberContents"><img id="memberManageName" src="<c:url value='/image/mapManager.png'/>" class="memberImage"><span id="memberManageNameText">박동수</span></div>
						<div class="memberManageMemberContents"><img id="memberManageAge" src="<c:url value='/image/myPageAge.png'/>" class="memberImage"><span id="memberManageAgeText">27</span></div>
						<div class="memberManageMemberContents"><img id="memberManageGender" src="<c:url value='/image/myPageGender.png'/>" class="memberImage"><span id="memberManageGenderText">남</span></div>
						<div class="memberManageMemberContents"><img id="memberManageNumber" src="<c:url value='/image/mapNumber.png'/>" class="memberImage"><span id="memberManageNumberText">010-5429-3187</span></div>
						<div class="memberManageMemberContents"><img id="memberManageBelt" src="<c:url value='/image/myPageBelt.png'/>" class="memberImage"><span id="memberManageBeltText">흰띠</span></div>
						<div class="memberManageMemberContents"><img id="memberManageDate" src="<c:url value='/image/myPageDate.png'/>" class="memberImage"><span id="memberManageDateText">2024-08-23</span></div>
						<div id="memberManageLink"><a href="<c:url value='/member/loginForm' />"><span id="memberManageGymLink"></span></a></div>
					</div>
				</div>
			</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
  	<c:import url="/WEB-INF/views/layout/bottom.jsp" />
 </body>
</html>