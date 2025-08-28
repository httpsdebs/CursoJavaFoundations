package Model;

public class Filmes {
	//Atributos
	private String codigo;
	private String titulo;
	private String genero;
	private String produtora;
	private String dataCompra;
	
	//Construtor
	public Filmes() {
		
	}
	
	
	public Filmes(String codigo, String titulo, String genero, String dataCompra) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.dataCompra = dataCompra;
	}


	//Acessores
	
	
	public String getProdutora() {
		return produtora;
	}


	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	
	
}


