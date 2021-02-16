<%-- 
    Document   : Alert
    Created on : 16 Feb, 2021, 10:40:20 PM
    Author     : ruchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        //An Emergency message to the guardian.
    <body>
       <p>Emergency!</p>  
       <%  
CheckPulse pulse=(CheckPulse)request.getAttribute("pulse");  
out.print(""+pulse.getSbp()+""+pulse.getDbp());  
%>  
<%@ include file="Rate.jsp" %> 
    </body>
</html>
