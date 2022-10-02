package com.example.usuarios.userEntity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import org.apache.catalina.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Entity
@Data
public class CustomerProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long productid;
    @Transient
    private String productName;

    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customerId",nullable = true)
    private User customer;
}
