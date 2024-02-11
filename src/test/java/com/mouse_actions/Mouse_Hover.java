package com.mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/results?search_query=full+stack+tester+roadmap");
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//div[@id='start']//button[@id='button']//div")).click();
		
	    driver.findElement(By.id("id attribute is not available for this element")).click();
		
		//WebElement mix = driver.findElement(By.xpath(""));
		
		
		//act.moveToElement(home).click().build().perform();
		
		

	}

}
