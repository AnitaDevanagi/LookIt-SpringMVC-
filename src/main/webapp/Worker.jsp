<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Worker page</title>
<style>
 #header{
     background-color: lightgray;
     padding: 25px;
 }
 #header table{
    width:100%;
 }
 #header a{
    float:right;
    margin-right: 20px;
 }

</style>

</head>
<body>
<div id="header">
  <table>
     <tr>
       <td><h1>LookIt</h1></td>
       <td><a href="index.jsp">LogOut</a></td>
     </tr>
  </table>
</div>
 <form  action="getallticket"  method="post">
     <select name="asignee">
       <option  value="worker">Worker</option>
        <option  value="admin">Admin</option>
         <option  value="admin">Customer</option>
     </select>
    
     <input type="submit" value="GetTicket">
     
     </form>
    <table border="2" cellpadding="9" cellspacing="4">
    
           <tr>
            <th>Id</th>
            <th>Email</th>
            <th>Issue</th>
            <th>Createdate</th>
           <th>status</th>
            <th>model</th>
            <th>asignee</th>
          </tr>
          
          
           <c:forEach var="details" items="${msg}">
           <tr>
           
           <td><c:out value="${details.id}" /></td>
           <td><c:out value="${details.email}" /></td>
           <td><c:out value="${details.issue}" /></td>
           <td><c:out value="${details.createdate}" /></td>
            <td><c:out value="${details.status}" /></td>
            <td><c:out value="${details.model}" /></td> 
             <td><c:out value="${details.asignee}" /></td> 
           </tr>
        </c:forEach>
    
   
 
 </table>

   
</body>
</html>