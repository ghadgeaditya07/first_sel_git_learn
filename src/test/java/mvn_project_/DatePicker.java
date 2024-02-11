package mvn_project_;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		
		//Approach 1
		
		driver.switchTo().frame(0);
//		
//		driver.findElement(By.id("datepicker")).sendKeys("10/25/2034");
		
		
		//Approach 2
		
		
		String month = "March";
		String year= "2030";
		String date = "25";
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			
		
		
		String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yer= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(mon.equals(month)&& yer.equals(year)){
			
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		
		List<WebElement> dat = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dates : dat) {
			
			if(dates.getText().equals(date)) {
			
			dates.click();
			break;
		}
		
		
		}
	}

}
