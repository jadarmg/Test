package Pattrens;

import java.util.Scanner;

public class prime 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int n=sc.nextInt();
		int Counter=0;
		
		for(int i=2;i<=n/2;)
		{
			if(n % 2==0)
			{
				Counter++;
				//if(Counter==1)
				System.out.println("Enterd no is not prime");
			}
			break;
			
		}       if(Counter==0)
				System.out.println("Entered no is prime");
			}
		}
	


