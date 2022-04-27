package com.example.spe.Controller;

import com.example.spe.Service.EmailSenderService;
import com.example.spe.Service.emailDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class RequestController {

    @Autowired
    private EmailSenderService service;

    public String name;
    public String mobile;
    public String email;
    public String tabletNeeded;
    public String userEmail;
    private String address;

    @PostMapping("/sendMail")
    public boolean requestedUser(@RequestBody Map<String,Object> payload){
        name= (String) payload.get("name");
        mobile= (String) payload.get("mobile");
        email= (String) payload.get("email");
        tabletNeeded= (String) payload.get("tabletNeeded");
        userEmail= (String) payload.get("userEmail");
        address= (String) payload.get("address");
         System.out.println(payload.get("userEmail"));
         trigger();
         return true;
    }


    public void trigger() {
        System.out.println("Mail Triggered");

        service.sendSimpleEmail(userEmail,
                    "Receiver Name: " + name
                            + "\n\nReceiver Mobile: " + mobile
                            + "\n\nReceiver Email: " + email
                            + "\n\nNumber of tablets required: " + tabletNeeded +
                "\n\nAddress of receiver: "+address,
                    "Details of receiver");


        }
    }


