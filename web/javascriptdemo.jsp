<%-- 
    Document   : javascriptdemo
    Created on : Oct 11, 2017, 1:55:45 PM
    Author     : Bharath kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script>
            function val()
            {
                var x=document.getElementById("demo123").value;
                document.getElementById("labeldemo").innerHTML=x;
            }
            </script>
        <input type="text" id="demo123" onkeyup="val()" ><label id="labeldemo"></label>
    </body>
</html>
