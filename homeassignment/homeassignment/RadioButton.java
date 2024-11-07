package week3.homeassignment;

public class RadioButton extends Button {

	public void SelectRadioButton() {
		System.out.println("selected");
		
	}
	
	public static void main (String args[]) {
		RadioButton rb = new RadioButton();
		rb.SelectRadioButton();
		rb.submit();
	}
}
