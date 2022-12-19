package Testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Test7 {
	@Test
	public void xyz()
	{
	Assert.assertEquals(12,13);
	}
	@Test(dependsOnMethods= {"xyz"})
	public void a()
	{
		System.out.println("a method");
	}
	@Test(dependsOnMethods={"a"})
	public void pqr()
	{
		System.out.println("pqr method");
	
	
	}
	}


