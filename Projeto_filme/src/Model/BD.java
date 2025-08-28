package Model;
import java.sql.*;

public class BD {
	public Connection connection = null;
	private final String DRIVER = "com.mysql.Driver";
	private final String DBNAME = "banco";
	private final String URL = "jdbc:mysql://localhost:3306/"+DBNAME;
	private final String LOGIN = "root";
	private final String SENHA = "senai@126";
	
	public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,LOGIN,SENHA);
			System.out.println("conectado com sucesso");
			return true;
			
		}catch (ClassNotFoundException erro) {
			System.out.println("Driver não encontrado" + erro.toString());
			return false;
			
		} catch (SQLException erro) {
			System.out.println("Falha ao conectar" + erro.toString());
			return false;
			
		}
	
	}
	public void close() {
		try {
			connection.close();
			System.out.println("Desconectado com sucesso");
		} catch (SQLException erro) {
			
		}
	}

}
