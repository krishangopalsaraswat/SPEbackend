package com.example.spe;

import com.example.spe.Service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class SpeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpeApplication.class, args);
    }





}
