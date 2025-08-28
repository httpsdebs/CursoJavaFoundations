package Aula_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class estudandoRandom {

	public static void main(String[] args) {
    Random random = new Random();
    
    int numeroInteiro = random.nextInt();
    System.out.println("Numero aleatorio: "+numeroInteiro);
    int numeroInteiro1 = random.nextInt(40);
    System.out.println("Numero aleatorio: "+numeroInteiro1);
    int numeroInteiro2 = random.nextInt(1,50);
    System.out.println("Numero aleatorio: "+numeroInteiro2);
    
    
    
    double pontoflutuante=random.nextDouble();
    System.out.println("ponto flutuante "+pontoflutuante);
    
    boolean valorBoleano = random.nextBoolean();
    System.out.println("O valor boleano é: "+valorBoleano);
    
    byte[]bytesAleatorios = new byte[5];
    random.nextBytes(bytesAleatorios);
    System.out.println("Sequencia de bytes aleatorios: "+Arrays.toString(bytesAleatorios));
    
    
    List<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    Collections.shuffle(numeros,random);
    System.out.println("Lista embaralhada: "+numeros);
    
    
    String caracteres = "ABCDEFGHIJKLMNOPQRSXYWZabcdefghijklmnopqrsxywz\0123456789@#&";
    int comprimentoSenha=8;
    StringBuilder senhaAleatoria = new StringBuilder();
    for(int i=0; i<comprimentoSenha; i++) {
    	int indiceCaracteres = random.nextInt(caracteres.length());
    	char caractereAleatorio = caracteres.charAt(indiceCaracteres);
    	senhaAleatoria.append(caractereAleatorio);	
    	
    }
    System.out.println("Senha Aleatoria: "+senhaAleatoria);
    		
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
