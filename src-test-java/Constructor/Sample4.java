package Constructor;

public class Sample4 extends Demo4 {
String a="cucumber";
public void m1()
{
	String a="jenkins";
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo4 obj=new Sample4();
obj.m1();
	}

}
