package Testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test10 {
@Test
public void login()
{
	

	Assert.assertEquals("home", "home");
}
@Test(dependsOnMethods= {"login"},alwaysRun=true)
public void homepage()
{
	Assert.assertEquals("home","home");
}


}


