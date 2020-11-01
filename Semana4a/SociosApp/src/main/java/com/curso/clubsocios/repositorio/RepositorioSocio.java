package com.curso.clubsocios.repositorio;

import com.curso.clubsocios.entidades.Socio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RepositorioSocio extends CrudRepository<Socio,Long> {
    @Query("SELECT s FROM Socio s WHERE s.dependientes >=2") //JPA JQL
    public List<Socio> obtenerListadoDependientes();

    @Query("SELECT s FROM Socio s WHERE s.dni=:pdni")
    public Socio buscarSocio(String pdni);
}
