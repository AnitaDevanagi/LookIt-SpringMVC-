<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn page</title>

 <style type="text/css">
     #header{
      background-color: lightblue;
      padding:10px;
     } 
    #header table {
       width:100%;
      
     }
     .anchor a{
        float:right;
        padding:10px;
        margin-right: 8px;
     }
      
    #table input{
      padding:4px;
      margin:5px;
   }
 
   
   </style>
   
  
</head>
        <body>
        <div id="header">
        <table>
         <tr>
        <td> <h1>LookIt</h1></td>
        <td class="anchor"> <a href="index.jsp">SignUp</a>
             <a href="ForgetPassword.jsp">Forget Password</a>
            
            
         </tr></table></div>
        
         
         
         <h4>${responsemsg}</h4> 
        <form action="login" method="post">
       <h2>LogIn</h2>
        
         <div id="table"> <table>
           <tr>
           <td>Email :</td>
           <td><input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
           </tr>
         
           
           <tr>
           <td>Password :</td>
           <td><input type="password" name="password"></td>
           </tr>
           
             <tr>
             <td>Profile :</td>
             <td>
              <select name="profile">
                <option>select</option>
                <option>customer</option>
                <option>admin</option>
                <option>worker</option></td>
              </select>
             </tr>
           <td><input type="submit"  value="LogIn">
           <td><input type="reset"  value="Reset">
           
           </tr>
          
          </table></div>
       </form>
        </body>
      
</html>