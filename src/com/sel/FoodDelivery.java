package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodDelivery { 
	public static void main(String[] args) throws  Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("https://www.swiggy.com/");
		driver.get(url);
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement clk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign up']")));
		clk.click();
		
	
		WebElement usrTxt = driver.findElement(By.xpath("//input[@id='mobile']"));
		usrTxt.sendKeys("0123456789");
		WebElement usrText = driver.findElement(By.xpath("//input[@id='name']"));
		usrText.sendKeys("bala");
		WebElement userTxt = driver.findElement(By.xpath("//input[@id='email']"));
		userTxt.sendKeys("bala123@gmail.com");
		WebElement entTxt = driver.findElement(By.xpath("//input[@id='password']"));
		entTxt.sendKeys("bala123@.");
		WebElement clck = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		clck.click();
		
	}

}
