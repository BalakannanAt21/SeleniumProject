package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(2000);
	Actions acc = new Actions(driver);
	WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	acc.dragAndDrop(source, target).perform();
	
	WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement tgt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
    acc.dragAndDrop(src, tgt ).perform();
   
    WebElement drg = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement drp = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	acc.dragAndDrop(drg, drp).perform();
	 
	 WebElement start = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	 WebElement destiny = driver.findElement(By.xpath("//li[@class='placeholder']"));
     acc.dragAndDrop(start, destiny).perform();
	
     WebElement clck = driver.findElement(By.xpath("//a[text()='Perfect!']"));
     clck.click(); 
 }
  }
