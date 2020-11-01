package com.upc.jpacurso.utilidad;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Utility {
    public static int obtenerEdad(Date fechaNacimiento) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(f.format(fechaNacimiento), fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    }
}
