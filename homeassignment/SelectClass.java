package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

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
driver.findElement(By.id("accountName")).sendKeys("Accessdenied01");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
WebElement industryWE = driver.findElement(By.name("industryEnumId"));
Select industryDD = new Select (industryWE);
industryDD.selectByIndex(3);
WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
Select ownershipDD = new Select (ownershipWE);
ownershipDD.selectByVisibleText("S-Corporation");
WebElement sourceWE = driver.findElement(By.name("dataSourceId"));
Select sourceDD = new Select (sourceWE);
sourceDD.selectByValue("LEAD_EMPLOYEE");
WebElement marketingWE = driver.findElement(By.name("marketingCampaignId"));
Select marketingDD = new Select (marketingWE);
marketingDD.selectByIndex(6);
WebElement stateWE = driver.findElement(By.name("generalStateProvinceGeoId"));
Select stateDD = new Select (stateWE);
stateDD.selectByValue("TX");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);
//driver.close();





	}

}
