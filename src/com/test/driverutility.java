package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverutility {
	public static WebDriver getDriver(String browser)
	  {
		  if(browser.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\chromedriver.exe");
			  return new ChromeDriver();
			  
		  }
		  else if(browser.equals("ie"))
		  {
			  System.setProperty("webdriver.ie.driver","C:\\Users\\training_b6B.01.16\\Desktop\\browser_drivers\\IEDriverServer.exe");
			  return new InternetExplorerDriver();
			  
		  }
		  else
		  {
			  return null;
		  }
	  }
}
