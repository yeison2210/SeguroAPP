package org.example.modelos;

import java.util.Scanner;

public class Asegurado {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;
    private String fechaNacimiento;
    private String estadoCivil;
    private String ocupacion;
    private String nacionalidad;
    private String genero;
    private String tipoIdentificacion;
    private String fechaInicio;
    private String fechaFin;
    private String observaciones;
    private Integer idAsegurado;

    public Asegurado() {}

    public void recogerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        apellido = scanner.nextLine();
        System.out.print("DNI: ");
        dni = scanner.nextLine();
        System.out.print("Dirección: ");
        direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        telefono = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Fecha de Nacimiento: ");
        fechaNacimiento = scanner.nextLine();
        System.out.print("Estado Civil: ");
        estadoCivil = scanner.nextLine();
        System.out.print("Ocupación: ");
        ocupacion = scanner.nextLine();
        System.out.print("Nacionalidad: ");
        nacionalidad = scanner.nextLine();
        System.out.print("Género: ");
        genero = scanner.nextLine();
        System.out.print("Tipo de Identificación: ");
        tipoIdentificacion = scanner.nextLine();
        System.out.print("Fecha de Inicio: ");
        fechaInicio = scanner.nextLine();
        System.out.print("Fecha de Fin: ");
        fechaFin = scanner.nextLine();
        System.out.print("Observaciones: ");
        observaciones = scanner.nextLine();
        System.out.print("ID Asegurado: ");
        idAsegurado = scanner.nextInt();
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getIdAsegurado() {
        return idAsegurado;
    }

    public void setIdAsegurado(Integer idAsegurado) {
        this.idAsegurado = idAsegurado;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", genero='" + genero + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", idAsegurado=" + idAsegurado +
                '}';
    }

    public Asegurado(String nombre, String apellido, String dni, String direccion, String telefono, String email, String fechaNacimiento, String estadoCivil, String ocupacion, String nacionalidad, String genero, String tipoIdentificacion, String fechaInicio, String fechaFin, String observaciones, Integer idAsegurado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.tipoIdentificacion = tipoIdentificacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.observaciones = observaciones;
        this.idAsegurado = idAsegurado;
    }
}

