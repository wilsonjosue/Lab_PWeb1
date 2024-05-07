public class Operaciones {
     // Método para sumar dos enteros 

     public int add(int a, int b) {
        return a + b;
    }

    // Método para restar dos enteros
    public int sub(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos enteros
    public int mul(int a, int b) {
        return a * b;
    }

    // Método para dividir dos enteros
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    // Método para calcular el módulo de dos enteros
    public int mod(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede calcular el módulo por cero");
        }
        return a % b;
    }
}
