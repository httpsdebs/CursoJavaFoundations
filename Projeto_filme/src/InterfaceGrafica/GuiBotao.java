package InterfaceGrafica;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GuiBotao extends JPanel {
	private JButton btMensagem, btTeimoso;
	private ImageIcon imageIcon1;
	
	public GuiBotao() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
	setLayout(null);
	imageIcon1 = new ImageIcon("javaicone.png");
	
	btMensagem = new JButton ("Mensagem", imageIcon1);
	btTeimoso= new JButton("Teimoso");
	
	btMensagem.setMnemonic(KeyEvent.VK_M);
	btMensagem.setToolTipText("Clique aqui para ver a mensagem");
	
	btMensagem.setBounds(50,20,140,38);
	btTeimoso.setBounds(50, 70, 100, 25);
	
	add(btMensagem);
	add(btTeimoso);
	
		
	}
	
	private void add(JButton btMensagem2) {
		// TODO Auto-generated method stub
		
	}

	private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	}

	private void definirEventos() {
		btMensagem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

	}
}
