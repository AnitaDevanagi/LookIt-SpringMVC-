<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
<script type="text/javascript">

    function showTicket(){
    	var x= document.getElementById("inputs");
    	if(x.style.display === "none"){
    		x.style.display="block";
    	}else{
    		x.style.display="none";
    	}
    	 
    }
    

    function getallticket(){
    	var x= document.getElementById("call");
    	if(x.style.display === "none"){
    		x.style.display="block";
    	}else{
    		x.style.display="none";
    	}
    	 
    }

   
    function saveDataInLocalSession(email,model,issue){
        	   console.log(email);
        	 localStorage.setItem("email",email);
        	 localStorage.setItem("model",model);
        	 localStorage.setItem("issue",issue);
        	
        }
</script>
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
 #inputs input {
      padding:3px;
      margin:9px;
 }

 #click{
   padding:6px;
   margin:5px;
 }
 #inputs{
     display:none;
 }
 #call input{
   padding:3px;
   margin:7px;
 }
 #button input{
  margin:7px;
 }
</style>
</head>
<body onload= "saveDataInLocalSession('${responsemsg}')"> 
  

<div id="header">
     <table>
     <tr>
        <td><h1>LookIt</h1><td>
   
       <td> 
            <a href="index.jsp">LogOut</a>
            <a href="getprofile/${responsemsg}">Profile</a>
            <a href="Admin.jsp">Admin</a>
       </td>
       </tr>
    
     </table>
   </div>
   
 <form  action="customer"  method="post">
 
     <h4>Click On The button to create new ticket or Get all ticket</h4>
   
   <div id="click"><input type="button" value="Create new ticket"  onclick="showTicket()"> 
   
    <input type="button" value="Get all ticket"  onclick="getallticket()"></div>
  
   
   <div id="inputs">
    <table>
        <tr>
           <td>Email :</td>
           <td><input type="email" name="email"></td>
        </tr>
        
        <tr>
         <td>Model :</td>
         <td><input type="text"  name="model"></td>
        </tr>
        
        <tr> 
          <td>Issue :</td>
          <td><textarea name="issue"  rows="4" cols="50"> </textarea></td>
        </tr>
        
        <tr><td><input type="submit" value="Submit"> <input type="submit" value="clear"></td></tr>

     </table>
     </div>
     <div id="call">
        <table>
        <tr> 
          <td>Email :</td>
          <td> <input type="email" name="email"></td>
          </tr>
        <tr> <td><input type="submit" value="Submit"> </td><td><input type="submit" value="clear"></tr>
      </table>
      </div>
      
     
        
  </form>
   
   <form action="getprofile" method="get" >
      <h4>WelCome ${responsemsg}</h4>
    <h4>GetAllTicket details</h4>
        <div>Email: ${details.email}</div>
        <div>issue: ${details.issue}</div>
        <div>CreateDate: ${details.createdate}</div>
        <div>model: ${details.model}</div>
        <div>Status: ${details.status }</div>
        </form>
  
  </body>
</html>