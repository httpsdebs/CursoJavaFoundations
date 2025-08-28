import javax.swing.JOptionPane;

public class SwitchCase01 {

	public static void main(String[] args) {
		// Switch case com If else
		// definindo as variáveis
		
		double valor_01, valor_02, total;
		string operacao;
		
		valor_01= Double.parseDouble(JOptionPane.showInputDialog("Digite um valor."));
		valor_02= Double.parseDouble(JOptionPane.showInputDialog("Digite um valor."));
		operacao= Double.parseDouble(JOptionPane.showInputDialog("Escolha a operação."));
		
		switch (operacao) {
		case "soma":
			total=valor_01+valor_02;
			JOptionPane.showMessageDialog(null,  "Total: "+total);
			if(total%2==0) {
				JOptionPane.showMessageDialog(null,  "O valor total é par.");	
			}else {
				JOptionPane.showMessageDialog(null,  "O valor total é ímpar.");
			}
			break;
		case "subtracao":
			total=valor_01 -valor_02;
			JOptionPane.showMessageDialog(null,  "TOtal: "+total);
			break;
			
			default:
		}

	}

}
