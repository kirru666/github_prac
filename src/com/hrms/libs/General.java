package com.hrms.libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class General extends Global{
//Re-usable Function
	
	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		
		
	}
	
	public void closeApp() {
		driver.close();
		System.out.println("Application closed");
	}
	
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		
	}
	
/*	public void addEmp() throws Exception {
		
		
		WebElement ele=driver.findElement(By.linkText(link_pim));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		//driver.findElement(By.linkText(link_pim)).click();
		//driver.findElement(By.xpath("//input[@value='btn_add']")).click();
		driver.findElement(By.linkText(link_add)).click();
		driver.switchTo().frame("rightMenu");
		Thread.sleep(1000);
		driver.findElement(By.name(txt_firstname)).sendKeys(fn);
		Thread.sleep(1000);
		driver.findElement(By.name(txt_lastname)).sendKeys(ln);
		Thread.sleep(1000);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New emp added");
		driver.switchTo().defaultContent();
		
	}*/
	
	public void delEmp() throws Exception {
		
		/*WebElement ele=driver.findElement(By.linkText(link_pim));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		*/
		driver.findElement(By.name(txt_search)).sendKeys(en);
		Thread.sleep(3000);
	
		driver.findElement(By.name("plainbtn")).click();
		
		
	}
}
