package mvn_project_;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser

 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Code_sel {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


				
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		System.out.println(driver.getTitle()) ;
		
		String title = driver.getTitle();
		String Exp_title= "OraneHRM";
		
		if (title.equals(Exp_title) ) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
		
		
		driver.close();
		
	
		
		
		

	}

}
