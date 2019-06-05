package InterviewPoint;

import java.util.Scanner;

public class reverse1 
{

	public static void main(String[] args) 
	{
	    /*Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the String to be reversed");
		String input = sc.nextLine();
		char[] input1 = input.toCharArray();
		
		for(int i=input1.length-1;i>=0;i--)
		{
			System.out.print(input1[i]);
		}*/
		
		   
	       Scanner scan = new Scanner(System.in);

	       System.out.print("Enter a String : ");
	      String str1 = "INTERNATIONALBUSINESSMASHINE";
	      String str2 = str1.replaceAll("[aeiouAEIOU]", "0");
	       // adding AEIOU to capture Vowels in uppercase.
	       System.out.println("All Vowels Removed Successfully");

	       System.out.println(str2);
		
		
	      

	}

}
