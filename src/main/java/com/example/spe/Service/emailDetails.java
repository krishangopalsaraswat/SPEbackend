package com.example.spe.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class emailDetails {
    private String fullName;
    private String phoneNo;
    private String email;
    private int tabletCount;





}
