package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount {
			public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
			WebElement txt =driver.findElement(By.xpath("//input[@id='firstName']"));
			txt.sendKeys("Bala");
			System.out.println("Bala");
			WebElement usertxt =driver.findElement(By.xpath("//input[@id='lastName']"));
			usertxt.sendKeys("kannan");
			System.out.println("kannan");
			WebElement usrtxt =driver.findElement(By.xpath("//input[@id='username']"));
			usrtxt.sendKeys("Bala@gmail.com");
			System.out.println("Bala@gmail.com");
			WebElement passtxt =driver.findElement(By.xpath("//input[@name='Passwd']"));
			passtxt.sendKeys("Bala123");
			WebElement cTxt =driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
			cTxt.sendKeys("Bala123");
			Thread.sleep(2000);
			WebElement shwPass = driver.findElement(By.xpath("//input[@id='i3']"));
			shwPass.click();
		}

}
