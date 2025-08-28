package Lista_01;

import javax.swing.JOptionPane;

public class Algoritmo_35 {

	public static void main(String[] args) {
		//Ler nome, endereço e telefone e imprimi-los.
		
		String nome;
		String endereco;
		String telefone;
		
		
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		endereco = JOptionPane.showInputDialog("Digite o seu endereço: ");
		telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
		
		JOptionPane.showMessageDialog(null,"Meu nome é " + nome + "\nMeu endereço é "+ endereco + "\nMeu telefone é " + telefone);
		

	}

}
