package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    JavaMailSender javaMailSender;

    public void sendMail(String mail,String sub,String code){
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("2531821176@qq.com");
        message.setTo(mail);
        message.setSubject(sub);
        message.setText(code);
        javaMailSender.send(message);
    }
}
