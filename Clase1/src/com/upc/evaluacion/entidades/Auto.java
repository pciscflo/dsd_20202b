package com.upc.evaluacion.entidades;

public class Auto {  //java bean
    private int codigo;
    private String marca;
    private String modelo;
    private double precio;
    private int stock;

    public void actualizarStock(int unidadesCompradas){ //actualizando
        this.stock = this.stock - unidadesCompradas;
    }

    public  double calcularNeto(){
        return precio + calcularIGV();
    }

    public double calcularIGV(){
        return 0.18*precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
