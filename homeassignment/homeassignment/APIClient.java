package week3.homeassignment;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		System.out.println(endPoint);
		}
public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
	System.out.println(endPoint);
	System.out.println(requestBody);
	System.out.println(requestStatus);
}

public static void main (String args[]) {
	APIClient ap = new APIClient();
	ap.sendRequest("Pass");
	ap.sendRequest("Pass", "Success", true);
	
}
}
