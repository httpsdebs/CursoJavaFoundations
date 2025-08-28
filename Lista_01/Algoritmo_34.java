package Lista_01;

import javax.swing.JOptionPane;

public class Algoritmo_34 {

	public static void main(String[] args) {
		//Ler um número inteiro e imprimir seu sucessor e seu antecessor.
		int num;
		int ant;
		int suc;
		
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		ant= num - 1;
		suc = num + 1;
		
		JOptionPane.showMessageDialog(null, "Número digitado: " + num + "\n Antecessor: " + ant + "\n Sucessor: " + suc);
		

	}

}
