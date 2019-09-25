package com.test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class NEW {
  @Test
  public void f() {
	  WebDriver driver=driverutility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("The title of web page is"+driver.getTitle());
  }
}
