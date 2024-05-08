package Lab01;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creamos una instancia de la clase Operaciones
        Calculator operaciones = new Calculator();
        
        Scanner scanner = new Scanner(System.in);
        
        // Creamos una instancia de la clase Operaciones
        System.out.println("Ingrese los dos valores ,para realizar la operacion");
        
        System.out.println("Valor 1: ");
        int valor1 = scanner.nextInt();
        
        System.out.println("Valor 2: ");
        int valor2 = scanner.nextInt();
        // Ejemplos de uso de los métodos de la clase Operaciones
        
        int resultadoSuma = operaciones.add(valor1, valor2);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = operaciones.sub(valor1, valor2);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMultiplicacion = operaciones.mul(valor1, valor2);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        int resultadoDivision = operaciones.div(valor1, valor2);
        System.out.println("División: " + resultadoDivision);

        int resultadoModulo = operaciones.mod(valor1, valor2);
        System.out.println("Módulo: " + resultadoModulo);
        
        scanner.close(); // Cerramos el scanner al finalizar
    }

}
