package com.upc.jpacurso.rest;

import com.upc.jpacurso.entidades.Socio;

import java.util.List;

public interface SociosCoreRest {
    public double calcularCuotaId(Long codigo);
    public double calcularCuota(String dni);
    public double calcularCuota(Socio socio);
    public List<Socio> obtenerReporteSociosCuotas();
    public List<Socio> obtenerListadoSociosConDependientes();

}
