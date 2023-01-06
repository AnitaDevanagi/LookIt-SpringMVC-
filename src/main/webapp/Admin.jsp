<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>

<style type="text/css">
  #header{
       background-color:lightgreen;
       padding:10px;
  } 
  #header table{
     width:100%;
  }  
  #header a{
    float:right;
    padding:10px;
    margin-right: 9px;
  }
 </style>
 <div id="header">
     <table>
     <tr>
        <td><h1>LookIt</h1><td>
   
       <td> 
            <a href="index.jsp">LogOut</a>
           
            
       </td>
       </tr>
    
     </table>
   </div>


    
 <form  action="getallopenticket"  method="post">
     <select name="status">
       <option  value="open">Open</option>
        <option  value="close">Close</option>
     </select>
     <input type="submit" value="GetTicket">
    </form>
     
     <table border="2" cellpadding="9" cellspacing="4">    .
    
           <tr>
            <th>Id</th>
            <th>Email</th>
            <th>Issue</th>
            <th>Createdate</th>
           <th>status</th>
            <th>model</th>
          </tr>
          
          
           <c:forEach var="details" items="${msg}">
           <tr>
           
           <td><c:out value="${details.id}" /></td>
           <td><c:out value="${details.email}" /></td>
           <td><c:out value="${details.issue}" /></td>
           <td><c:out value="${details.createdate}" /></td>
            <td><c:out value="${details.status}" /></td>
            <td><c:out value="${details.model}" /></td>  
           </tr>
        </c:forEach>
    
   
 
 </table>

      
        
</body>
</html>