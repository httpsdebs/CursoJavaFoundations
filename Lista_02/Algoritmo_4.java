package Lista_02;

import javax.swing.JOptionPane;

public class Algoritmo_4 {

	public static void main(String[] args) {
		// 4. Usando a classe JOptionPane para entrada de dados, 
		//elabore uma classe que receba a nota de duas provas e de 
		//um trabalho. Calcule e mostre a média e o resultado final 
		//(aprovado ou reprovado). Para calcular a média utilize
		//a fórmula seguinte: média = (nota da prova 1 + nota
		//da prova 2 +nota do trabalho) / 3. Considere que a média 
		//mínima para aprovação é 6.
		
		double nota1;
		double nota2;
		double trabalho;
		double media;
		
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 1° prova :"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 2° prova :"));
		trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho :"));
		
		media = (nota1 + nota2 + trabalho)/3;
		
		
		JOptionPane.showMessageDialog(null, "Sua média é : " + media);

		
		
		
		
		
		
	}

}
