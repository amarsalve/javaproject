package Constructor;

public class Sample3 extends Demo3 {
int a=333;
public void m2()
{
	int a=444;
	System.out.println(a);//444
	System.out.println(this.a);//333
	System.out.println(super.a);//111
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj=new Sample3();
		obj.m2();
	}

}
