package week3.homeassignment;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("amznkk");
	}
	public void password() {
		System.out.println("12345");
	}
	
	public static void main (String args[]) {
		LoginTestData ltd = new LoginTestData();
		ltd.enterUsername();
		ltd.password();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
	}

}
