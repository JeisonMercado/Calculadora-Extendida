/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraextendida;

import javax.swing.*;
import java.awt.*;

/**
 * @author jeiso
 */
public class CalculadoraGUI extends JFrame {

    private JTextField txtNum1, txtNum2;
    private JLabel lblResultado;

    // ELIMINAMOS LA REDUNDANCIA DE "public class CalculadoraGUI {" aquí
    
    public CalculadoraGUI() {
        setTitle("Calculadora Extendida");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2, 5, 5));

        // Campos
        add(new JLabel("Numero 1:"));
        txtNum1 = new JTextField();
        add(txtNum1);

        add(new JLabel("Numero 2:"));
        txtNum2 = new JTextField();
        add(txtNum2);

        // Botones basicos
        JButton btnSuma = new JButton("+");
        JButton btnResta = new JButton("-");
        JButton btnMulti = new JButton("*");
        JButton btnDiv = new JButton("/");

        add(btnSuma);
        add(btnResta);
        add(btnMulti);
        add(btnDiv);

        // Botones extra
        JButton btnRaiz = new JButton("√");
        JButton btnExpo = new JButton("^");
        JButton btnCtoF = new JButton("C → F");
        JButton btnFtoC = new JButton("F → C");

        add(btnRaiz);
        add(btnExpo);
        add(btnCtoF);
        add(btnFtoC);

        // Resultado
        lblResultado = new JLabel("Resultado:");
        add(lblResultado);

        // Instancias de clases
        Calculadora calc = new Calculadora();
        ConversorTemperatura conv = new ConversorTemperatura();
        RaizCuadrada_Exponente math = new RaizCuadrada_Exponente();

        // EVENTOS
        btnSuma.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(txtNum1.getText());
                double n2 = Double.parseDouble(txtNum2.getText());
                lblResultado.setText("Resultado: " + calc.sumar(n1, n2));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en datos");
            }
        });

        btnResta.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(txtNum1.getText());
                double n2 = Double.parseDouble(txtNum2.getText());
                lblResultado.setText("Resultado: " + calc.restar(n1, n2));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en datos");
            }
        });

        btnMulti.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(txtNum1.getText());
                double n2 = Double.parseDouble(txtNum2.getText());
                lblResultado.setText("Resultado: " + calc.multiplicar(n1, n2));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en datos");
            }
        });

        btnDiv.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(txtNum1.getText());
                double n2 = Double.parseDouble(txtNum2.getText());
                lblResultado.setText("Resultado: " + calc.dividir(n1, n2));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        btnRaiz.addActionListener(e -> {
            try {
                double n = Double.parseDouble(txtNum1.getText());
                lblResultado.setText("Resultado: " + math.raizCuadrada(n));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        btnExpo.addActionListener(e -> {
            try {
                double base = Double.parseDouble(txtNum1.getText());
                double exp = Double.parseDouble(txtNum2.getText());
                lblResultado.setText("Resultado: " + math.potencia(base, exp));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en datos");
            }
        });

        btnCtoF.addActionListener(e -> {
            try {
                double c = Double.parseDouble(txtNum1.getText());
                lblResultado.setText("Resultado: " + conv.celsiusAFahrenheit(c) + " °F");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en datos");
            }
        });

        btnFtoC.addActionListener(e -> {
            try {
                double f = Double.parseDouble(txtNum1.getText());
                lblResultado.setText("Resultado: " + conv.fahrenheitACelsius(f) + " °C");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en datos");
            }
        });
    } // Cierre del constructor
} // Cierre de la clase CalculadoraGUI