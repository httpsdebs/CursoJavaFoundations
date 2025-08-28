package Revisão;

import javax.swing.JOptionPane;

public class revisão_06 {

	public static void main(String[] args) {

	double gasolinaC=2.992,gasolinaA=3.054,alcool=2.1095,diesel=2.283, total;
	int opcao;
	String data;
	
	
	
	opcao=Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção\n"
	                      + "1 - gasolina comum\n"
	                      + "2 - gasolina aditivada\n"
	                      + "3 - Alcool\n"
	                      + "4 - diesel\n"));
	                      
	switch (opcao) {
	case 1:
		data=JOptionPane.showInputDialog("Digite a data de pagamento: ");
		if(data.equals("a vista")) {
			total = gasolinaC-(gasolinaC*0.053);
			JOptionPane.showMessageDialog(null, "Total a pagar: "+total);
			
		}else if(data.equals("pre")) {
			total=gasolinaC+(gasolinaC*0.089);
			JOptionPane.showMessageDialog(null, "Total a pagar: "+total);
			
		}
		break;
		
      default:
    	  break;
		
		
	}
	                      
		
		
		
	}

}
