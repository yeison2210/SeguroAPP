package org.example.modelos;

import java.util.Scanner;

public class Aseguradora {
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String website;
    private Integer ruc;
    private String tipoAseguradora;
    private String fechaFundacion;
    private Integer idAseguradora;
    private String representante;


    public Aseguradora() {}

    public void recogerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        telefono = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Website: ");
        website = scanner.nextLine();
        System.out.print("RUC: ");
        ruc = scanner.nextInt();
        System.out.print("Tipo de Aseguradora: ");
        tipoAseguradora = scanner.nextLine();
        System.out.print("Fecha de Fundación: ");
        fechaFundacion = scanner.nextLine();
        System.out.print("ID Aseguradora: ");
        idAseguradora = scanner.nextInt();
        System.out.print("Representante: ");
        representante = scanner.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getRuc() {
        return ruc;
    }

    public void setRuc(Integer ruc) {
        this.ruc = ruc;
    }

    public String getTipoAseguradora() {
        return tipoAseguradora;
    }

    public void setTipoAseguradora(String tipoAseguradora) {
        this.tipoAseguradora = tipoAseguradora;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Integer getIdAseguradora() {
        return idAseguradora;
    }

    public void setIdAseguradora(Integer idAseguradora) {
        this.idAseguradora = idAseguradora;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Aseguradora{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", ruc=" + ruc +
                ", tipoAseguradora='" + tipoAseguradora + '\'' +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", idAseguradora=" + idAseguradora +
                ", representante='" + representante + '\'' +
                '}';
    }

    public Aseguradora(String nombre, String direccion, String telefono, String email, String website, Integer ruc, String tipoAseguradora, String fechaFundacion, Integer idAseguradora, String representante) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.website = website;
        this.ruc = ruc;
        this.tipoAseguradora = tipoAseguradora;
        this.fechaFundacion = fechaFundacion;
        this.idAseguradora = idAseguradora;
        this.representante = representante;
    }

}
