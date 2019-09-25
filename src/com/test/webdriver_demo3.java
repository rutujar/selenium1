package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class webdriver_demo3 {
  @Test
  public void f() {
	  WebDriver driver=driverutility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("The title of web page is"+driver.getTitle());
	  driver.findElement(By.className("ico-login")).click();
	  driver.findElement(By.id("Email")).sendKeys("rutujarajesh23@gmail.com");
	  driver.findElement(By.name("Password")).sendKeys("rutu2471");
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
  }
  
}
