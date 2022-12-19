package Testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test8 {
@Test
	public void setUp()
	{
	Assert.assertEquals("setup","setup");
	}
@Test(dependsOnMethods= {"setUp"})
public void loginfunctionality()
{
	Assert.assertEquals("login","login");
}
@Test(dependsOnMethods={"loginfunctionality"})
public void validateHomePage()
{
	Assert.assertEquals("actuallogo", "actuallogo");
}
@Test(dependsOnMethods={"loginfunctionality"})
public void validateUseronPIM()
{
	String actualUrl="https://orangehrmllive.com";
	Assert.assertEquals(actualUrl.contains("pim"),"true");

}
	
}

