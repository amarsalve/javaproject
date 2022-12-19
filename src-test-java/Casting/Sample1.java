package Casting;

public class Sample1 extends Demo1 {
public static void s1()
{
	System.out.println("s1 method in Sample1 class");
}
public void s2()
{
	System.out.println("s2 method is Sample1 class");
}
public void d1()
{
	System.out.println("d1 method is Sample1 class");
}
public static void d3()
{
	System.out.println("d3 method in Sample1 class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo1 obj=new Sample1();
obj.d1();
obj.d2();
obj.d3();
obj.d4();
	}

}
