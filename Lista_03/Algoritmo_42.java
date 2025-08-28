package Lista_03;

import javax.swing.JOptionPane;

public class Algoritmo_42 {

	public static void main(String[] args) {
		//Entrar com um ângulo em graus e imprimir: seno, coseno,
		//tangente, secante, cosecante e tangente deste ângulo.
		
		double numero, angulo, seno, coseno, tangente, cosecante, secante,cotangente;
		
		numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo: "));
		
		angulo = Math.toRadians(numero);
		seno = Math.sin(angulo);
		coseno = Math.cos(angulo);
		tangente = Math.tan(angulo);
		secante = 1.0/seno ;
		cosecante = 1.0/ coseno ;
		cotangente = 1.0/tangente ;
		

	}

}
