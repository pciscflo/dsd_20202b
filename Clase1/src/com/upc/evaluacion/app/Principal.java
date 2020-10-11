package com.upc.evaluacion.app;

import com.upc.evaluacion.entidades.Auto;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Auto auto = new Auto();
        auto.setCodigo(1001);
        auto.setMarca("MVW");
        auto.setModelo("A3");
        auto.setPrecio(50000);
        auto.setStock(20);
        System.out.println("Precio Neto:" + auto.calcularNeto());

    }
}
