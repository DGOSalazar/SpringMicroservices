package com.vadenu.cliente.Servicios;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.vadenu.cliente.Entidades.Producto;


public interface IProductService {
    public List<Producto> ListarProductos();
    public Producto BuscarPorID(Long Id);
    public ResponseEntity<?> Agregar(Producto input);
    public boolean EliminarPorID(Long Id);
}
