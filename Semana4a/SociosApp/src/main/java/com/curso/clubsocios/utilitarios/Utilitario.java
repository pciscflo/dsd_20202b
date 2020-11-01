package com.curso.clubsocios.utilitarios;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Component
public class Utilitario {
    public int obtenerEdad(Date fechaNacimiento) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate f = LocalDate.parse( formatter.format(fechaNacimiento));
        Period edad = Period.between(f, LocalDate.now());
        return edad.getYears();
    }

}
