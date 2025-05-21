import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    float numero1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
    float numero2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
    float numero3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
    float prome = (numero1 + numero2 + numero3)/3;
    JOptionPane.showMessageDialog(null, "El promedio es: " + prome);

    }
}