package week3.homeassignment;

public abstract class MySqlConnection implements DatabseConnection {
	
	public abstract void executeQuery();
	
public void connect() {
	System.out.println("connection successful");
}
	
	public void disconnect() {
		System.out.println("disconnected");
	}
	
	public void executeUpdate() {
		System.out.println("update done");
	}
	
	public static void main(String[] args) {
		
	}

	

}
