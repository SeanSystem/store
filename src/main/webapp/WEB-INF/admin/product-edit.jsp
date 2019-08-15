<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
	<form id="contentEditForm" class="itemForm" method="post">
	
		<!--<input type="hidden" name="categoryId"/>-->	
		<input type="hidden" name="pid"/>
	    <table cellpadding="5">
	        <tr>
	            <td>商品标题:</td>
	            <td><input class="easyui-textbox" type="text" name="pname" data-options="required:true" style="width: 280px;"></input></td>
	        </tr>
	        <tr>
	            <td>商品卖点:</td>
	            <td>
	          	  <input class="easyui-textbox" name="sellpoint" data-options="multiline:true,validType:'length[0,150]'" style="height:60px;width: 280px;"></input>
	            </td>
	        </tr>
	        <tr>
	            <td>市场价:</td>
	            <td><input class="easyui-numberbox" type="text" name="marketPrice"  data-options="required:true" ></input></td>
	            
	        </tr>
	         <tr>
	            <td>商城价:</td>
	            <td><input class="easyui-numberbox" type="text" name="shopPrice" data-options="required:true" ></input></td>
	        </tr>
	        
	         <tr>
	            <td>商品数量:</td>
	            <td><input class="easyui-textbox" type="text" name="count" data-options="required:true" ></input></td>
	        </tr>
	         
	        <tr>
	            <td>是否热门:</td>
	            <td>
	            	<input type="radio" name="isHot" value="1">是
	              	<input type="radio" name="isHot" value="0">否
	            </td>
	        </tr>
	        
	        <tr>
	            <td>商品图片:</td>
	            <td>
	                <input type="hidden" name="image" />
	                <a href="javascript:void(0)" class="easyui-linkbutton onePicUpload">图片上传</a>
	            </td>
	        </tr>
	        <tr>
	            <td>商品描述:</td>
	            <td>
	                <textarea style="width:800px;height:300px;visibility:hidden;" name="pDesc"></textarea>
	            </td>
	        </tr>
	       
	    </table>
	</form>
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="contentEditPage.clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
var contentEditEditor ;
$(function(){
	contentEditEditor = TT.createEditor("#contentEditForm [name=pDesc]");
	TT.initOnePicUpload();
});

var contentEditPage = {
		submitForm : function(){
			if(!$('#contentEditForm').form('validate')){
				$.messager.alert('提示','表单还未填写完成!');
				return ;
			}
			contentEditEditor.sync();
			
			$.post("${pageContext.request.contextPath}/adminProduct/updateProduct",$("#contentEditForm").serialize(), function(data){
				if(data=="ok"){
				 	$.messager.alert('提示','修改商品信息成功!');
					$("#contentList").datagrid("reload");
					TT.closeCurrentWindow();
				}else if(data=="error"){
					$.messager.alert('提示','修改商品信息失败功!请稍后再试！');
				}
			});
		},
		clearForm : function(){
			$('#contentEditForm').form('reset');
			itemAddEditor.html('');
		}
};

</script>