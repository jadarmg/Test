package Pattrens;

import java.util.Scanner;

public class fibnocii 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter a range");
		
		int first=0;
		int sec=1;
		int last=0;
		
		int x=sc.nextInt();
		
		
		System.out.print(first +","+ sec + ",");
		String temp="";
		for(int i=0;i<=x;i++)
		{
		last=first+sec;
		first=sec;
		sec=last;
		temp=temp+last+",";
		}
		System.out.print(temp);

	}

}
