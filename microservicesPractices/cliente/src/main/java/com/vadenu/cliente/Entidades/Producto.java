package com.vadenu.cliente.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name="productos")
@Data
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;
    @Column(name = "fecha_creacion", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    
}
