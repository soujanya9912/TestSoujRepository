package com.facebook.FB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebooksignuppage {
	
	//Gender and dateofbIrth pending 
	@Test
	public void creatLoginacct() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Open Chrome Browser");
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	//name="firstname"
driver.findElement(By.name("firstname")).sendKeys("souji");
//name="lastname"
driver.findElement(By.name("lastname")).sendKeys("bomm");
//date-of-birth didnt do
//type="text" //placeholder aria-label="Mobile number or email address"//name="reg_email__"
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("souji");

//type="password"
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("soujvxvi");
//name="websubmit"
driver.findElement(By.xpath("//button[@name='websubmit']")).click();
Thread.sleep(2000);

	}
}
