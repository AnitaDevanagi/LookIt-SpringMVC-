<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forget password</title>
 <style type="text/css">
   #heading{
      background-color:lightpink;
      padding:9px;
   } 
   #heading table{
    width:100%;
   }
   #anchor a{
     float:right;
     padding:9px;
     margin-right: 15px;
   }
   #head input{
     padding:4px;
     margin:5px;
   }
   
 </style>
</head>
  <body>
  <div id="heading">
   <table>
      <tr>
        <td><h1>LookIt</h1></td>
       <td id="anchor"><a href="LogIn.jsp">LogIn</a>
        <a href="index.jsp">SignUp</a> </td>
      </tr>
    </table>
   </div>
      <form action="OTP" method="post">
      <h1>Forget Password</h1>
      <div id="head"> <table>
           <tr>
           <td>Email :</td> 
           <td> <input type="email" name="email"></td>
          </tr>
          <tr> 
             <td><input type="Submit" value="Send OTP"> </td>
             <td> <input type="Reset" value="Clear"></td>
          </tr>
       </table>
       </form>
       <h4 style="color:red">${responsemsg}</h4>
       <form action="forgetpassword" method="post">
       <table>
           <tr>
              <td>Email :</td>
              <td><input type="email" name="email"></td>
           </tr>
           
           <tr>
             <td>OTP :</td>
             <td><input type="number" name="otp"></td>
           </tr>
            
            <tr> 
               <td>New Password :</td>
               <td><input type="password" name="newpassword"></td>
            </tr>
           
           <tr> 
              <td>Confirm NewPassword :</td>
              <td><input type="password" name="confirmNewpassword"></td>
           
           </tr>
           
        <pre ><tr><td>  <input type="submit" name="Submit">   <input type="reset" name="clear"> </td><tr> </pre>
              
        
       </table>
      </div>
      </form>
  </body>
  </html>