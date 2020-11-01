package com.curso.clubsocios.negociocore;

import com.curso.clubsocios.entidades.Socio;

import java.util.List;

public interface ServicioNegocioCore {
    public double calcularCuota(Socio socio);
    public double calcularAdiconal(Socio socio);
    public List<Socio> obtenerReporteSociosCuotas();
}
