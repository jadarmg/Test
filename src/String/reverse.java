package String;

import java.util.Scanner;

public class reverse 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed");
		String a=sc.nextLine();
		
		char[] a1 = a.toCharArray();
		
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.print(a1[i]);
		}
		

	}

}
