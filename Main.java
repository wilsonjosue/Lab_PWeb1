package Lab01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de la clase Operaciones
        Operaciones operaciones = new Operaciones();
        
        // Ejemplos de uso de los métodos de la clase Operaciones
        int resultadoSuma = operaciones.add(10, 5);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = operaciones.sub(10, 5);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMultiplicacion = operaciones.mul(10, 5);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        int resultadoDivision = operaciones.div(10, 5);
        System.out.println("División: " + resultadoDivision);

        int resultadoModulo = operaciones.mod(10, 5);
        System.out.println("Módulo: " + resultadoModulo);
    }
}
