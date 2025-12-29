package com.codeo.emailfunctionality.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


@WebServlet("/SendEmailServlet")
public class emailFunctionality extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // ✅ Gmail Credentials (Use App Password)
    private static final String FROM_EMAIL = "yasinmirza951@gmail.com";
    private static final String APP_PASSWORD = "pzfz hwwx hrlx enka";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        PrintWriter out = response.getWriter();

        String toEmail = request.getParameter("toEmail");
        String subject = request.getParameter("subject");
        String messageText = request.getParameter("message");

        // ✅ Input Validation
        if (toEmail == null || subject == null || messageText == null ||
                toEmail.isEmpty() || subject.isEmpty() || messageText.isEmpty()) {
                out.println("<h3 style='color:red'>All fields are required.</h3>");
                return;
        }
        //we will create object of Properties class
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM_EMAIL, APP_PASSWORD);
            }
        });

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(FROM_EMAIL));
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            msg.setSubject(subject);
            msg.setText(messageText);

            Transport.send(msg);

            out.println("<h3 style='color:green'>Email sent successfully!</h3>");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3 style='color:red'>Failed to send email. Please try again.</h3>");
        }
    }
}
