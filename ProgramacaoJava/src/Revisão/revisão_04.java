package Revisão;

import javax.swing.JOptionPane;

public class revisão_04 {

	public static void main(String[] args) {
    double salarioMinimo,salarioUsuario;
    double qtdeSalario;
    
    
    salarioMinimo=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario minimo"));
    salarioUsuario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do usuário"));
    
    qtdeSalario=salarioUsuario/salarioMinimo;
    
    JOptionPane.showMessageDialog(null,"A quantidade de salarios minimos é: "+qtdeSalario);
    
    
    
	}

}
