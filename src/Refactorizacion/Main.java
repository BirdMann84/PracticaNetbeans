package Refactorizacion;

import java.util.Scanner;

/**
 * Clase principal que maneja la interacción con el usuario para ejecutar operaciones matemáticas.
 * Permite al usuario seleccionar entre diferentes operaciones aritméticas y estadísticas y muestra los resultados.
 * Asegura que los recursos se cierran adecuadamente después de su uso.
 *
 * @author Daniel Rodriguez Perez
 * @version 1.0
 * @since 1.0
 * Pruebas con GitHub
 * Cambio1
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Punto de entrada principal del programa. Gestiona el menú de operaciones y la captura de datos necesarios.
     *
     * @param args Argumentos de línea de comando (no utilizados).
     */
    public static void main(String[] args) {

        try {
            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Media");
            System.out.println("4. Mediana");

            int opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    calcularMedia();
                    break;
                case 4:
                    calcularMediana();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } finally {
            scanner.close(); // Asegura que el scanner se cierra para liberar el recurso.
        }
    }

    /**
     * Solicita al usuario dos números y muestra el resultado de sumarlos.
     * Invoca el método suma de la clase OperacionesMatematicas.
     */
    private static void realizarSuma() {
        System.out.println("Ingrese dos números para sumar:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("El resultado de la suma es: " + OperacionesMatematicas.suma(num1, num2));
    }

    /**
     * Solicita al usuario dos números y muestra el resultado de restarlos.
     * Invoca el método resta de la clase OperacionesMatematicas.
     */
    private static void realizarResta() {
        System.out.println("Ingrese dos números para restar:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("El resultado de la resta es: " + OperacionesMatematicas.resta(num1, num2));
    }

    /**
     * Solicita al usuario cinco números y muestra el resultado de calcular la media.
     * Invoca el método media de la clase OperacionesMatematicas.
     */
    private static void calcularMedia() {
        System.out.println("Ingrese los números para calcular la media (separados por espacios):");
        double[] numeros = new double[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextDouble();
        }
        System.out.println("La media de los números ingresados es: " + OperacionesMatematicas.media(numeros));
    }

    /**
     * Solicita al usuario cinco números y muestra el resultado de calcular la mediana.
     * Invoca el método mediana de la clase OperacionesMatematicas.
     */
    private static void calcularMediana() {
        System.out.println("Ingrese los números para calcular la mediana (separados por espacios):");
        double[] nums = new double[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextDouble();
        }
        System.out.println("La mediana de los números ingresados es: " + OperacionesMatematicas.mediana(nums));
    }
}
