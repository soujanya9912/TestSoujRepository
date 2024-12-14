package com.facebook.FB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebooklogin {
	//PENDING--YES,CONTINUE button
	@Test
	public void creatLoginacct() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		System.out.println("Open Chrome Browser");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	Thread.sleep(3000);
		//driver.quit();
driver.findElement(By.name("email")).sendKeys("test");
//pass
driver.findElement(By.name("pass")).sendKeys("bbbbb");

//login
driver.findElement(By.name("login")).click();

}}
