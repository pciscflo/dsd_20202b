package com.curso.clubsocios.utilitarios;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class Utilitario {
    public int obtenerEdad(Date fechaNacimiento) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(f.format(fechaNacimiento), fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }

}
