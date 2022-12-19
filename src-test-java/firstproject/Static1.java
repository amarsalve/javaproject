package firstproject;

public class Static1 {
public static void m1()
{
	System.out.println("m1 static method");//234
	
}
public static void m2()
{
m1();

Static1.m1();
Static1 obj=new Static1();
obj.m1();
{
System.out.println("m2 static method");//5
}
}
public void s1()
{
	m2();
	System.out.println("s1 non static method");//
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method is started");//
Static1 obj=new Static1();
obj.s1(
		);

System.out.println();

System.out.println("main method is ended");//7
	}

}
