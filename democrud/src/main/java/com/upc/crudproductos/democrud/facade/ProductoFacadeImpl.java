package com.upc.crudproductos.democrud.facade;

import com.upc.crudproductos.democrud.entidades.Producto;
import com.upc.crudproductos.democrud.servicios.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api") //DAO REST
public class ProductoFacadeImpl implements ProductoFacade{

    @Autowired
    private ServicioProducto servicioProducto;

    @GetMapping("/productos")  // localhost:8080/api/productos
    public List<Producto> obtenerProductos() {
        return servicioProducto.obtenerProductos();
    }

    @PostMapping("/producto")
    public Producto crearProducto(@RequestBody Producto producto) {
        return servicioProducto.crearProducto(producto);
    }

    @PutMapping("/producto")
    public Producto actualizarProducto(@RequestBody  Producto producto) {
        Producto p =null;
        try {
            p  = servicioProducto.actualizarProducto(producto);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No se puedo actualizar, sorry");
        }
        return p;
    }

    @GetMapping("/producto/{codigo}") //localhost:8080/api/producto/12
    public Producto obtenerEntidad(@PathVariable(value = "codigo") Long codigo) {
        return servicioProducto.obtenerEntidad(codigo);
    }

    @DeleteMapping("/producto/{codigo}")
    public Producto borrarProducto(@PathVariable(value = "codigo") Long codigo) {
        return servicioProducto.borrarProducto(codigo);
    }
}
