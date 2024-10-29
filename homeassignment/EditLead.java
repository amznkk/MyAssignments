package week2.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Karthika");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test01");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Amz");
driver.findElement(By.name("departmentName")).sendKeys("Testing");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Working for 3 years");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kanagarajkarthika24@gmail.com");
WebElement stateWE = driver.findElement(By.name("generalStateProvinceGeoId"));
Select stateDD = new Select(stateWE);
stateDD.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.name("description")).clear();

driver.findElement(By.name("importantNote")).sendKeys("learning selenium");
driver.findElement(By.xpath("//input[@value='Update']")).click();
String title = driver.getTitle();
System.out.println(title);
//driver.close();

	}

}
