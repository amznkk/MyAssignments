package week3.homeassignment;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("done");
		
	}
	public static void main (String args[]) {
		Button bt = new Button();
		bt.submit();
		bt.click();
		bt.setText();
	}

}
