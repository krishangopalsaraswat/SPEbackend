package com.example.spe.Controller;

import com.example.spe.Entities.Medicine_details;
import com.example.spe.Service.EmailSenderService;
import com.example.spe.Service.emailDetails;
import com.example.spe.Service.Medicine_details_service;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class Medicine_details_controller {


    private static final Logger logger = LoggerFactory.getLogger(Medicine_details_controller.class);
    @Autowired
    private Medicine_details_service medicine_details_service;

    /*adding medicine details*/
    @PostMapping("/addMedicineDetails")
    public Medicine_details save_medicine_details(@RequestBody Medicine_details medicine_details){
        System.out.println("getting data");
        logger.info("medicine added successfully" );
        return medicine_details_service.save_medicine_details(medicine_details);
    }

    /*Searching medicine details based on name of medicine*/
    @GetMapping("/searchMedicineDetails/{name}")
    public List<Medicine_details> findMedicineByName(@PathVariable String name) {
        return medicine_details_service.getMedicineByName(name);
    }

    /*Searching medicine details based on domain of medicine*/
    @GetMapping("/searchMedicineDetailsDomain/{domain}")
    public List<Medicine_details> findMedicineBymedicineDomain(@PathVariable String domain) {
        return medicine_details_service.getMedicineBymedicineDomain(domain);
    }

//    ******to get list of medicines******
    @GetMapping("/medicine")
    public List<Medicine_details> findAllProducts() {
        return medicine_details_service.getProducts();
    }


    @Autowired
    private emailDetails emaildetails;

    @Autowired
    private EmailSenderService service;



//    @PostMapping("/sendMail")
//    public void save_receiver_details(@RequestBody emailDetails details){
//        System.out.println(details.getFullName());
//        fullName=details.getFullName();
//        phoneNo=details.getPhoneNo();
//        email=details.getEmail();
//        tabletCount=details.getTabletCount();
//
//    }

//    @GetMapping("/sendMail")
//    public int mail(){
//        trigger();
//        return 1;
//    }


//    public void triggerMail() throws MessagingException {
//public void trigger(){
//        service.sendSimpleEmail("gaurav.kumar@iiitb.ac.in",
//                "Receiver Name: "+fullName
//                +"\n\nReceiver Mobile: "+phoneNo
//                +"\n\nReceiver Email: "+email
//                +"\n\nNumber of tablets required: "+tabletCount,
//                "Details of receiver");
//
//    }












}
