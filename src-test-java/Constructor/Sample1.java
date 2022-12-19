package Constructor;

public class Sample1 extends Demo2 {
public Sample1()
{
	System.out.println("Sample1 0 args cons");
}
public Sample1(int a)
{
	System.out.println("Sample1 1 args cons"+a);
}
public Sample1(String b)
{
	System.out.println("Sample1 1 String args cons"+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj=new Sample1("100");
	}

}
