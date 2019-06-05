package String;

import java.util.HashMap;
import java.util.Scanner;

public class Noofoccure 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check no of occurence");
		String a = sc.next();
		char[] input = a.toCharArray();
		
		HashMap<Character,Integer> b=new HashMap<Character,Integer>();
		
		for(char c:input)
		{
			if(b.containsKey(c))
			{
				b.put(c, b.get(c)+1);
			}
			
			else
			{
				b.put(c, 1);
			}
		}
		
		System.out.println("No of occurence is " + b);

	}

}
