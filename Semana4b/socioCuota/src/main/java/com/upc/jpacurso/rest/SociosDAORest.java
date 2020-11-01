package com.upc.jpacurso.rest;

import com.upc.jpacurso.entidades.Socio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SociosDAORest {
    public List<Socio> obtenerSocios();
    public Socio registrar(Socio socio);
}
