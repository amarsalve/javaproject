package Constructor;

public class Demo1 {
public Demo1()
{
	System.out.println("0 args cons");
}public Demo1(int a)
{
	System.out.println("1 int args cons"+a);
}
public Demo1(int a,int b)
{
	System.out.println("2 int args cons"+(a+b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method is started");
Demo1 obj=new Demo1(100,300);
	}

}
