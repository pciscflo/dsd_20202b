package com.curso.clubsocios.dao;

import com.curso.clubsocios.entidades.Socio;
import com.curso.clubsocios.repositorio.RepositorioSocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioSocioDAOImpl implements ServicioSocioDAO {

    @Autowired
    private RepositorioSocio repositorioSocio;

    @Override
    public Socio registrar(Socio socio) {
        return repositorioSocio.save(socio);
    }

    @Override
    public Socio obtenerSocio(String dni) {
        return repositorioSocio.buscarSocio(dni);
    }

    @Override
    public List<Socio> obtenerSocios() {
        return (List<Socio>) repositorioSocio.findAll();
    }

    @Override
    public Socio actualizar(Socio socio) {
        return repositorioSocio.save(socio);
    }
}
