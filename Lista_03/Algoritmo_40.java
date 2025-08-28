package Lista_03;

import javax.swing.JOptionPane;

public class Algoritmo_40 {

	public static void main(String[] args) {
		// Entrar com dois números inteiros e imprimir a seguinte saída:
		//dividendo
		//divisor:
		//quociente:
		//resto:
		
		
		double dividendo, divisor, quociente, resto;
		
		dividendo= Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
		divisor= Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor: "));
		
		quociente = dividendo/divisor;
		resto = dividendo%divisor;
		
		
		JOptionPane.showMessageDialog(null,"Dividendo: "+ dividendo + "\nDivisor: " + divisor + "\nQuociente: "+ quociente + "\nResto: "+ resto);

	}

}
