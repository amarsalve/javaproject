package Constructor;

public class Sample6 extends Demo6 {
public void m1()
{
	System.out.println("m1 Sample6 method");
}
public void m2()
{
	System.out.println("m2 Sample6 method");
}
public static void m3()
{
	System.out.println("m3 Sample6 method");
}
public static void m4()
{
	System.out.println("m4 Sample6 method ");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo6 obj=new Sample6();
obj.m1();
obj.m2();
obj.m3();
obj.m4();
	}

}
