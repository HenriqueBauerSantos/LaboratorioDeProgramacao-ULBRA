import javax.swing.*;

public class Exerc04 {
    public static void main(String[] args) {
        String retorno = JOptionPane.showInputDialog(null, "Entre com uma frase qualquer:"); // Arrumei
        StringBuffer aux = new StringBuffer(retorno);
        JOptionPane.showMessageDialog(null,"frase invertida: " +aux.reverse().toString()); // Adicionei um toString()

    }
}
