package Crmpro123;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class searchTest extends Crmpro_loginTest {
  @Test
  public void f() throws Exception {
	  Thread.sleep(3000);
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//input[@value='Quick Search']")).sendKeys("1");
	  new Select(driver.findElement(By.xpath("//select[@name='search_target']"))).selectByVisibleText("CRM");
	  driver.findElement(By.xpath("//input[@type='image']")).click();
  }
}
