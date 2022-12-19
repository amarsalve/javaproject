package Constructor;

public class Sample7 extends Demo6 {
public void m1()
{
	System.out.println("m1 Sample7 method");
}
public void m2()
{
	this.m1();
	super.m2();
	System.out.println("m3 Sample7 method");
}
public static void m3()
{
	System.out.println("m3 Sample7 method");
}
public static void m4()
{
	System.out.println("m4 Sample7 method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo6 obj=new Sample7();
obj.m2();
	}

}
