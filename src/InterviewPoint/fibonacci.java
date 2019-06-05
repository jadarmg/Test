package InterviewPoint;

import java.util.Scanner;

public class fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n= sc.nextInt();
		int first=0,second=1;
		int maxval=n;
		System.out.println(first +","+second);
		while(first+second<maxval)
		{
			n=first+second;
			System.out.println(n );
			first=second;
			second=n;
		}

	}

}
