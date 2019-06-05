package String;

import java.util.Scanner;

public class reverse1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String needs to be reverse");
		String a = sc.next();
		char[] input = a.toCharArray();
		System.out.println(input);
		
		for(int i=input.length-1;i>=0;i--)
		{
			System.out.print( input[i]);
		}
		

	}

}
