package Lista_01;

import javax.swing.JOptionPane;

public class Algoritmo_36 {

	public static void main(String[] args) {
		// Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecera mensagem: Soma.
		int valor1;
		int valor2;
		int resultado;
		
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		resultado = valor1 + valor2;
		
		JOptionPane.showMessageDialog(null, "Soma: " + resultado);
		
		

	}

}
