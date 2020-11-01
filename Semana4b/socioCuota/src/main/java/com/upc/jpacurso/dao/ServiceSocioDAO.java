package com.upc.jpacurso.dao;

import com.upc.jpacurso.entidades.Socio;

import java.util.List;

public interface ServiceSocioDAO {
    public Socio registrar(Socio socio);
    public Socio obtenerSocio(String dni);
    public List<Socio> obtenerSocios();
    public Socio actualizar(Socio socio);

}
