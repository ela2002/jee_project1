<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../../css/signin.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Sign In</title>
</head>
<body>
<input type="hidden" id="status" value=${status}>
<div class="container">
  <div class="row">
    <div class="col" id="col1">
      <a href=""
        ><img id="orange_logo"
          src="../../assets/orange logo.png"
          alt="logo"
          width="100px"
          height="50px"
      /></a>
      <div id="rowinp" class="row ">
      <div class="col-7 mt-4">
        <img class=" mx-auto d-block" id="user_img" src="../../assets/user2.png" alt="user_account" width="50px" height="90px" />
        <form action="login" method="post" class="needs-validation">
        <div class="input-group mt-4 mb-3">
          <input
            type="email"
            class="form-control"
            id="email"
            placeholder="Enter email"
            required
          />
          <div class="valid-feedback">
      Looks good!
    </div>
          <div class="invalid-feedback">
        Please fill out this field
      </div>
        </div>
        
        <div class="input-group mb-3">
          <input
            type="password"
            class="form-control"
            id="password"
            placeholder="Enter password"
            required
          />
           <div class="valid-feedback">
      Looks good!
    </div>
          <div class="invalid-feedback">
        Please fill out this field
      </div>
        </div>
      
      <div class="text-center">
        <button type="submit" class="btn" >Sign In</button>
      </div>
      </form>
    </div>
    </div>
      </div>
      <img id="img_signin" src="../../assets/signin.png" alt="sing_in">

    <div class="col-5" id="col2">
      <h2><b> Glad to see you again !</b></h2>
      <p>Access your account now and start exploring</p>
    </div>
  </div>
</div>

<script type="text/javascript">
var status = document.getElementById("status").value;
if(status== "failed")
	swal("Sorry","Wrong email or password","error");
	
</script>

</body>
</html>