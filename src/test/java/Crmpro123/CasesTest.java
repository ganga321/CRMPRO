package Crmpro123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CasesTest extends Crmpro_loginTest {
  @Test(priority=1)
  public void f1() throws Exception {
	  Thread.sleep(3000);
	  driver.switchTo().frame("mainpanel");
	  
	  driver.findElement(By.xpath("//a[@title='Cases']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='cs_keyword']")).sendKeys("123456");
	  driver.findElement(By.xpath("//input[@name='cs_extended']")).sendKeys("abc");
	  new Select(driver.findElement(By.xpath("//select[@name='cs_closed']"))).selectByVisibleText("Open");
	  new Select(driver.findElement(By.xpath("//select[@name='cs_status']"))).selectByVisibleText("Enquiring");
	  new Select(driver.findElement(By.xpath("//select[@name='cs_type']"))).selectByVisibleText("Complaint");
	  new Select(driver.findElement(By.xpath("//select[@name='cs_priority']"))).selectByVisibleText("Normal");
	  driver.findElement(By.xpath("//input[@name='cs_notes']")).sendKeys("pepsi customer");
	  driver.findElement(By.xpath("//input[@name='cs_company_name']")).sendKeys("wexos");
	  driver.findElement(By.xpath("//input[@name='tag']")).sendKeys("123");
	  new Select(driver.findElement(By.xpath("//select[@name='cs_deadline_operator']"))).selectByVisibleText("Before");
	  Thread.sleep(2000);
	  //driver.findElement(By.xpath("//img[@id='f_trigger_c_cs_deadline']")).click();
	  /*//driver.findElement(By.xpath("(//div[text()='›'])[15]")).click();
	  new Select(driver.findElement(By.xpath("//select[@name='cs_by_assigned']"))).selectByVisibleText("WEXOS INFORMATICA");
	  new Select(driver.findElement(By.xpath("//select[@name='by_user']"))).selectByVisibleText("WEXOS INFORMATICA");
	  new Select(driver.findElement(By.xpath("//select[@name='view_id']"))).selectByVisibleText("Default view");*/
	  new Select(driver.findElement(By.xpath("//select[@name='cs_saved_search_id']"))).selectByVisibleText("wexos123");
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
	  
  }
}
