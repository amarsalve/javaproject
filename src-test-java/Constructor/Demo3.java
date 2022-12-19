package Constructor;

public class Demo3 {
int a=111;
public void m1()
{
	int a=222;
	System.out.println(a);//222
	System.out.println(this.a);//111
}
public static void main(String[]args) {
	Demo3 obj=new Demo3();
	obj.m1();
}

}
