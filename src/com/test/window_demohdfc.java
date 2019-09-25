package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class window_demohdfc {
  @Test
  public void f() {
	  WebDriver driver=driverutility.getDriver("chrome");
	  String url="https://www.online.citibank.co.in/";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentwindow=it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  driver.findElement(By.xpath("//a[@class='visible-dektop overlay-login']")).click();
	  System.out.println("url of the page"+driver.getCurrentUrl());
	  driver.close();
	  driver.switchTo().window(parentwindow);
	  System.out.println("parent window title is "+driver.getTitle());
  }
}
