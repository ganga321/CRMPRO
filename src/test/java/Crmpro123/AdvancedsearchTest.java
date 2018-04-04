package Crmpro123;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdvancedsearchTest extends Crmpro_loginTest {
  @Test(priority=1)
  public void f() throws Exception {
	  Thread.sleep(3000);
	  driver.switchTo().frame("mainpanel");
	  
	  driver.findElement(By.xpath("//a[@title='Cases']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='cs_keyword']")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
  }
}
