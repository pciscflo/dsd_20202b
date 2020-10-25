package com.upc.crudproductos.democrud.repositorio;

import com.upc.crudproductos.democrud.entidades.Producto;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioProducto extends CrudRepository<Producto, Long> {

}
