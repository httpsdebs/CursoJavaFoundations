package Aula_02;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		String nome;
		int idade;
		double salario; //não pode colocar ponto no console, e sim uma vírgula
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		nome=ler.nextLine();
		System.out.println("Digite a sua idade");
		idade=ler.nextInt();
		System.out.println("Digite o seu salário");
		salario=ler.nextDouble();


		System.out.println("Meu nome é: "+ nome);
		System.out.println("Minha idade é: "+ idade);
		System.out.println("Meu salário é: "+ salario);


	}

}
