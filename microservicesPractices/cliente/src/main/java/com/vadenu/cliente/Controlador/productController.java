package com.vadenu.cliente.Controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vadenu.cliente.Entidades.Producto;
import com.vadenu.cliente.Servicios.IProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Producto")
public class productController {

    @Autowired
    private IProductService productService;

    @GetMapping("/Listar")
    public List<Producto> listar() {
        return productService.ListarProductos();
    }
    @GetMapping("/Buscar/{id}")
    public Producto buscar(@PathVariable Long id) {
        return productService.BuscarPorID(id);
    }
    @PostMapping("/AgregarProducto")
    public ResponseEntity<?> Agregar(@RequestBody Producto input) {
        return productService.Agregar(input);
    }
    @DeleteMapping("/Eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id){
        boolean ok = this.productService.EliminarPorID(id);
        if(ok){
            return"Se elimino correctamente";
        }else{
            return"No se elimino mi compa, kien sabe por que";
        }
    }
    
  
}
