package com.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GreensTech { 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suresh\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = ("http://www.greenstechnologys.com/");
		driver.get(url);
		WebElement clk= driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		clk.click();
		Thread.sleep(2000);
		WebElement Txt = driver.findElement(By.xpath("//input[@id='InputName']"));
		Txt.sendKeys("Balakannan");
	    WebElement Text = driver.findElement(By.xpath("//input[@id='InputEmail1']"));
	    Text.sendKeys("Balakannan21@gmail.com");
	    WebElement Ent = driver.findElement(By.xpath("//input[@id='InputSubject']"));
	    Ent.sendKeys("9876543210");
	    WebElement Crse  = driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
	    Crse.click();
	    WebElement domain = driver.findElement(By.xpath("(//option[@value='Selenium'])[1]"));
	    domain.click();
	    WebElement slt = driver.findElement(By.xpath("(//option[@value='Select The Branch'])[1]"));
	    slt.click();
	    WebElement loc = driver.findElement(By.xpath("(//option[text()='Tambaram'])[1]"));
	    loc.click();
	    WebElement Timng = driver.findElement(By.xpath("(//option[@value='Planing To Start Training'])[1]"));
	    Timng.click();
	    WebElement slct = driver.findElement(By.xpath("(//option[@value='Immediately'])[1]"));
	    slct.click();
	    WebElement Msg = driver.findElement(By.xpath("(//textarea[@name='comments'])[1]"));
	    Msg.sendKeys("NeverGiveUp");
	    }

}
