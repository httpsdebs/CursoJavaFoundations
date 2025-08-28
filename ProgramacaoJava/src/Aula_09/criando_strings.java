package Aula_09;

public class criando_strings {

	public static void main(String[] args) {
    String texto = "Olá, mundo!";
    int tamanho;
    char primeiroChar;
    String subString;
    int indice;
    String maiusculo,minusculo,substituto;
 
   
    tamanho = texto.length();
   
    System.out.println("o tamanhho do texto é:"+tamanho);
    
    primeiroChar = texto.charAt(0);
    System.out.println("O primeiro caracter é:"+primeiroChar);
    
    subString =texto.substring(5);
    System.out.println("A substring a partir do indice 5 é:"+subString);
    
    indice= texto.indexOf("mundo");
    System.out.println("A palavra 'mundo' começa no indice:"+indice);
    
    minusculo=texto.toLowerCase();
    System.out.println("Em minusculas:"+minusculo);
    
    maiusculo= texto.toUpperCase();
    System.out.println("Tudo em maiusculo:"+maiusculo);
    
    
    substituto= texto.replace("mundo", "Amigo");
    System.out.println("Texto mundo substituido por amigo:"+substituto);
    
    String[] palavras= texto.split(" ");
    for(String palavra:palavras) {
    	System.out.println(palavra);
    	
    }
      
    boolean comecaComOla= texto.startsWith("Olá");
    System.out.println("O texto começa com "+comecaComOla);
    
    
    boolean terminaCommundo = texto.endsWith("!");
    System.out.println("O texto termina com " +terminaCommundo);
    
    boolean vazio=texto.isEmpty();
    System.out.println("Está vazio? "+vazio);
    
	String inverter= new StringBuilder(texto).reverse().toString();
	System.out.println("O texto invertido é: "+inverter);
	

      
    
 
   
    		
    


    
    
    
    
  
    
    
    
    
    
    
	}

}
