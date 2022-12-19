package firstproject;

public class Nonstatic5 {
public int abc(int a,int b,int c)
{
	if((a<b)&&(a<c))
	{
		return a;
	}
	else if(b<c)
	{
		return b;
	}
	else {
		return c;
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main methiod is started");
Nonstatic5 obj=new Nonstatic5();
int d=obj.abc(70, 300, 40);
System.out.println(d);
System.out.println("main method is closed");
	}

}
