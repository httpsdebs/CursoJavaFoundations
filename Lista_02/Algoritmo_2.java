package Lista_02;

import java.util.Scanner;

public class Algoritmo_2 {

	public static void main(String[] args) {
		// 2. Usando a classe Scanner para entrada de dados, 
		//faça uma classe que receba dois valores inteiros.
		//O primeiro valor corresponde à quantidade de pontos
		//do líder do campeonato brasileiro de futebol.
		//O segundo valor corresponde à quantidade de pontos 
		//do time lanterna. Considerando que cada vitória vale
		//3 pontos, elabore uma classe que calcule o número de
		//vitórias necessárias para que o time lanterna alcance 
		//(ou ultrapasse) o líder. Por exemplo, supondo que as
		//quantidades de ponto fornecidas sejam 40 e 22, então
		//o número de vitórias apresentada na saída deverá
		//ser 6, pois (40-22) / 3 = 6*
		
		double cbf;
		double lanterna;
		double vitorias;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de pontos do líder do campeonato brasileiro de futebol");
		cbf=ler.nextInt();
		System.out.print("Digite quantidade de pontos do time lanterna ");
		lanterna=ler.nextInt();
		
		vitorias = (cbf-lanterna)/3;
		
		System.out.println("O time Lanterna precisa de " + vitorias +" vitórias para ultrapassar o Líder");
		
		
	}

}
