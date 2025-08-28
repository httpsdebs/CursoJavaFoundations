package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class Estrutura_Condicional06 {

	public static void main(String[] args) {
		double nota_01, nota_02, nota_03, media;
		

		nota_01= Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
		nota_02= Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
		nota_03= Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota: "));
		
		
		media = nota_01 + nota_02 + nota_03 /3;
		
		if(media>=7) {
			System.out.println("Aluno Aprovado");
		}else if(media<7 && media>=5) {
			System.out.println("Aluno de Exame");
		}else if(media<5 && media>3) {
			System.out.println("Aluno no Conselho");
		}else {
			System.out.println("Aluno Reprovado");
		}
		
		
		JOptionPane.showMessageDialog(null,"A média das notas: "+ media);

	}

}
