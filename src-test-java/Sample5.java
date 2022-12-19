
public class Sample5 extends Demo5{
public void m1 ()
{
	System.out.println("m1 sample5 method");
}
public void m2()
{
	System.out.println("m2 sample5 method");
}
public void m3()
{
	super.m1();
	System.out.println("m3 sample5 method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample5 obj=new Sample5();
obj.m3();
	}

}
