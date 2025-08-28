package CondicionalSimples;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Estrutura condicional simples
		
		//definindo variável
		
		int idade;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite a idade da modelo: ");
		idade= ler.nextInt();
		
		if (idade==15) {
			System.out.println("Candidata aprovada.");
		}else {
			System.out.println("Candidata reprovada.");
		}
				

	}

}
