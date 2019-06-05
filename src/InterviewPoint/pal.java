package InterviewPoint;

import java.util.Scanner;

public class pal 
{
	public static void Pal()
	{
		int first=0,secound=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to for fibonacci");
		int n=sc.nextInt();
		int maxval=n;
		
		System.out.println(n);
		System.out.println(maxval);
		
		System.out.println(first +","+secound);
		while(first+secound<n)
		{
			 n=first+secound;
			System.out.println(n);
			first=secound;
			secound=n;
		}
		
	}

	public static void main(String[] args) 
	{
	
		Pal();

	}

}
