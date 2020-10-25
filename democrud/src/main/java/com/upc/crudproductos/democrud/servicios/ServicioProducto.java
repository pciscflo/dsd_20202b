package com.upc.crudproductos.democrud.servicios;

import com.upc.crudproductos.democrud.entidades.Producto;

import java.util.List;

public interface ServicioProducto {
    List<Producto> obtenerProductos();
    Producto obtenerEntidad(Long codigo);
    Producto crearProducto(Producto producto); //.T.O == Value Object
    Producto actualizarProducto(Producto producto);
    Producto borrarProducto(Long codigo);
}
