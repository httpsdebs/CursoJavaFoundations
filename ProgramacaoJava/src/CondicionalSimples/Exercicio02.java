package CondicionalSimples;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// definindo variáveis
		
		int idade;
		double altura, peso;
		
		Scanner ler= new Scanner(System.in);
		System.out.println("Digite a idade da modelo: ");
		idade= ler.nextInt();
		System.out.println("Digite a altura da modelo: ");
		altura= ler.nextDouble();
		System.out.println("Digite o peso da modelo: ");
		peso= ler.nextDouble();
		
		if(idade ==15 || idade ==20 && altura >= 1.6 && altura <=1.8 && peso >=55 && peso<=90) {
			System.out.println("Candidata aprovada.");
			
		}else {
			System.out.println("Candidata reprovada.");
		}
		
		

	}

}
