package Java_practice;

public class logicoperator 
{

	public static void main(String[] args) 
	{
		boolean a=true;
		boolean b=false;
		
		System.out.println(a | b);
		System.out.println(a || b);
		System.out.println(a & b);
		System.out.println(a && b);
		System.out.println("-----------------------------");
		int a1=10,b1=10,c=20;
		
		System.out.println(a1<b1 || a1<=b1);
		System.out.println(a1<=b1 && a1<b1);
		
		System.out.println("Multiplication of " +a+ " and " +b+ " is " + (a&&b));

	}

}
