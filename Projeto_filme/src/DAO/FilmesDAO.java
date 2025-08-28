package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.BD;
import Model.Filmes;

public class FilmesDAO {
	public Filmes filme;
	public BD bd;
	private PreparedStatement statement;
	private ResultSet resultSet;
	private String men,sql;
	public static final byte INCLUSAO=1;
	public static final byte ALTERACAO=2;
	public static final byte EXCLUSAO=3;
	
	public FilmesDAO(){
		bd = new BD();
		filme = new Filmes();
	}
	
	public boolean localizar() {
		sql = "select * from filmes where codigo =?";
		try {
			statement = bd.connection.prepareStatement(sql);
			statement.setString(1, filme.getCodigo());
			resultSet = statement.executeQuery();
			resultSet.next();
			filme.setCodigo(resultSet.getString(1));
			filme.setTitulo(resultSet.getString(2));
			filme.setGenero(resultSet.getString(3));
			filme.setProdutora(resultSet.getString(4));
			filme.setDataCompra(""+resultSet.getString(5));
		
			return true;
		
		}catch(SQLException e) {
			return false;
		}
		
		
	}
	public String atualizar(int operacao) {
		men = "Operação realizada com sucesso";
		
		try {
			if (operacao == INCLUSAO) {
				
			}else if(operacao ==ALTERACAO) {
				
			}else if (operacao == EXCLUSAO) {
				
			}
			if(statement.executeUpdate()==0) {
				men ="Fal";
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
