package week3.homeassignment;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("checked");
}


public static void main (String args[]) {
	CheckBoxButton cbb = new CheckBoxButton();
	cbb.clickCheckButton();
	cbb.submit();

}

}