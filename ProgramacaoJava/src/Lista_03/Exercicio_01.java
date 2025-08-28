package Lista_03;

import javax.swing.JOptionPane;

public class Exercicio_01 {

	public static void main(String[] args) {
		double valor;
		double desconto;
		double valorTotal;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
		
		
		if(valor >=50 && <200) {
			desconto=(valor * 5)/100;
			valorTotal = valor - desconto; 
			
		}
	}

}
