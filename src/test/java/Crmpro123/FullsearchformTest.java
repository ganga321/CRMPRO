package Crmpro123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FullsearchformTest extends Crmpro_loginTest{
  @Test(priority=0)
  public void f() throws Exception {
	  Thread.sleep(3000);
	  driver.switchTo().frame("mainpanel");
	  Actions a=new Actions(driver);
	  WebElement str=driver.findElement(By.xpath("//a[@title='Cases']"));
	  a.moveToElement(str).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Full Search Form")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/input")).sendKeys("123456");
	  new Select(driver.findElement(By.xpath("//select[@name='cs_closed']"))).selectByVisibleText("Closed");
	  new Select(driver.findElement(By.xpath("//select[@name='cs_deadline_operator']"))).selectByVisibleText("Equal");
	 
	  Thread.sleep(3000);
	  while(true) {
	  try {
		  //driver.findElement(By.xpath("//img[@id='f_trigger_c_cs_created_at_from']")).click();
		  driver.findElement(By.xpath("//img[@id='f_trigger_c_cs_deadline']")).click();
		  driver.findElement(By.xpath("//div[text()='›']")).click();
		  driver.findElement(By.xpath("//td[text()='10']")).click();
		
	  break;
	  
	
	  }catch(Exception e) {
		 
		  
		  
	  }
	  }
	  
	//  
	  
	 // finally {
		  driver.findElement(By.xpath("//img[@id='f_trigger_c_cs_created_at_from']")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='»']")).click();
		  driver.findElement(By.xpath("(//td[text()='19'])[3]")).click();
		//  break;
		  
		
		  
	 // }
	  //driver.findElement(By.xpath("(//td[text()='12'])[14]")).click();*/
  }
}

