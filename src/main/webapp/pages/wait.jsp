<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="refresh" content="2;url=<s:url includeParams="all" />"/>
</head>
 
<body>
<h1>Struts 2 execAndWait example</h1>

<h3>Please wait while we process your request... <s:property value="counter"/>  out of <s:property value="nbLines"/></h3>

</body>
</html>