package Java_practice;

import java.util.Scanner;

public class Pattrens3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			for (int j=0;j<=n;j++)
			{
				System.out.print(1+j);
			}
			
			System.out.println("");
			
		}
		

	}

}
