package com.we.admit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://app-dev.weadmit.io/");
		driver.findElement(By.id("username")).sendKeys("wstudent");
		driver.findElement(By.id("password")).sendKeys("Cheryl123@");
		driver.findElement(By.xpath("//span[text()='SIGN IN']")).click();
		
	
		
		
		
		/*driver.findElement(By.xpath("(//div[text()='Not started'])[1]")).click();
		driver.findElement(By.xpath("(//li[@role='option'])[7]")).click();
		
	    driver.findElement(By.xpath("//div[text()='Select'])[6]")).click();
	    driver.findElement(By.xpath("//li[@data-value='ED']")).click();*/
		
		

	}

}
