package Testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
@BeforeClass
public void beforeclass()
{
	System.out.println("Before class");
	
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("Before method");
}
@Test(priority=1)
public void login()
{
	System.out.println("Test case1");
}
@Test(priority=2)
public void homepage()
{
	System.out.println("Test case2");
}
@Test(priority=3)
public void contactpage()
{
	System.out.println("Test case3");
}
@AfterMethod
public void aftermethod()
{
System.out.println("After method");
System.out.println("----------------------");
}
@AfterClass
public void Afterclass()
{
System.out.println("After class");
}
}
