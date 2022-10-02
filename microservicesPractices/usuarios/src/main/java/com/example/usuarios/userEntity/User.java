package com.example.usuarios.userEntity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String age;
    private String iban;
    private String code;
    private String surname;
    private String phone;
    private String address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "customerId")
    private List<CustomerProduct> products;
    @Transient
    private List<?> transactions;
    
}
