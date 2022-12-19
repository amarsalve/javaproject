package Testngpractice;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {
@BeforeMethod
public void setup()
{
System.out.println("Before method");
}
@Test
public void login()
{
	System.out.println("log in test cases");
}
@Test(priority=1)
public void homepage()
{
	System.out.println("Home page test case");
}
@Test(priority=2)
public void contactpage()
{
	System.out.println("contact page test case");
}
@AfterMethod
public void tearDown()
{
	System.out.println("AfterMethod");
}

	
	
}

