package Lista_03;

import javax.swing.JOptionPane;

public class Algoritmo_39 {

	public static void main(String[] args) {
		// Entrar com dois números reais e imprimir a média 
		//aritmética com a mensagem média antes do resultado
		
		double valor1;
		double valor2;
		double resultado;
		
		valor1= Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		valor2= Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
		
		resultado = valor1 + valor2/2;
		
		JOptionPane.showMessageDialog(null, "Média Aritmética: " + resultado);
		

	}

}
