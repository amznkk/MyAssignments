package week3.homeassignment;

public class TextField extends WebElement{
	
	public void getText() {
		System.out.println("Practise");
	
	}
	public static void main (String args[]) {
		TextField tf = new TextField();
		tf.getText();
		tf.click();
		tf.setText();
	}
}
