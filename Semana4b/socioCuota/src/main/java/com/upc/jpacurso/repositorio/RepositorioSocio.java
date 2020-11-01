package com.upc.jpacurso.repositorio;

import com.upc.jpacurso.entidades.Socio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioSocio extends CrudRepository<Socio, Long> {
    @Query("SELECT s FROM Socio s WHERE s.dependientes >= 2")
    public List<Socio> obtenerListadoDependientes();

    @Query("SELECT s FROM Socio s WHERE s.dni=:xdni")
    public Socio buscarSocio(String xdni);
}
