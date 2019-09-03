package calculator;

import javax.swing.JOptionPane;

public class Suma {

    Variables objSum = new Variables();

    public void suma() {
        objSum.num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 1"));
        objSum.num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 2"));
        objSum.setRes(objSum.num1 + objSum.num2);
        JOptionPane.showMessageDialog(null, "Respuesta: " + objSum.res);
    }

    public void resta() {
        objSum.num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 1"));
        objSum.num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 2"));
        objSum.setRes(objSum.num1 - objSum.num2);
        JOptionPane.showMessageDialog(null, "Respuesta: " + objSum.res);
    }

    public void multiplicacion() {
        objSum.num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 1"));
        objSum.num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 2"));
        objSum.setRes(objSum.num1 * objSum.num2);
        JOptionPane.showMessageDialog(null, "Respuesta: " + objSum.res);
    }
    
    public void division() {
        objSum.num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 1"));
        objSum.num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el número 2"));
        objSum.setRes(objSum.num1 / objSum.num2);
        JOptionPane.showMessageDialog(null, "Respuesta: " + objSum.res);
    }

}
