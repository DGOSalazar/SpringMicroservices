package com.vadenu.cliente.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vadenu.cliente.Entidades.Producto;

public interface ProductRepo extends JpaRepository<Producto, Long> {
    
}
