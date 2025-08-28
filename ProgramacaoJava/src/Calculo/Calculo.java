package Calculo;

import javax.swing.JOptionPane;

public class Calculo {

	public static void somar() {
		int valor_01;
		int valor_02;
		int total;
		
		valor_01=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		valor_02=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		total= valor_01+valor_02;
		
		JOptionPane.showMessageDialog(null, "Total: "+total); 
		
		public static void subtrair () {
			int valor_01;
			int valor_02;
			int total;
			
			valor_01=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			valor_02=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			
			total= valor_01-valor_02;
			
			JOptionPane.showMessageDialog(null, "Total: "+total);	
		
			public static void multiplicar () {
				int valor_01;
				int valor_02;
				int total;
				
				valor_01=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
				valor_02=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
				
				total= valor_01*valor_02;
				
				JOptionPane.showMessageDialog(null, "Total: "+total);	
				
				public static void dividir () {
					int valor_01;
					int valor_02;
					int total;
					
					valor_01=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
					valor_02=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
					
					total= valor_01/valor_02;
					
					JOptionPane.showMessageDialog(null, "Total: "+total);	
	}
}
