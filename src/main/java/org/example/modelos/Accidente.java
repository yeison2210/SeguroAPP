package org.example.modelos;

import java.util.Scanner;

public class Accidente {
    private String fecha;
    private String lugar;
    private String descripcion;
    private String daños;
    private Integer heridos;
    private Integer fallecidos;
    private Integer idAccidente;
    private String vehiculoInvolucrado;
    private String aseguradora;
    private String responsables;

    public Accidente() {}

    public void recogerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fecha: ");
        fecha = scanner.nextLine();
        System.out.print("Lugar: ");
        lugar = scanner.nextLine();
        System.out.print("Descripción: ");
        descripcion = scanner.nextLine();
        System.out.print("Daños: ");
        daños = scanner.nextLine();
        System.out.print("Heridos: ");
        heridos = scanner.nextInt();
        System.out.print("Fallecidos: ");
        fallecidos = scanner.nextInt();
        System.out.print("ID Accidente: ");
        idAccidente = scanner.nextInt();
        System.out.print("Vehículo Involucrado: ");
        vehiculoInvolucrado = scanner.nextLine();
        System.out.print("Aseguradora: ");
        aseguradora = scanner.nextLine();
        System.out.print("Responsables: ");
        responsables = scanner.nextLine();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDaños() {
        return daños;
    }

    public void setDaños(String daños) {
        this.daños = daños;
    }

    public Integer getHeridos() {
        return heridos;
    }

    public void setHeridos(Integer heridos) {
        this.heridos = heridos;
    }

    public Integer getFallecidos() {
        return fallecidos;
    }

    public void setFallecidos(Integer fallecidos) {
        this.fallecidos = fallecidos;
    }

    public Integer getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(Integer idAccidente) {
        this.idAccidente = idAccidente;
    }

    public String getVehiculoInvolucrado() {
        return vehiculoInvolucrado;
    }

    public void setVehiculoInvolucrado(String vehiculoInvolucrado) {
        this.vehiculoInvolucrado = vehiculoInvolucrado;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getResponsables() {
        return responsables;
    }

    public void setResponsables(String responsables) {
        this.responsables = responsables;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "fecha='" + fecha + '\'' +
                ", lugar='" + lugar + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", daños='" + daños + '\'' +
                ", heridos=" + heridos +
                ", fallecidos=" + fallecidos +
                ", idAccidente=" + idAccidente +
                ", vehiculoInvolucrado='" + vehiculoInvolucrado + '\'' +
                ", aseguradora='" + aseguradora + '\'' +
                ", responsables='" + responsables + '\'' +
                '}';
    }

    public Accidente(String fecha, String lugar, String descripcion, String daños, Integer heridos, Integer fallecidos, Integer idAccidente, String vehiculoInvolucrado, String aseguradora, String responsables) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.daños = daños;
        this.heridos = heridos;
        this.fallecidos = fallecidos;
        this.idAccidente = idAccidente;
        this.vehiculoInvolucrado = vehiculoInvolucrado;
        this.aseguradora = aseguradora;
        this.responsables = responsables;
    }
}
