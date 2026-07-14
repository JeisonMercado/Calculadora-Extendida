/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraextendida;

/**
 *
 * @author jeiso
 */
public class Calculadora {
    public double sumar(double a, double b) { return a + b; }

    /**
     * Resta dos números.
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la resta
     */
    public double restar(double a, double b) { return a - b; }

    /**
     * Multiplica dos números.
     * @param a primer operando
     * @param b segundo operando
     * @return resultado de la multiplicación
     */
    public double multiplicar(double a, double b) { return a * b; }

    /**
     * Divide dos números con validación de división por cero.
     * @param a numerador
     * @param b denominador
     * @return resultado de la división
     * @throws ArithmeticException si el denominador es cero
     */
    public double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("Error: no se puede dividir entre cero");
        return a / b;
    }
}

