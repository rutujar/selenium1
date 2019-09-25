package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo1 {
	
  @Test
  public void testdemo() {
	  Assert.assertTrue(20>18);
  }
  
  @Test
  public void testdemo1() {
	  Assert.assertTrue("hello".startsWith("h"));
  }
  
  @Test
  public void testdemo3() {
	  Assert.assertFalse("hello".equals("hi"));
  }
  
  @Test
  public void testdemo2() {
	  int actual=10;
	  int expected=10;
	  Assert.assertEquals(actual, expected);
  }
  
  @Test
  public void testdemo4() {
	  String actual="rutuja";
	  String expected="rutu";
	  Assert.assertEquals(actual, expected);
  }
  
  @Test
  public void testdemo5() {
	  Object ob1=null;
	  Assert.assertNull(ob1);
  }
  
  @Test
  public void testdemo6() {
	  Object ob2=new Object();
	  Assert.assertNull(ob2);
  }
  
  @Test
  public void testdemo7() {
	  Object ob1=null;
	  Object ob2=new Object();
	  Assert.assertSame(ob1,ob2);
  }
  
  @Test
  public void testdemo8() {
	  Object ob1=new Object();
	  Object ob2=new Object();
	  Assert.assertSame(ob1,ob2);
  }
  
  @Test
  public void testdemo9() {
	  Assert.fail("failed");
  }
  
  @Test
  public void testdemo10() {
	  System.out.print("check");
	  Assert.assertEquals(4,5);
	  System.out.print("check2");
	  Assert.assertEquals("rutuja","rutu");
  }
  
  @Test
  public void testdemo11() {
	  SoftAssert as=new SoftAssert();
	  System.out.print("check");
	  as.assertEquals(5,5);
	  System.out.print("check2");
	  as.assertEquals("rutuja","rutu");
	  as.assertAll();
  }
  
  @Test
  public void testdemo12() {
	  Assert.assertEquals(4,5);
	  Assert.assertEquals("rutuja","rutu");
  }
}
