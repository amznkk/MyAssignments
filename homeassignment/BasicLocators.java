package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("democsr");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Accessdenied");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("5");
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);
driver.close();


	}

}
