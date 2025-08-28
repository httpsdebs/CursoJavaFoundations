package Lista_01;

import javax.swing.JOptionPane;

public class Algoritmo_33 {

	public static void main(String[] args) {
		//Ler dois números inteiros e imprimi-los.
		int num1;
		int num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		
		JOptionPane.showMessageDialog(null, "Número 1 : " + num1 + "\n Número 2 : " + num2);
		

	}

}
