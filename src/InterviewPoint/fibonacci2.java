package InterviewPoint;

import java.util.Scanner;

public class fibonacci2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to check fibonacci");
		int n =sc.nextInt();
		int first=0,Second=1;
		int maxval=n;
		System.out.println(first +","+ Second);
		
		while(first+Second<maxval)
		{  
			n=first+Second;
			System.out.println(n);
			first=Second;
			Second=n;
		}
	}

}
