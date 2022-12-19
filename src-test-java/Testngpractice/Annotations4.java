package Testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations4 {
@BeforeClass
public void setUp()
{
	System.out.println("before class");
	}
@Test
public void testcase1()
{
	System.out.println("amar salve");
}
@Test
public void testcase2()
{
	System.out.println("vaishnavi salve");
}
@Test
public void testcase3()
{
	System.out.println("sagar salve");
}
@AfterClass
public void tearDown()
{
	System.out.println("After class");
}

}

