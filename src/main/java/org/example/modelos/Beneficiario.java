package org.example.modelos;

import java.util.Scanner;

public class Beneficiario {
    private String nombre;
    private String apellido;
    private Integer dni;
    private String relacion;
    private Integer porcentaje;
    private String fechaNacimiento;
    private String email;
    private String telefono;
    private String direccion;
    private Integer idBeneficiario;


    public Beneficiario() {}

    public void recogerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        apellido = scanner.nextLine();
        System.out.print("DNI: ");
        dni = scanner.nextInt();
        System.out.print("Relación: ");
        relacion = scanner.nextLine();
        System.out.print("Porcentaje: ");
        porcentaje = scanner.nextInt();
        System.out.print("Fecha de Nacimiento: ");
        fechaNacimiento = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Teléfono: ");
        telefono = scanner.nextLine();
        System.out.print("Dirección: ");
        direccion = scanner.nextLine();
        System.out.print("ID Beneficiario: ");
        idBeneficiario = scanner.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(Integer idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", relacion='" + relacion + '\'' +
                ", porcentaje=" + porcentaje +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", idBeneficiario=" + idBeneficiario +
                '}';
    }

    public Beneficiario(String nombre, String apellido, Integer dni, String relacion, Integer porcentaje, String fechaNacimiento, String email, String telefono, String direccion, Integer idBeneficiario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.relacion = relacion;
        this.porcentaje = porcentaje;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idBeneficiario = idBeneficiario;
    }
}
