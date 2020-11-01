package com.upc.jpacurso.dao;

import com.upc.jpacurso.entidades.Socio;
import com.upc.jpacurso.repositorio.RepositorioSocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSocioDAOImpl implements ServiceSocioDAO {
    @Autowired // inyecta
    private RepositorioSocio repositorioSocio;

    //Wrapper
    public Socio registrar(Socio socio) {
        return repositorioSocio.save(socio);
    }

    public List<Socio> obtenerListadoSociosConDependientes() {
        return repositorioSocio.obtenerListadoDependientes();
    }

    @Override
    public Socio obtenerSocio(String dni) {
        return repositorioSocio.buscarSocio(dni);
    }

    public List<Socio> obtenerSocios(){
        return (List<Socio>) repositorioSocio.findAll();
    }

    public double calcularAdicional(Socio socio) {
        return 300 * socio.getDependientes();
    }

    public Socio actualizar(Socio socio) {
        Socio s = repositorioSocio.findById(socio.getCodigo()).get();
        if (s != null) {
           repositorioSocio.save(socio);
        }
        return s;
    }
}
