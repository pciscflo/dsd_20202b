package com.upc.jpacurso.services;

import com.upc.jpacurso.entidades.Socio;

import java.util.List;

public interface ServiceSocioCore {
    public double calcularCuota(Socio socio);
    public double calcularAdicional(Socio socio);
    public double calcularCuotaId(Long codigo);
    public List<Socio> obtenerReporteSocioCuotas();
    public double calcularCuota(String dni);
    public List<Socio> obtenerListadoSociosConDependientes();
}
