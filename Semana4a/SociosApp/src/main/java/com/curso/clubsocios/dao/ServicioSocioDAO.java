package com.curso.clubsocios.dao;

import com.curso.clubsocios.entidades.Socio;

import java.util.List;

public interface ServicioSocioDAO {
    public Socio registrar(Socio socio);
    public Socio obtenerSocio(String dni);
    public List<Socio> obtenerSocios();
    public Socio actualizar(Socio socio);
}
