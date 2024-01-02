function validateForm() {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    if (name.trim() === "") {
        alert("Name is required.");
        return false;
    }

    if (email.trim() === "") {
        alert("Email is required.");
        return false;
    }

    if (password.trim() === "") {
        alert("Password is required.");
        return false;
    }

    return true;
}
