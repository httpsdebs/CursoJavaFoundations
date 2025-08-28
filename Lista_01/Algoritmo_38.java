package Lista_01;

import javax.swing.JOptionPane;

public class Algoritmo_38 {

	public static void main(String[] args) {
		// Ler um número real e imprimir a terça parte deste numero
		double num;
		double resultado;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número :"));
		resultado = num /3;
		
		JOptionPane.showMessageDialog(null, "A terça parte deste número é : " + resultado);

	}

}
