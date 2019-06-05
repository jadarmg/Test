package Java_practice;

import java.util.Scanner;

public class Condtional1 
{
 static int i;
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println(i);
		
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter your Marks");
		int marks=sc.nextInt();
		
		System.out.println("Enter your Subject");
		String Subject=sc.next();
		
		String result=marks>=50?"Pass":"Fail";
		
		System.out.println("Hello " + name  + " your marks is " + marks +" in Subject " +Subject+ " and your result is " + result);

	}

}
