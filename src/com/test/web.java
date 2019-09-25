package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class web {
	WebDriver driver=null;
  @Test
  public void Browserlaunch() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  String url="http://www.google.com";
	  driver.get(url);
  }
  
  @Test
  public void Browserielaunch() {
	  System.setProperty("webdriver.ie.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
	  String url="http://www.google.com";
	  driver.get(url);
  }
}
