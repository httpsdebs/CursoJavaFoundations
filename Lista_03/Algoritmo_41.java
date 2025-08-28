package Lista_03;

import javax.swing.JOptionPane;

public class Algoritmo_41 {

	public static void main(String[] args) {
		// Entrar com quatro números e imprimir a média ponderada, 
		//sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
		
		double nota_01, nota_02, nota_03, nota_04, mediaPonderada;
		
		nota_01= Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota: "));
		nota_02= Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota: "));
		nota_03= Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota: "));
		nota_04= Double.parseDouble(JOptionPane.showInputDialog("Digite a 4° nota: "));

		
		mediaPonderada = ((nota_01*1) + (nota_02*2) + (nota_03*3) + (nota_04*4))/10;
		
		
		JOptionPane.showMessageDialog(null,"A média das notas: "+ mediaPonderada);

	}

}
