package firstproject;

public class Nonstatic6 {
//non static method with int return type and int array argument.
	public int abc(int a[])
	{
		int max=a[0];
		for(int b:a)
		{
			if(max<b)
			{
				max=b;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method is started");
Nonstatic6 obj=new Nonstatic6();
int c=new Nonstatic6().abc(new int[]{100,2000,4521,16443,5560});
System.out.println(c);
System.out.println("main method is closed");
	}

}
