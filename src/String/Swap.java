package String;

import java.util.Scanner;

public class Swap 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a before swapping");
		int a=sc.nextInt();
		
		System.out.println("Enter value of b before swapping");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping value of a is " +a);
		System.out.println("After swapping value of b is " +b);

	}

}
