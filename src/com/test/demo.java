package com.test;

import org.testng.annotations.Test;

public class demo {
  @Test
  public void f() {
	  System.out.println("in new method");
  }
  
  @Test(priority=3)
  public void register() {
	  System.out.println("register page");
  }
  
  @Test(priority=2)
  public void login() {
	  System.out.println("login page");
  }
  
  @Test(priority=1,enabled=false)
  public void logout() {
	  System.out.println("logout page");
  }
}
