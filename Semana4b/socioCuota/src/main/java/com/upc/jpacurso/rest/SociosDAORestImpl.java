package com.upc.jpacurso.rest;

import com.upc.jpacurso.entidades.Socio;
import com.upc.jpacurso.dao.ServiceSocioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SociosDAORestImpl implements SociosDAORest {

    @Autowired
    private ServiceSocioDAO serviceSocioDAO;

    @GetMapping("/socios")
    public List<Socio> obtenerSocios() {
        return serviceSocioDAO.obtenerSocios();
    }

    @PostMapping("/socio")
    public Socio registrar(@RequestBody Socio socio){
        return serviceSocioDAO.registrar(socio);
    }

}
