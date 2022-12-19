package firstproject;

public class Global1 {
//static globale variable
	static String c="selenium";
	//non static globle variable
	String d="testing";
	public static void m1()
	{
		int a=100;
		System.out.println(a);
		System.out.println(c);
		Global1 obj=new Global1();
		System.out.println(obj.d);
	}
	public void m2()
	{
		int b=200;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(c);
Global1 obj=new Global1();
System.out.println(obj.d);
Global1.m1();
obj.m2();
	}
}
	


