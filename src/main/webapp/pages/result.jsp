<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<body>
	<h1>Struts 2 &lt;s:file&gt; file upload example</h1>
	
	<h4>
	   File Name : <s:property value="fileUploadFileName"/> 
	</h4> 
	
	<h4>
	   Content Type : <s:property value="fileUploadContentType"/> 
	</h4> 
	
	<h4>
	   File : <s:property value="fileUpload"/> 
	</h4> 
	
	<h4>
	   Number of lines : <s:property value="nbLines"/> 
	</h4>
	
	<h4>
	  <s:a action="showLinesAction">Show lines</s:a>
	</h4>
</body>
</html>