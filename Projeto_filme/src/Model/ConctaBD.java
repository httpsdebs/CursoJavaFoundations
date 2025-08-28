package Model;

public class ConctaBD {

	public static void main(String[] args) {
		BD bd = new BD();
		
		bd.getConnection();
		bd.close();
		
	}

}
