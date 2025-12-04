
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
</head>
<body>

<h2>Registration Form</h2>

<form action="VoterServlet" method="POST">

    <label for="name">Full Name *</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="gender">Gender *</label><br>
    <select id="gender" name="gender" required>
        <option value="" disabled selected>Select your gender</option>
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="other">Other</option>
        <option value="prefer-not-to-say">Prefer not to say</option>
    </select><br><br>

    <label for="age">Age *</label><br>
    <input type="number" id="age" name="age" min="13" max="120" required><br><br>

    <label for="mobile">Mobile Number *</label><br>
    <input type="tel" id="mobile" name="mobile" pattern="[0-9]{10}" minlength="10" maxlength="10" required><br>
    <small>Enter a 10-digit mobile number</small><br><br>

    <label for="dob">Date of Birth *</label><br>
    <input type="date" id="dob" name="dob" required><br><br>

    <button type="submit">Submit Registration</button>

</form>

</body>
</html>
