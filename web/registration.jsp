<%-- 
    Document   : registration
    Created on : Oct 11, 2017, 1:43:03 PM
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
        <form   method="post">
        <center><table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstname" maxlength="30" required></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastname" maxlength="30" required></td>
            </tr>
            <tr>
                <td>E-mail:</td>
                <td><input type="text" name="email" maxlength="30" required></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" maxlength="30" required></td>
            </tr>
            <tr>
                <td>Re-Password:</td>
                <td><input type="password" name="repassword" maxlength="30" required></td>
            </tr>
            <tr>
                <td>Phone Number:</td>
                <td><input type="text" name="phonenumber" maxlength="30" required></td>
            </tr>
            <tr>
                <td><input type="submit" value="register" onclick="validity()"></td>
            </tr>
            </table></center>
    </form>
        <%
            
            %>
    </body>
</html>
