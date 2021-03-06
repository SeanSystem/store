<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!doctype html>

<html>

	<head>
		<meta charset="utf-8" />
		
		<title>商品列表</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" />
		<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>
		<!-- 引入自定义css文件 style.css -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" />

		<style>
			body {
				margin-top: 20px;
				margin: 0 auto;
				width: 100%;
			}
			.carousel-inner .item img {
				width: 100%;
				height: 300px;
			}
		</style>
	</head>

	<body>
		<div class="container-fluid">
		<!--
           	描述：菜单栏
           -->
		<jsp:include page="../jsp/head.jsp"></jsp:include>
		
		<div class="row" style="width:1210px;margin:0 auto;">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><a href="${pageContext.request.contextPath}/${p.pimage}">首页</a></li>
				</ol>
			</div>
		<c:forEach items="${bean.list }" var="p">
			<div class="col-md-2 col-xs-6 col-sm-4">
				<a href="${pageContext.request.contextPath }/product/getProductById?pid=${p.pid}">
					<img src="${pageContext.request.contextPath}/${p.image}" width="170" height="170" style="display: inline-block;">
				</a>
				<p><a href="product_info.html" style='color:green'>${fn:substring(p.pname,0,12) }...</a></p>
				<p><font color="#FF0000">商城价：&yen;${p.shopPrice}</font></p>
			</div>

		</c:forEach>	
		</div>

		<!--分页 -->
		<div style="width:380px;margin:0 auto;margin-top:50px;">
			<c:if test="${empty bean }">
				<div class="container">
					<h2>该分类暂无商品~~</h2>
				</div>
			</c:if>
			<c:if test="${not empty bean  }">
			<ul class="pagination" style="text-align:center; margin-top:10px;">
				<c:if test="${bean.currPage-1==0 }">
					<li class="disabled"><a href="javascript:void(0);" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
				</c:if>
				<c:if test="${bean.currPage-1!=0 }">
					<li class=""><a href="${pageContext.request.contextPath }/product/getProductByPage?cid=${cid}&currPage=${bean.currPage-1}" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
				</c:if>
				<fmt:parseNumber integerOnly="true" value="${(bean.currPage/bean.pageSize)}" var="z"></fmt:parseNumber>
				
				<c:set var="bg" value="${bean.currPage%bean.pageSize==0?bean.currPage-bean.pageSize+1:z*bean.pageSize+1}"></c:set>
				
				<c:set var="ed" value="${bg+bean.pageSize-1>bean.totalPage?bean.totalPage:bg+bean.pageSize-1}"></c:set>
				
				<c:forEach begin="${bg}" end="${ed}" var="n">
			
				<c:if test="${n==bean.currPage }"> 
					<li class="active"><a href="javascript:void(0);">${n}</a></li>
				</c:if>
				<c:if test="${n!=bean.currPage }" >
					<li class=""><a href="${pageContext.request.contextPath }/product/getProductByPage?cid=${cid}&currPage=${n}">${n}</a></li>
				</c:if>
				
				</c:forEach>
				
				<c:if test="${bean.currPage+1>bean.totalPage }">
					<li class="disabled">
						<a href="javascript:void(0);" aria-label="Next">
							<span aria-hidden="true">&raquo;</span>
						</a>
					</li>
				</c:if>
				<c:if test="${bean.currPage+1<=bean.totalPage }">
					<li class="">
						<a href="${pageContext.request.contextPath }/product/getProductByPage?cid=${cid}&currPage=${bean.currPage+1}" aria-label="Next">
							<span aria-hidden="true">&raquo;</span>
						</a>
					</li>
				</c:if>
			</ul>
			</c:if>
			
			
		</div>
		<!-- 分页结束=======================>

		<!--
       		商品浏览记录:
        -->
		<div style="width:1210px;margin:0 auto; padding: 0 9px;border: 1px solid #ddd;border-top: 2px solid #999;height: 246px;">
				<!-- ${pageContext.request.contextPath }/product?method=clearHistory&cid=${cid}&currPage=${bean.currPage} -->
			<h4 style="width: 50%;float: left; font: 14px/30px '微软雅黑';">浏览记录<small><a href="javascript:void(0);" onclick="clearHistory()">清除记录</a></small></h4>
			<div style="width: 50%;float: right;text-align: right;"><a href="">more</a></div>
			<div style="clear: both;"></div>

			<div style="overflow: hidden;">

				<ul id="hisId" style="list-style: none;">
					<c:set var="history" value="${cookie.history.value }"></c:set>
				
				</ul>

			</div>
		</div>
		
		<!-- 引入底部文件 -->
		<jsp:include page="../jsp/foot.jsp"></jsp:include>
		
		
	<script type="text/javascript">
		var $history = "${history}";
		if($history!=null && $history!=""){
			
			$.get("${pageContext.request.contextPath}/product/getProductHistory",{"ids":$history},function(data){
				
				if(data!=null && data.length>0){
					$("#hisId").empty();
					$(data).each(function(){
						
						$("#hisId").append($("<a href='${pageContext.request.contextPath}/product/getProductById?pid="+this.pid+"'><li style='width: 150px;height: 216;float: left;margin: 0 8px 0 0;padding: 0 18px 15px;text-align: center;'><img src='${pageContext.request.contextPath}/"+this.image+"'width='130px' height='130px' /></li></a>"));
					});
				}
			},"json");
		}else{
			
			$("#hisId").append("<h3>您没有浏览过任何的商品</h3>");
		}
		
		function clearHistory(){
			
			$.get("${pageContext.request.contextPath }/product/clearProductHistory",function(result){
				
				if(result == "ok"){
					
					$("#hisId").empty();
					$("#hisId").append("<h3>您没有浏览过任何的商品</h3>");
				}
			});
		}
	</script>
	</div>
	</body>

</html>