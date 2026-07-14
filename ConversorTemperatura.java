/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraextendida;

/**
 *
 * @author jeiso
 */
public class ConversorTemperatura {
       
    /**
     * Convierte grados Fahrenheit a Celsius.
     * @param fahrenheit temperatura en Fahrenheit
     * @return temperatura equivalente en Celsius
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius temperatura en Celsius
     * @return temperatura equivalente en Fahrenheit
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}

