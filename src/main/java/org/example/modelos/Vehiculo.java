package org.example.modelos;

import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer año;
    private String color;
    private String placa;
    private Integer vin;
    private String tipo;
    private String capacidad;
    private Integer numeroPasajeros;
    private String combustible;
    private String uso;
    private Integer fechaCompra;
    private Integer idVehiculo;
    private String asegurado;
    private String estado;


    public Vehiculo() {}

    public void recogerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marca: ");
        marca = scanner.nextLine();
        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
        System.out.print("Año: ");
        año = scanner.nextInt();
        System.out.print("Color: ");
        color = scanner.nextLine();
        System.out.print("Placa: ");
        placa = scanner.nextLine();
        System.out.print("VIN: ");
        vin = scanner.nextInt();
        System.out.print("Tipo: ");
        tipo = scanner.nextLine();
        System.out.print("Capacidad: ");
        capacidad = scanner.nextLine();
        System.out.print("Número de Pasajeros: ");
        numeroPasajeros = scanner.nextInt();
        System.out.print("Combustible: ");
        combustible = scanner.nextLine();
        System.out.print("Uso: ");
        uso = scanner.nextLine();
        System.out.print("Fecha de Compra: ");
        fechaCompra = scanner.nextInt();
        System.out.print("ID Vehículo: ");
        idVehiculo = scanner.nextInt();
        System.out.print("Asegurado: ");
        asegurado = scanner.nextLine();
        System.out.print("Estado: ");
        estado = scanner.nextLine();
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

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getVin() {
        return vin;
    }

    public void setVin(Integer vin) {
        this.vin = vin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Integer getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Integer fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getAsegurado() {
        return asegurado;
    }

    public void setAsegurado(String asegurado) {
        this.asegurado = asegurado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", color='" + color + '\'' +
                ", placa='" + placa + '\'' +
                ", vin=" + vin +
                ", tipo='" + tipo + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", numeroPasajeros=" + numeroPasajeros +
                ", combustible='" + combustible + '\'' +
                ", uso='" + uso + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", idVehiculo=" + idVehiculo +
                ", asegurado='" + asegurado + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public Vehiculo(String marca, String modelo, Integer año, String color, String placa, Integer vin, String tipo, String capacidad, Integer numeroPasajeros, String combustible, String uso, Integer fechaCompra, Integer idVehiculo, String asegurado, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.placa = placa;
        this.vin = vin;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.numeroPasajeros = numeroPasajeros;
        this.combustible = combustible;
        this.uso = uso;
        this.fechaCompra = fechaCompra;
        this.idVehiculo = idVehiculo;
        this.asegurado = asegurado;
        this.estado = estado;
    }
}

