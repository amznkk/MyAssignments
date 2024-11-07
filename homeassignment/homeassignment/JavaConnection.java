package week3.homeassignment;

public class JavaConnection extends MySqlConnection {
	
	public void executeQuery() {
		System.out.println("query executed");
	}
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}

}
