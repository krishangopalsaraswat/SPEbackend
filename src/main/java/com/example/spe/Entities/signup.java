package com.example.spe.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "userDetails")
public class signup {

    @Id
    @GeneratedValue
    private int id;

    private String username;
    private String password;


}
