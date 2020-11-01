package com.curso.clubsocios.negociocore;

import com.curso.clubsocios.dao.ServicioSocioDAO;
import com.curso.clubsocios.entidades.Socio;
import com.curso.clubsocios.utilitarios.Utilitario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // ojo
public class ServicioNegocioCoreImpl implements ServicioNegocioCore{
    @Autowired
    private Utilitario utilitario;
    @Autowired
    private ServicioSocioDAO servicioSocioDAO;

    @Override
    public double calcularCuota(Socio socio) {
        if(utilitario.obtenerEdad(socio.getFechaNacimiento())<25){
            return 3000;
        }else
        {
            return 400;
        }
    }

    @Override
    public double calcularAdiconal(Socio socio) {
        return 0;
    }

    @Override
    public List<Socio> obtenerReporteSociosCuotas() {
        return null;
    }
}
