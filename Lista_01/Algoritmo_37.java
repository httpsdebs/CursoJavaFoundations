package Lista_01;

import javax.swing.JOptionPane;

public class Algoritmo_37 {

	public static void main(String[] args) {
		//Ler dois números inteiros e imprimir o produto.
		
		int valor1;
		int valor2;
		int resultado;
		
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		resultado = valor1 * valor2;
		
		JOptionPane.showMessageDialog(null, "Multiplicação: " + resultado);

	}

}
