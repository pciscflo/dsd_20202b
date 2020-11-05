package com.upc.jpacurso.rest;

import com.upc.jpacurso.entidades.Socio;
import com.upc.jpacurso.dao.ServiceSocioDAO;
import com.upc.jpacurso.services.ServiceSocioCore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SociosCoreRestImpl implements SociosCoreRest{

    @Autowired
    private ServiceSocioCore serviceSocioCore;

    @GetMapping("/cuota/codigo/{codigo}")
    public double calcularCuotaId(@PathVariable("codigo") Long codigo) {
        return serviceSocioCore.calcularCuotaId(codigo);
    }

    @GetMapping("/cuota/dni/{dni}")
    public double calcularCuota(@PathVariable(name = "dni") String dni) {
        return serviceSocioCore.calcularCuota(dni);
    }

    @GetMapping("/cuota/dnisocio")
    public double calcularCuota(@RequestBody Socio socio) {
        return serviceSocioCore.calcularCuota(socio.getDni());
    }

    @GetMapping("/sociosCuotas")
    public List<Socio> obtenerReporteSociosCuotas() {
        return serviceSocioCore.obtenerReporteSocioCuotas();
    }

    @GetMapping("/sociosDependientes")
    public List<Socio> obtenerListadoSociosConDependientes() {
        return serviceSocioCore.obtenerListadoSociosConDependientes();
    }

}
