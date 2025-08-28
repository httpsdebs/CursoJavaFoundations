package Lista_02;

import java.util.Scanner;

public class Algoritmo_1 {

	public static void main(String[] args) {
		// 1. Usando a classe Scanner para entrada de dados, 
		//crie uma classe que receba o valor de um produto e a porcentagem 
		//de desconto, calcule e mostre o valor do desconto e o valor do
		//	produto com o desconto. Observação: o valor do desconto 
		//é calculado por meio da fórmula:
		//	valor do desconto = valor do produto * percentual de desconto / 100.

		double produto;
		double desconto;
		double produtoReajustado;
		double valorDesconto;
		
		Scanner ler = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite ao valor do produto: ");
		produto= ler.nextDouble();
		System.out.println("Digite o valor do desconto");
		desconto = ler.nextDouble();

		//processamento
		valorDesconto = (produto/100)*10;
		produtoReajustado = produto - valorDesconto;
		
		//saída de dados
		System.out.println("O valor do de desconto é : R$" + valorDesconto);
		System.out.println("O valor da compra com desconto é : R$" + produtoReajustado);


	}

}
