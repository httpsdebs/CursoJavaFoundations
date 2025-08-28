package Aula_02;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		//Definindo as variáveis
		int valor_01;
		int valor_02;
		int total;
		
		//Definindo o método de entrada de dados 
		Scanner ler = new Scanner(System.in);
		
		//Entrada de Dados
		System.out.println("Digite um valor:");
		valor_01=ler.nextInt();
		System.out.println("Digite outro valor:");
		valor_02=ler.nextInt();
		
		//Processando os dados
		total = valor_01 + valor_02;
		
		//Saída de dados do processamento
		System.out.println("O valor total é" + total);
		
	}

}
