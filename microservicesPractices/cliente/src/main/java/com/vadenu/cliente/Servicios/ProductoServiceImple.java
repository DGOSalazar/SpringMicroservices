package com.vadenu.cliente.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vadenu.cliente.Entidades.Producto;
import com.vadenu.cliente.Repositorio.ProductRepo;

@Service
public class ProductoServiceImple implements IProductService {

    @Autowired
    private ProductRepo productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> ListarProductos() {
        return (List<Producto>) productoDao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Producto BuscarPorID(Long Id) {
        return productoDao.findById(Id).orElse(null);
    }
    @Override
    @Transactional(readOnly = false)
    public ResponseEntity<?> Agregar(Producto input) {
        Producto save=productoDao.save(input);
        return ResponseEntity.ok(save);
    }
    @Override
    @Transactional(readOnly = false)
    public boolean EliminarPorID(Long Id) {
        try{
            productoDao.deleteById(Id);
            return true;
        }catch(Exception err){
            return false;
        }
        
    }

    
}
