<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>Send Email</title>
</head>
<body>

<h2>Send Email</h2>

<form action="SendEmailServlet" method="post">
    To Email: <input type="email" name="toEmail" required><br><br>
    Subject: <input type="text" name="subject" required><br><br>
    Message:<br>
    <textarea name="message" rows="5" cols="30" required></textarea><br><br>
    <input type="submit" value="Send Email">
</form>

</body>
</html>
