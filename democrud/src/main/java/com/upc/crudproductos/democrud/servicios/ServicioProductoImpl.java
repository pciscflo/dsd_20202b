package com.upc.crudproductos.democrud.servicios;

import com.upc.crudproductos.democrud.entidades.Producto;
import com.upc.crudproductos.democrud.repositorio.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioProductoImpl implements ServicioProducto{

    @Autowired //inyectando el repositorio
    private RepositorioProducto repositorioProducto;

    @Override
    public List<Producto> obtenerProductos() {
        return (List<Producto>) repositorioProducto.findAll();
    }

    @Override
    public Producto obtenerEntidad(Long codigo) {
        return repositorioProducto.findById(codigo).get();
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return repositorioProducto.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        //Producto p = repositorioProducto.findById(producto.getCodigo()).orElseThrow(() -> new Exception("No se encuentra"));
        Producto p = obtenerEntidad(producto.getCodigo());
        if (p!=null) return repositorioProducto.save(producto);
        else return null;
    }

    @Override
    public Producto borrarProducto(Long codigo) {
        Producto p = obtenerEntidad(codigo);
        if (p!=null) {
            repositorioProducto.delete(p);
            return p;
        }
        else return null;
    }
}
