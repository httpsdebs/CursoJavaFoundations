package Lista_02;

import javax.swing.JOptionPane;

public class Algoritmo_5 {

	public static void main(String[] args) {
		// 5. Considere a seguinte informação a respeito do 
		//cálculo da aposentadoria. Para se aposentar por idade,
		//as mulheres precisam ter atingido 60 anos de idade
		//e os homens, 65. Já na aposentadoria por tempo de
		//contribuição, o tempo mínimo exigido é de 30 anos para as
		//mulheres e de 35 anos para os homens. Com base
		//nessas informações, elabore uma classe que receba a
		//idade de uma pessoa, seu sexo e a quantidade de anos
		//de contribuição. A seguir, calcule a quantidade de anos
		//que falta de contribuição para se aposentar, ou então emita a
		//mensagem: “você já tem o direito à aposentadoria”.
		
		
		int resultadodia;
		int resultadomes;
		int resultadoano;
		int idia;
		int imes;
		int iano;
		int fdia;
		int fmes;
		int fano;
		
		
		idia =Integer.parseInt(JOptionPane.showInputDialog("Em que dia você começou a trabalhar?"));
		imes =Integer.parseInt(JOptionPane.showInputDialog("Em que mês você começou a trabalhar?"));
		iano =Integer.parseInt(JOptionPane.showInputDialog("Em que ano você começou a trabalhar?"));
		fdia =Integer.parseInt(JOptionPane.showInputDialog("Qual foi o último dia que você trabalhou?"));
		fmes =Integer.parseInt(JOptionPane.showInputDialog("Qual foi o último mês que você trabalhou?"));
		fano =Integer.parseInt(JOptionPane.showInputDialog("Qual foi o último ano que você trabalhou?"));
		
		resultadodia = idia-fdia;
		resultadomes = imes-fmes;
		resultadoano = iano-fano;
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "Você já cumpriu " + resultadodia + "dia(s), " + resultadomes + "mês(es) e " + resultadoano + "ano(s)");
		
		
		

		
		
		
		
		
		
		
		
	}

}
