package com.upc.relaciones.demo.repositorios;

import com.upc.relaciones.demo.entidades.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
    @Query("SELECT c FROM Cliente c WHERE c.dni=:dni") //JQL
    Cliente buscarCliente(@Param("dni") String dni);
    Cliente findByDni(String dni);
}
