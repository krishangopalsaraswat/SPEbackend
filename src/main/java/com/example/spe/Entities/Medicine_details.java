package com.example.spe.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicine_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medicine_details {

    @Id
    @GeneratedValue
    private int id;

    private String medicineName;
    private int tabletCount;
    private String expiryDate;
    private String details;
    private String medicineDomain;
    private String mobile;
}
