package Java_practice;

import java.util.Scanner;

public class addition1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd no");
		int b=sc.nextInt();
		
		int total=addition1.add(a, b);
		System.out.println(total);

	}
	
	public static int add(int a,int b)
	{ 
		int total = a+b;
		
		return total;
	}

}
