package week3.homeassignment;

public abstract class ConcreteClass implements DatabseConnection {
	
public void connect() {
	System.out.println("connection success");
}
	
	public void disconnect() {
		System.out.println("disconnect success");
	}
	
	public void executeUpdate() {
		System.out.println("execution done");
	}
public static void main(String[] args) {
	
	
}

}
