package CondicionalSimples;

import javax.swing.JOptionPane;

public class ExercicioCond {

	public static void main(String[] args) {
		// double transacao, venal, percentual, taxaImposto
		
		double transacao, venal, percentual, taxaImposto;
		
	transacao= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda"));
	venal= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal"));	
	percentual= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de impoosto"));
	
	if (transacao > venal) {
		taxaImposto= (transacao*percentual)/100;
		JOptionPane.showMessageDialog(null,  "O valor do ITBI a ser pago é: "+taxaImposto);
	}else if (venal> transacao) {
		taxaImposto= (venal*percentual)/100;
		JOptionPane.showMessageDialog(null, "O valor do ITBI a ser pago é: "+taxaImposto);
	}else {
		JOptionPane.showMessageDialog(null, "O valor é inválido");
		
	}
	
	
	}
	
	

}
