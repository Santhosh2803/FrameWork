package org.omg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\Worked Files\\SeleniumDay12\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("email"));
		
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.SHIFT).sendKeys(element, "Welcome").keyUp(Keys.SHIFT).perform();
		
}
}