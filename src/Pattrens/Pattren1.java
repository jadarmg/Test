package Pattrens;

import java.util.Scanner;

public class Pattren1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int x=sc.nextInt();
		
		for(int i=x;i>=1;i--)
		{
			for (int j=i;j<=i-1;j++)
			{
				System.out.print("");
			}
			for(int j=i;j<=x;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
