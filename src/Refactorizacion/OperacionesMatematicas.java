package Refactorizacion;

import java.util.Arrays;

/**
 * Clase que ofrece métodos estáticos para realizar diversas operaciones matemáticas,
 * incluyendo operaciones aritméticas básicas y cálculos estadísticos como la media y la mediana.
 * Estos métodos son utilizados para realizar cálculos simples y estadísticos básicos en arreglos de números.
 *
 * @author Daniel Rodriguez Perez
 * @version 1.0
 * @since 1.0
 */
public class OperacionesMatematicas {

    /**
     * Suma dos números.
     *
     * @param a Primer operando, no negativo.
     * @param b Segundo operando, no negativo.
     * @return La suma de a y b.
     * <p> Ejemplo de uso: <code>suma(5, 3)</code> retorna <code>8</code>.</p>
     */
    public static double suma(double a, double b) {
        return a + b;
    }

    /**
     * Resta el segundo número del primero.
     *
     * @param a Primer operando, el minuendo.
     * @param b Segundo operando, el sustraendo.
     * @return La diferencia entre a y b.
     * <p> Ejemplo de uso: <code>resta(5, 3)</code> retorna <code>2</code>.</p>
     */
    public static double resta(double a, double b) {
        return a - b;
    }

    /**
     * Calcula la media de un array de números.
     *
     * @param numeros Array de números de tipo double.
     * @return La media aritmética de los números.
     * @throws IllegalArgumentException si el array está vacío.
     * <p> Ejemplo de uso: <code>media(new double[]{1, 2, 3, 4, 5})</code> retorna <code>3.0</code>.</p>
     */
    public static double media(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    /**
     * Calcula la mediana de un array de números.
     * Si el tamaño del array es par, devuelve la media de los dos números centrales.
     * Si es impar, devuelve el número central.
     *
     * @param numeros Array de números de tipo double.
     * @return La mediana de los números.
     * @throws IllegalArgumentException si el array está vacío.
     * <p> Ejemplo de uso: <code>mediana(new double[]{1, 3, 2, 5, 4})</code> retorna <code>3.0</code>.</p>
     */
    public static double mediana(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n % 2 == 0) {
            return (numeros[n / 2 - 1] + numeros[n / 2]) / 2;
        } else {
            return numeros[n / 2];
        }
    }
}
