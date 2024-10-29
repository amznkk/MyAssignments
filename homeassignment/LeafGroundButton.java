package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
driver.manage().window().maximize();
driver.findElement(By.id("j_idt88:j_idt90")).click();
String title = driver.getTitle();
System.out.println(title);

driver.navigate().back();
driver.findElement(By.xpath("(//div[@class='card'])[2]")).getText();
//WebElement text = driver.findElement(By.xpath("(//div[@class='card'])[2]"));
//boolean isEnabled = text.isEnabled();
//if(isEnabled == false) {
	//System.out.println("disabled");

//print submit
WebElement submit = driver.findElement(By.id("j_idt88:j_idt94"));
Point location = submit.getLocation();
System.out.println("Location of X :"+ location.getX()+ "," +"Location of Y :" +location.getY());

//print save
WebElement save = driver.findElement(By.linkText("Save"));
String color = save.getCssValue("background-color");
System.out.println("Color is : "+color);

Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
System.out.println("Width :"+size.getWidth()+ "," +"Height : "+size.getHeight());



}
	}


