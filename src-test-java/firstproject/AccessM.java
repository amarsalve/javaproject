package firstproject;

public class AccessM {
private String a="Private Varible";
String b="Default Variable";
protected String c="Protected Variable";
public String d="Public Variable";
private void m1()
{
	System.out.println("Private Method");
}
void m2()
{
	System.out.println("Default Method");
}
protected void m3()
{
	System.out.println("Protected Method");
}
public void m4()
{
	System.out.println("Public Method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessM obj=new AccessM();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}

}
