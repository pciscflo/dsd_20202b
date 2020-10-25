package com.upc.crudproductos.democrud.facade;

import com.upc.crudproductos.democrud.entidades.Producto;

import java.util.List;

public interface ProductoFacade {
    List<Producto> obtenerProductos();//wrapper
    Producto crearProducto(Producto producto);
    Producto actualizarProducto(Producto producto);
    Producto obtenerEntidad(Long codigo);
    Producto borrarProducto(Long codigo);
}
