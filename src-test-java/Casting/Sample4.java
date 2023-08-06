package Casting;

public class Sample4 extends Demo4 {
public void d1()
{
	System.out.println("d1 method in Sample4 class");
}
public void d2()
{
	System.out.println("d2 method in Sample4 class");
}
public void s1()
{
	System.out.println("s1 method in Sample4 class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo4 obj=new Sample4();
//obj.d1();
//obj.d2();
Sample4 abc=(Sample4)obj;
abc.d1();
abc.d2();
abc.s1();
	}

}
