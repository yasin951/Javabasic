<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
            color: #333;
        }
        label {
            display: block;
            margin-top: 15px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"],
        input[type="number"],
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .radio-group {
            margin-top: 5px;
        }
        .radio-group label {
            display: inline;
            font-weight: normal;
            margin-right: 20px;
        }
        input[type="submit"] {
            margin-top: 25px;
            background-color: #007bff;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Student Registration Form</h2>

    <form action="MyFirstServlet" method="post">
        
        <label for="name">Full Name:</label>
        <input type="text" id="name" name="name" required placeholder="Enter your full name">

        <label for="mobileno">Mobile Number:</label>
        <input type="text" id="mobileno" name="mobileno" pattern="[0-9]{10}" 
               title="Please enter a valid 10-digit mobile number" required placeholder="e.g. 9876543210">

        <label for="emailid">Email ID:</label>
        <input type="email" id="emailid" name="emailid" required placeholder="example@domain.com">

        <label>Gender:</label>
        <div class="radio-group">
            <input type="radio" id="male" name="gender" value="Male" required>
            <label for="male">Male</label>

            <input type="radio" id="female" name="gender" value="Female">
            <label for="female">Female</label>

            <input type="radio" id="other" name="gender" value="Other">
            <label for="other">Other</label>
        </div>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" min="18" max="100" required placeholder="Enter your age">

        <label for="degree">Degree:</label>
        <select id="degree" name="degree" required>
            <option value="">-- Select Degree --</option>
            <option value="BSC">B.Sc (Bachelor of Science)</option>
            <option value="BE">B.E (Bachelor of Engineering)</option>
            <option value="BCOM">B.Com (Bachelor of Commerce)</option>
        </select>

        <center>
            <input type="submit" value="Next Page">
        </center>
    </form>
</div>

</body>
</html>