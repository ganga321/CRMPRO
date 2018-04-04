package Crmpro123;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewcasesTest extends Crmpro_loginTest{
  @Test
  public void f() throws Exception {
	  Thread.sleep(3000);
	  driver.switchTo().frame("mainpanel");
	  Actions a=new Actions(driver);
	  WebElement str=driver.findElement(By.xpath("//a[@title='Cases']"));
	  a.moveToElement(str).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("New Case")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='title']")).sendKeys("ganga");
      new Select(driver.findElement(By.xpath("	//select[@name='status']"))).selectByVisibleText("Enquiring");
      driver.findElement(By.xpath("(//input[@class='button_help'])[1]")).click();
      
      Set<String>e=driver.getWindowHandles();
      Iterator<String>e1=e.iterator();
      String parentid=e1.next();
      String childid=e1.next();
      driver.switchTo().window(childid);
      Thread.sleep(3000);
      driver.close();
     Thread.sleep(3000);
      driver.switchTo().window(parentid);

      driver.switchTo().frame("mainpanel");
      driver.findElement(By.xpath("(//input[@name='closed'])[2]")).click();
  	 driver.findElement(By.xpath(".//*[@id='tags']")).sendKeys("fg");
  	 driver.findElement(By.xpath("(//input[@class='button_help'])[2]")).click();
  	 Set<String>x=driver.getWindowHandles();
  	 Iterator<String>x1=x.iterator();
  	 String parentid1=x1.next();
  	 String childid1=x1.next();
  	 driver.switchTo().window(childid1);  
  	 Thread.sleep(2000);
  	 driver.close();
  	 Thread.sleep(1000);
  	 driver.switchTo().window(parentid);
  	 driver.switchTo().frame("mainpanel");
  	driver.findElement(By.xpath("(//input[@class='button_help'])[3]")).click();
  	Set<String>b=driver.getWindowHandles();
  	Iterator<String>b1=b.iterator();
  	String parentid2=b1.next();
  	String childid2=b1.next();
  	driver.switchTo().window(childid2);
  	Thread.sleep(1000);
  	driver.close();
  	Thread.sleep(1000);
  	driver.switchTo().window(parentid);
  	driver.switchTo().frame("mainpanel");
  	driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("hiiiiiii");
    driver.findElement(By.xpath("(//input[@class='button_help'])[4]")).click();  
      Set<String>c=driver.getWindowHandles();
      Iterator<String>c1=c.iterator();
      String parentid3=c1.next();
      String childid3=c1.next();
      driver.switchTo().window(childid3);
      Thread.sleep(1000);
      driver.close();
      Thread.sleep(1000);
      driver.switchTo().window(parentid3);
      driver.switchTo().frame("mainpanel");
      //driver.findElement(By.xpath("//input[@name='contact_lookup']")).sendKeys("raniiiii");
      driver.findElement(By.xpath("(//input[@value='Lookup'])[1]")).click();
      Set<String>d=driver.getWindowHandles();
      Iterator<String>d1=d.iterator();
      String parentid4=d1.next();
      String childid4=d1.next();
      driver.switchTo().window(childid4);
      Thread.sleep(2000);
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@id='search']")).sendKeys("gangaaa");
      driver.findElement(By.xpath("//input[@value='Search']")).click();
      driver.close();
      driver.switchTo().window(parentid4);
      driver.switchTo().frame("mainpanel");
      driver.findElement(By.xpath("(//input[@value='Lookup'])[2]")).click();
      
      
    Set<String>f=driver.getWindowHandles();
     Iterator<String>f1=f.iterator();
      String parentid5=f1.next();
      String childid5=f1.next();
     driver.switchTo().window(childid5);
     Thread.sleep(2000);
     driver.manage().window().maximize();
    Thread.sleep(1000);driver.findElement(By.xpath("//input[@id='search']")).sendKeys("wexos");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
     driver.close();
     driver.switchTo().window(parentid5);
    driver.switchTo().frame("mainpanel");
    new Select(driver.findElement(By.xpath("//select[@name='node_id']"))).selectByVisibleText(" Root (1)");
    driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click();
      
      
      
      

  }
}
