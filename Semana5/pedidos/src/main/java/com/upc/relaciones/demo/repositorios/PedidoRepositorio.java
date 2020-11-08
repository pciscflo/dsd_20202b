package com.upc.relaciones.demo.repositorios;

import com.upc.relaciones.demo.entidades.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepositorio extends CrudRepository<Pedido, Long> {
}
