package week2.homeassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.findElement(By.name("firstname")).sendKeys("Karthika");
driver.findElement(By.name("lastname")).sendKeys("Test");
driver.findElement(By.name("reg_email__")).sendKeys("kanagarajkarthika24@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("Accessdenied@01");
WebElement dayWE = driver.findElement(By.id("day"));
Select dayDD = new Select (dayWE);
dayDD.selectByValue("22");
WebElement monthWE = driver.findElement(By.id("month"));
Select monthDD = new Select (monthWE);
monthDD.selectByIndex(1);
WebElement yearWE = driver.findElement(By.id("year"));
Select yearDD = new Select (yearWE);
yearDD.selectByValue("1999");
driver.findElement(By.className("_8esa")).click();

	}

}
