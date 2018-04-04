package Crmpro123;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShoefullformTest extends Crmpro_loginTest {
  @Test
  public void f() throws Exception {
	  Thread.sleep(3000);
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[@title='Cases']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@value='Show Full Form']")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("123456");
	  driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("123456");
	  driver.findElement(By.cssSelector("input.button")).click();
	  
  }
}
