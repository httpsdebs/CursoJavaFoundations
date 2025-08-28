package Estrutura_Condicional;

import java.util.Scanner;

public class Estrutura_Condicional04 {

	public static void main(String[] args) {
		double salario;
		double parcela;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		salario = ler.nextDouble();
		
		parcela = (salario*30)/100;
		
		if(parcela>=300) {
			System.out.println("Empréstimo aprovado");
		}else {
			System.out.println("Empréstimo reprovado");
		}
		
		

	}

}
