import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		// Switch case		
		//definindo variável
		
		String teste;
		
		teste= JOptionPane.showInputDialog("Digite uma letra.");
		switch (teste) {
		
		case "s":
			JOptionPane.showMessageDialog(null,  "Você digitou a letra S.");
			break;
		case "f":
			JOptionPane.showMessageDialog(null,  "Você digitou a letra F.");
			break;
			
			default:
				JOptionPane.showMessageDialog(null,  "Letra inválida.");
			
			
		
		

	}

}
