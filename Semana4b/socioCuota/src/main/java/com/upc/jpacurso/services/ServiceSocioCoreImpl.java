package com.upc.jpacurso.services;

import com.upc.jpacurso.entidades.Socio;
import com.upc.jpacurso.repositorio.RepositorioSocio;
import com.upc.jpacurso.utilidad.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceSocioCoreImpl implements ServiceSocioCore {
    @Autowired // inyecta
    private RepositorioSocio repositorioSocio;

    public double calcularCuota(Socio socio) {
        if (Utility.obtenerEdad(socio.getFechaNacimiento()) < 25) {
            return 3000;
        } else {
            return 4000;
        }
    }

    public double calcularAdicional(Socio socio) {
        return 300 * socio.getDependientes();
    }

    public double calcularCuotaId(Long codigo) {
        //buscarlo en la base de datos
        Socio socio = repositorioSocio.findById(codigo).get();
        //calculo su cuota
        double cuota = 0;
        if (socio != null) {
            cuota = calcularCuota(socio) + calcularAdicional(socio);
        }
        return cuota; //retorno
    }

    public List<Socio> obtenerReporteSocioCuotas() {
        List<Socio> reporte = (List<Socio> )repositorioSocio.findAll();
        for  (Socio s: reporte){
            s.setCuota(calcularCuota(s)+calcularAdicional(s));
        }
        return reporte;
    }

    public double calcularCuota(String dni) {
        //buscarlo en la base de datos
        Socio socio = repositorioSocio.buscarSocio(dni);
        //calculo su cuota
        double cuota = 0;
        if (socio != null) {
            cuota = calcularCuota(socio) + calcularAdicional(socio);
        }
        return cuota; //retorno
    }

    public List<Socio> obtenerListadoSociosConDependientes() {
        return repositorioSocio.obtenerListadoDependientes();
    }

}
