package week2.homeassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
driver.manage().window().maximize();

//Basic notification checks and unchecks automatically
driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();

WebElement notification = driver.findElement(By.xpath("//span[text()='Ajax']"));
boolean isSelected = notification.isSelected();
if (isSelected == false) {
	notification.click();
}
driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon')]")).click();
WebElement toggle = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
boolean isDisplayed = toggle.isDisplayed();
if (isDisplayed == true) {
	toggle.click();
}
//driver.findElement(By.xpath("//span[text()='Disabled']")).getText();
WebElement display = driver.findElement(By.xpath("//span[text()='Disabled']"));
boolean isEnabled = display.isEnabled();
if (isEnabled == false) {
	display.getText();

driver.findElement(By.xpath("//label[text()='Java']")).click();

driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//not able to check the cities
WebElement citiesWE = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
Select citiesDD = new Select(citiesWE);
citiesDD.selectByValue("Miami");

//driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();






//driver.close();



	}

}}
