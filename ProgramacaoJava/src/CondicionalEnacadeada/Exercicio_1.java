package CondicionalEnacadeada;

import javax.swing.JOptionPane;

public class Exercicio_1 {

	public static void main(String[] args) {
		// definindo variáveis
		
		double nota_01, nota_02, nota_03, media;
		
		nota_01= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
		nota_02= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
		nota_03= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
		
		media= (nota_01+nota_02+nota_03)/3;
		
		if(media>=7) {
			JOptionPane.showMessageDialog(null,"Aluno Aprovado.");
		
		}else if (media>=5 && media<7) {
			JOptionPane.showMessageDialog(null, "Aluno em Recuperação.");
		}else if (media>=4.5) {
			JOptionPane.showMessageDialog(null, "Aluno para conselho.");
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado.");
		}
		
	}
	
	

}
