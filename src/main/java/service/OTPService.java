package service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;



import java.util.Random;

public class OTPService {

	
	private final JavaMailSender mailSender;

    public OTPService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public String generateOTP() {
        return String.format("%06d", new Random().nextInt(999999));
    }

    public void sendOTP(String email, String otp) {
        try {
            jakarta.mail.internet.MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setTo(email);
            helper.setSubject("Your OTP");
            helper.setText("Your OTP is: " + otp);
            mailSender.send(message);
        } catch (jakarta.mail.MessagingException e) {
            e.printStackTrace();
        }
    }
}
