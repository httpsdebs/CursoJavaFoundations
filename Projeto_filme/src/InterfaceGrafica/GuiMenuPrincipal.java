package InterfaceGrafica;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class GuiMenuPrincipal extends JFrame {
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao;
	
	
	public GuiMenuPrincipal() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		//definindo a tela
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		contentPane = getContent();
		
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		mnExemplos = new JMenu("Exemplos");
		mnExemplos.setMnemonic('E');
		
	}
	
	private Container getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	private void definirEventos() {
		
	}
	
	
	
	
	
	
	

}
