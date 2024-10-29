package week2.homeassignment;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.leafground.com/radio.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

//Click on a radio button, then click on the same radio button again to verify that
//it becomes ‘unselected’.

//driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();	
//WebElement favbrow = driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]"));
//boolean isSelected = favbrow.isSelected();
//if (isSelected == false) {
	//favbrow.click();
}
	}

