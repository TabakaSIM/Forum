function validate() {
    var email = document.getElementById("email");
    var name = document.getElementById("name");
    var password = document.getElementById("password");
    var password2 = document.getElementById("password2");
    var info = document.getElementById("info");

    var loginRegex = /^.{5,}$/;
    var passwordRegex = /^.{5,}$/;
    var emailRegex = /^[\w\.-]+@[\w\.-]+\.[A-Za-z0-9]{2,3}$/;

    var result = true;
    var infoResult = "";

    if(!emailRegex.test(email.value)) {
        infoResult = infoResult + "Zły email <br>";
        email.style.background = "#fcc2c2";
        result = false;
    } else {
        email.style.background = "#ffffff";
    }

    if(!loginRegex.test(login.value)) {
        infoResult = infoResult + "Zły login <br>";
        login.style.background = "#fcc2c2";
        result = false;
    } else {
        login.style.background = "#ffffff";
    }

    if(!passwordRegex.test(password.value)) {
        infoResult = infoResult + "Złe hasło <br>";
        password.style.background = "#fcc2c2";
        result = false;
    } else {
        password.style.background = "#ffffff";
    }

    if(password.value != password2.value) {
        infoResult = infoResult + "Hasła się nie zgadzają <br>";
        password.style.background = "#fcc2c2";
        password2.style.background = "#fcc2c2";
        result = false;
    } else if(!passwordRegex.test(password2.value)) {
        infoResult = infoResult + "Złe hasło2 <br>";
        password2.style.background = "#fcc2c2";
        result = false;
    } else {
        password.style.background = "#ffffff";
        password2.style.background = "#ffffff";
    }

    info.innerHTML = infoResult;
    return result;
}