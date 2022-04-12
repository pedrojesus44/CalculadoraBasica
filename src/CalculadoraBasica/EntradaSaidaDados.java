package CalculadoraBasica;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Henrique
 */
public class EntradaSaidaDados {
    public String entradaDados(String mensagemEntrada) {
        return JOptionPane.showInputDialog(mensagemEntrada);
    }
    public void saidaDados(String mensagemSaida) {
        JOptionPane.showMessageDialog(null, mensagemSaida);
    }
}
