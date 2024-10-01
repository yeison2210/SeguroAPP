package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Asegurado aseguradoUno=new Asegurado();
        Asegurado aseguradoDos=new Asegurado("Yeison","zapata","1001553500","Calle 1-2-3aei","3123456789","Correo@correo.com","01-01-2001","Union libre","empleado","colombiano","masculino","cedula","01-01-2024","02-02-2024","sin novedad",12345
        );

        System.out.println(aseguradoUno);
        System.out.println(aseguradoDos);

        Vehiculo vehiculoUno=new Vehiculo();
        Vehiculo vehiculoDos=new Vehiculo("Kia","sport",2010,"negro","abc20g",123456789,"deportivo","2",2,"Corriente","cotidiano",12-12-2020,12345,"karl","Bueno"
        );
        System.out.println(vehiculoUno);
        System.out.println(vehiculoDos);

        Accidente accidenteUno=new Accidente();
        Accidente accidenteDos=new Accidente("01-01-2024","Regional","daños materiales","Postes y cercas",2,100,12321312,"motocicleta","soluciones sas","Motocicleta");
        System.out.println(accidenteUno);
        System.out.println(accidenteUno);

        Aseguradora aseguradoraUno=new Aseguradora();
        Aseguradora aseguradoraDos=new Aseguradora("seguros sas","calle 1a2b3c","3123456789","segurossas@gmail.com","solucseguros.sas.com",12321312,"Veciculos, de vida","01-01-2010",123213,"presidente seguros ssas");
        System.out.println(aseguradoraUno);
        System.out.println(aseguradoraDos);

        Beneficiario beneficiarioUno=new Beneficiario();
        Beneficiario beneficiarioDos=new Beneficiario("david","sanchez",12314,"Primo",70,"01-01-2000","correo@correo.com","3123456789","calle 2a231",23123123);
        System.out.println(beneficiarioUno);
        System.out.println(beneficiarioDos);
    }
}



