package Crmpro123;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Crmpro_loginTest {
	public WebDriver driver;
  @Test
  public void crmpro_login() throws Exception {
	  driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("gsudeer");
	  driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("DLFAP216@");
	  driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
	 // Thread.sleep(3000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.crmpro.com/index.html");
	  
	
	  
  }

}
