package Revisão;

import javax.swing.JOptionPane;

public class revisão_05 {

	public static void main(String[] args) {
    double salario, salarioNovo;
    final double QUARENTA=0.4;
    final double TRINTA= 0.3;
    
    salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário"));
    
    
    if(salario<=1000) {
    	salarioNovo=salario+(salario*QUARENTA);
    	JOptionPane.showMessageDialog(null, "Salário Reajustado "+salarioNovo);	
    	
    	
   } else if(salario>1000) {
	   salarioNovo=salario+(salario*TRINTA);
	   JOptionPane.showMessageDialog(null, "Salário Reajustado "+salarioNovo);
	   
   }
  
    
    
    
    
    
    
    
    
		
	}

}
