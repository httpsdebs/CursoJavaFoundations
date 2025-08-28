package Estrutura_Condicional;

public class Estrutura_Condicional05 {

	public static void main(String[] args) {

		int idade = 16;
		double altura = 1.8;
		
		if (idade>=15 && idade<=18 || altura>=1.7 && altura<=1.9) {
			System.out.println("Aprovada");
		}else {
			System.out.println("Reprovada");
		}
	}

}
