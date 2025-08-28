package Aula_02;

import javax.swing.JOptionPane;

public class EntradaDeDados02 {

	public static void main(String[] args) {
		String nome;
		int idade;
		double salario;
		
		nome = JOptionPane.showInputDialog("Digite o seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		salario =Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário"));
		
		JOptionPane.showMessageDialog(null,"Meu nome é " + nome + "\n Minha idade é "+ idade + "\n Meu salário é " + salario);
		
	}

}
