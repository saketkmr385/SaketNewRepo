package MavenCICD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumJenkinsIntegration {
	
	@Test
	public void SeleniumJenkinsIntegration1()
	{
		
		 
		System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Amazon");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"vn1s0p1c0\"]")).click();
		
		
		
		
		
		
	}

}
