package InterfaceGrafica;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


	public class GuiLogin extends JFrame{
		
		
		protected static final String Toolkit = null;
		private JTextField tfLogin;
		private JPasswordField pfSenha;
		private JLabel lbSenha;
		private JLabel lbLogin;
		private JButton btLogar;
		private JButton btCancelar;
		private static GuiLogin frame;
		
		public GuiLogin() {
			inicializarComponentes();
			definirEventos();
		}
		
		
		
		private void inicializarComponentes() {
			//Definindo a tela (Frame)
			setTitle("Login do Sistema");//Fazer o tamanho da tela em pixels
			setBounds(0,0,250,200);//Organizar as informações da tela
			setLayout(null);
			//Instanciando os componentes
			tfLogin= new JTextField(5);//Caracteres que vao ser aceitos
			pfSenha= new JPasswordField(5);
			lbLogin= new JLabel("Login");//Mensagem do Label
			lbSenha= new JLabel("Senha");
			btLogar= new JButton("Logar");
			btCancelar= new JButton("Cancelar");
			
			//Definindo a posição na tela 
			
			tfLogin.setBounds(100,30,120,25);//(X,Y,Largura,Altura)
			pfSenha.setBounds(100, 75, 120, 25);;
			lbLogin.setBounds(30, 30, 80, 25);
			lbSenha.setBounds(30, 75, 80, 25);
			btLogar.setBounds(20,120,100,25);
			btCancelar.setBounds(125,120,100,25);
			
			//Adicionando os campos na tela
			add(tfLogin);
			add(lbSenha);
			add(lbLogin);
			add(btLogar);
			add(btCancelar);
			add(pfSenha);
			
		}


		private void definirEventos() {
			
			btLogar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String senha = String.valueOf(pfSenha.getPassword());
					
					
					if (tfLogin.getText().equals("Java")&&senha.equals("Java")) {
						frame.setVisible(false);
						JOptionPane.showMessageDialog(null, "Acesso Liberado");
						//GuiMenuPrincipal.abrir()
					}else {
						
						JOptionPane.showMessageDialog(null, "Login ou Senha incorretos");
						
					}
					
					
				}
			});
			
			btCancelar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			});
			
		
			
			}
		
		public static void main(String[]args) {

			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					frame= new GuiLogin();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation((tela.width - frame.getSize().width)/2,
							(tela.height - frame.getSize().height)/2);
					frame.setVisible(true);
				}
			});	
		
		}
	

}
