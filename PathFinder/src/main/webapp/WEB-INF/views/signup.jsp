<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../../css/signup.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title> Sign Up </title>
</head>
<body>
<div class="container">
  <div class="row">
    <!-- chtar lewel-->
    <div class="col-4" id="col1">
      <img src="" alt="logo" width="80px" height="50px" />
      <h2 id="title1"><b> Welcome !</b></h2>
      <p>Sign up and start exploring new opportunities</p>
      <button class="btn offset-3" id="btn_sign_in" type="button">
        Sign In
      </button>
      <img
        id="img_signup"
        src="../../assets/signup.png"
        alt="sign_up_img"
        width="150px"
        height="250px"
      />
    </div>

    <!-- chtar theni-->
    <div id="col2" class="col">
      <h2 id="title2" class="mt-2"><b>Create Account</b> </h2>

      <div class="text-center">
        <p id="p" class="text-muted mt-4">
          Use your social media account for registration
        </p>
        <a href=""
          ><img id="img1" src="../../assets/google.png" alt="gmail" class="img"
        /></a>
        <a href=""
          ><img id="img2" src="../../assets/fb.png" alt="facebook" class="img"
        /></a>
        <a href=""
          ><img
            id="img3"
            src="../../assets/insta.png"
            alt="instagram"
            class="img"
        /></a>
      </div>
      <form action="signuppage" method="post" class="needs-validation">
      <div class="col-6 offset-3 mt-4">
          <div class="input-group mb-3">
            <span class="input-group-text">
              <i class="fa-solid fa-user"></i>
            </span>
            <input
              type="text"
              class="form-control"
              id="nom"
              placeholder="Enter nom"
              required
            />
            <div class="valid-feedback">
      Looks good!
    </div>
          <div class="invalid-feedback">
        Please fill out this field
      </div>
          </div>
          
        <div class="col-6 offset-3 mt-4">
          <div class="input-group mb-3">
            <span class="input-group-text">
              <i class="fa-solid fa-user"></i>
            </span>
            <input
              type="text"
              class="form-control"
              id="prenom"
              placeholder="Enter prenom"
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
            <span class="input-group-text">
              <i class="fa-solid fa-envelope"></i>
            </span>
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
            <span class="input-group-text">
              <i class="fa-solid fa-lock"></i>
            </span>
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
          <div class="input-group mb-3">
            <span class="input-group-text">
              <i class="fa-solid fa-user-check"></i>
            </span>
            <input
              type="password"
              class="form-control"
              id="confirm-password"
              placeholder="Confirm password"
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
            <button type="submit" class="btn" id="btn_sign_up">Sign Up</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>

</body>
</html>