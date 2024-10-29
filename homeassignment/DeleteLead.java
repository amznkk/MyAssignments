package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("democsr");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//Capture lead id of first resulting lead and click first resulting lead
//driver.findElement(By.linkText("10718")).click();
driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=14841']")).click();

driver.findElement(By.className("subMenuButtonDangerous")).click();

driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.name("id")).sendKeys("14841");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//verify presence of text
WebElement lead = driver.findElement(By.linkText("No records to display"));
boolean isDisplayed = lead.isDisplayed();
if (isDisplayed == true) {
	System.out.println("No records to display");
}





	}

}
