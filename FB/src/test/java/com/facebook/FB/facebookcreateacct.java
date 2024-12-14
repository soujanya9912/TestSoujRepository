package com.facebook.FB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebookcreateacct {
	//Create new account -Not working
	@Test
	public void creatLoginacct() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Open Chrome Browser");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	//Create new account
	driver.findElement(By.xpath("//div[a[@role='button']][2]")).click();
	//driver.findElement(By.xpath("")


}}
