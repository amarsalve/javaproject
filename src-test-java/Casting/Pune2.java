package Casting;

public class Pune2 implements Sample2 {
@Override
public void d1()
{
	System.out.println("D1 method");
}
@Override
public void d2()
{
	System.out.println("D2 method");
}
@Override
public void d3()
{
	System.out.println("D3 method");
}
@Override
public void s1()
{
System.out.println("s1 method");	
}
@Override
public void s2()
{
	System.out.println("s2 method");
}
public void p1()
{
	System.out.println("p1 method");
}
	public static void main(String[] args) {
		// TODO Auto-genera
		Sample2 obj=new Pune2();
obj.d1();
obj.d2();
obj.d3();
obj.s1();
obj.s2();
		


	}

}
