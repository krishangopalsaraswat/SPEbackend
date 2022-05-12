package com.example.spe;

import com.example.spe.Entities.signup;
import com.example.spe.Service.signup_service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class SpeApplicationTests {

    @Test
    void contextLoads() {
    }
    private static final Logger logger = LoggerFactory.getLogger(SpeApplicationTests.class);

    @Autowired
    private signup_service signup_services;

    @Test
    public void positiveTestPrimaryUserAuthentication()
    {
        logger.info("[INFO]: inside positiveTestPrimaryUserAuthentication()");
        signup userdetails = new signup();
        userdetails.setUsername("Krishan.Saraswat@iiitb.ac.in");
        List<signup> users = signup_services.finduser(userdetails);
        logger.info("[INFO]: result is = " + users.size());
        assertNotEquals(users.size(), 1);
    }
}
