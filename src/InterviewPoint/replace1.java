package InterviewPoint;

import java.util.Scanner;

public class replace1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String s1 = sc.nextLine();
		System.out.println(s1.replaceAll("[aeiouAEIOU]", "?"));
		
		
		

	}

}
