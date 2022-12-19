package Testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test9 {
@Test
public void setUp()
{
	Assert.assertEquals("setup", "setup");
}
@Test(priority=2)
public void loginfunctionality()
{
Assert.assertEquals("login", "login");
}
@Test(priority=3)
public void validdatapage()
{
	Assert.assertEquals("pradip", "pradip");
}
@Test(priority=1)
public void belwandibudruk()
{
	Assert.assertEquals("lalu", "lalu");
}
@Test(priority=1)
public void punepimprichinchwd()
{
String actualUrl="https://opensourcedemo.oranghrmlive.com/web/index.php/pim/viewEmploylist";
Assert.assertEquals(actualUrl.contains("pim"),"true");
}
@Test(priority=6)
public void moredtailinjava()
{
	
}
@Test(priority=7)
public void ahamadnagar()
{
	
}
@Test
public void distpune()
{

}

}

