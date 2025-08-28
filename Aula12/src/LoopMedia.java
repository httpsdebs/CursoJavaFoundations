import java.util.Scanner;

public class LoopMedia {

	public static void main(String[]args) {
		
	Scanner sc= new Scanner(System.in);	
		
	int totalNotas=0;
	int contador=0;
	double media;
	
	while(true) {
		System.out.println("Digite a nota ou -1 para sair");
		int nota= sc.nextInt();
		
		if(nota==-1) {
			break;
		}
		totalNotas+=nota;
		contador++;
	}
	
	media=(double) totalNotas/contador;
	System.out.println("Media do Aluno: "+media);
	
		
		
		
	}
}
