package com.anita.LookIt.Util;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class LookItUtil {
	@Autowired
    private JavaMailSender mailsender;
	
	public int generateotp() {
		Random random=new Random();
		String otp  = String.format("%04d", random.nextInt(9999));
		System.out.println(otp);
		return Integer.parseInt(otp);
		
	}

	 public void sendmail(String to ,int otp) {
		 SimpleMailMessage simpleMailMessage =new SimpleMailMessage ();
		 simpleMailMessage.setTo("anitashankar86@gmail.com");
		 simpleMailMessage.setFrom("anitasddevanagi1@gmail.com");
		 simpleMailMessage.setSubject("OTP for LookIt reset password");
		 simpleMailMessage.setText("Your otp is :"+otp);
		 mailsender.send(simpleMailMessage);
	 }
}
