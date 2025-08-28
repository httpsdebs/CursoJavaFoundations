package Aula_02;

import javax.swing.JOptionPane;

public class Exercicio_01 {

	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
		imc = peso/(altura*altura);
		JOptionPane.showMessageDialog(null,"Meu IMC é " + imc);
		
	}

}
