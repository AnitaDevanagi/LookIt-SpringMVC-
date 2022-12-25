<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <html>
     <head>
    <title>Registration Form</title>
       <script type="text/javascript">
    
    function validate () {
        var b =/^[A-Za-z]$/;
          var a=document.getElementById("fname").value;

         
         if(a.length<3){
            document.getElementById("Message").innerHTML="firstName must be greater than 3";
            return false;
             

         }
        if(a.length>10 ){
          document.getElementById("Message").innerHTML="firstName must be gless than 10";
          return false;
             
        }
        if(a.match(b))
            true;
        else{
            document.getElementById("Message").innerHTML="only alphbets are allowed";
            
         
        }
    }
    
    function validatesurname (){
    	var y =/^[A-Za-z]$/;
        var x=document.getElementById("srname").value;

       
       if(x.length<3){
          document.getElementById("Msg").innerHTML="surname must be greater than 3";
          return false;
           

       }
      if(x.length>10 ){
        document.getElementById("Msg").innerHTML="surname must be gless than 10";
        return false;
           
      }
      if(x.match(y))
          true;
      else{
          document.getElementById("Msg").innerHTML="only alphbets are allowed";
          
       
      }
    	
    	
    }
    function validpassword () {
        var pass=document.getElementById('pass');
        var upper=document.getElementById('upper');
        var lower=document.getElementById('lower');
        var symbol=document.getElementById('specialchar');
        var num=document.getElementById('number');
        var len=document.getElementById('length');
        if(pass.value.match(/[0-9]/)){
            num.style.color='green';

        }
        else{
            num.style.color='red';
        }
        if(pass.value.match(/[A-Z]/)){
            upper.style.color='green';

        }
        else{
            upper.style.color='red';
        }
        if(pass.value.match(/[a-z]/)){
            lower.style.color='green';

        }
        else{
            lower.style.color='red';
        }
        if(pass.value.match(/[!\@\#\$\^\*\+\-\>\<\.\,\%]/)){
            symbol.style.color='green';

        }
        else{
            symbol.style.color='red';
        }
        if(pass.value.length>8 && pass.value.length<20){
            len.style.color='green';

        }
        else{
            len.style.color='red';
        }

    }
    
    function validatecity (){
    	
        	var y =/^[A-Za-z]$/;
            var x=document.getElementById("ct").value;

           
           if(x.length<3){
              document.getElementById("correct").innerHTML="cityname must be greater than 3";
              return false;
               

           }
          if(x.length>10 ){
            document.getElementById("correct").innerHTML="cityname must be gless than 10";
            return false;
               
          }
          if(x.match(y))
              true;
          else{
              document.getElementById("correct").innerHTML="cityname alphbets are allowed";
              
           
          }
       }
    function validatestate (){
    	
    	var y =/^[A-Za-z]$/;
        var x=document.getElementById("st").value;

       
       if(x.length<3){
          document.getElementById("unique").innerHTML="cityname must be greater than 3";
          return false;
           

       }
      if(x.length>10 ){
        document.getElementById("unique").innerHTML="cityname must be gless than 10";
        return false;
           
      }
      if(x.match(y))
          true;
      else{
          document.getElementById("unique").innerHTML="cityname alphbets are allowed";
          
       
      }
   }
    function validatecountry (){
    	
    	var y =/^[A-Za-z]$/;
        var x=document.getElementById("count").value;

       
       if(x.length<3){
          document.getElementById("uniqueTwo").innerHTML="cityname must be greater than 3";
          return false;
           

       }
      if(x.length>10 ){
        document.getElementById("uniqueTwo").innerHTML="cityname must be gless than 10";
        return false;
           
      }
      if(x.match(y)){
          true;
      }
      else{
          document.getElementById("uniqueTwo").innerHTML="cityname alphbets are allowed";
          
       
      }
   }
    
    
    </script>
    
    <style type="text/css">
      #header{
        background-color:lightgreen;
        padding:15px;
      }
      #header table{
      width:100%;
      }
      #anchor a{
      float:right;
      margin-right: 8px;
      padding:10px;
      }
      
     #heading{
       text-align:center;
       text-transform:capitalize;
       color:purple;
      }
      #register{
      text-align: center;
      }
     
      #footer{
          background-color: lightpink;
          padding:2px;
       
      }
      #footer a{
        padding:5px;
      }
      #login input{
          padding:4px;
          margin:8px;
      }
     #App{
      Color:navy;
     }
  
      
      
    </style>
    
     </head>
	<body id="back">
     <h1 id="heading">Registration Form</h1>
    <div id="header"> <table>
     <tr>
     <td id="App"><h1>LookIt</h1> </td>
     <td id="anchor"> <a href="ForgetPassword.jsp">Forget Password</a>
     <a href="LogIn.jsp">LogIn</a>
     </td>
     </tr>
     </table>
     </div>
     
    
    <form action="signUp" method="post">
     
       
     <div id="login">
             <h2>SignUp</h2>
   <table>
      <tr>
       <td>FirstName :</td>
       <td> <input type="text" name="firstname"  id="fname" onkeyup="return validate()">
       <span id="Message"></span></td>
     </tr> 
   
    
    <tr>
       <td>SurName :</td>
       <td> <input type="text" name="surname"  id="srname" onkeyup="return validatesurname ()">
     	<span id="Msg"></span></td>
    </tr>
     
     
     <tr>
     	<td>Email :</td>
    	<td> <input type="email" name="email"  pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required></td>
     </tr>
     
     <tr>
    	 <td>Password :</td>
     	<td> <input type="password" name="password" id="pass" onkeyup="return validpassword ()"></td></br>
          <td>  <span id="upper">Atleast one Uppercase</span><br>
            <span id="lower">atleast ine lowercase</span></br>
            <span id="specialchar">atleast one special symbol</span><br>
            <span id="number">atleast  one number</span><br>
             <span id="length">characters should be min 8 and max 20</span><br></td>
       </tr>
      
      <tr>  
     	<td>ConfirmPassword :</td>
      	<td><input type="password" name="confirmpassword" required></td>
      	</tr>
    
    <tr>
   		<td>DOB :</td>
      <span id="date"> <td><input type="date" name="dob"></td></span>
     </tr>
     
     <tr>
     	<td>Contact :</td>
     	<td><input type="tel" name="contact" pattern="[0-9]{10}" required><td>
     </tr>
     	
     <tr>
    	 <td>City :</td>
    	 <td><input type="text" name="city"  id="ct" onkeyup="return validatecity ()">
     		<span id="correct"></span><td>
    </tr>
     
     <tr>
    	 <td>State :</td>
    	 <td><input type="text" name="state"  id="st"  onkeyup="return validatestate ()">
    		 <span id="unique"></span></td>
    </tr>
     
     <tr>
    	 <td>Country :</td>
    	 <td><input type="text" name="country" id="count" onkeyup="return validatecountry ()">
     		<span id="uniqueTwo"></span> </td>
    </tr>
     
     <tr>
    	 <td>Pincode :</td>
     	 <td><input type="number" name="pincode" > </td>
     </tr>
     
     <tr>
     <td>Profile :</td>
     <td>
       <select name="profile">
       <option value="select" >select</option>
       <option value="customer">Customer</option>
       <option value="admin">Admin</option>
       <option value="worker">Worker</option>
     </select>
     
     </td>
     </tr>
    
     
     <tr>
   		  <td><input type="checkbox" name="TermsandCondition" value="TermsandCondition" required >Terms and Condition</td>
    </tr> 
     
     <tr>
         <td><input type="submit" value="SignUp">  <input type="reset" value="Reset"></td>
    </tr>
    
   </table>
    </div>
 </form>
    
    
     <div id="footer">
     <h4>English(UK)</h4>
     <h4><a href="index.jsp">SignUp</a> <a href="LogIn.jsp">signIn</a> </h4>   
     <h5>copyright</h5>
     </div>
	</body>
</html>
