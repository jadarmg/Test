package String;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOccurence 
{
 
	public static void Occurence(String input)
	{ 
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the String");
		String input=sc.next();
	*/
		HashMap<Character, Integer> count=new HashMap<Character, Integer>();
		char[] input1 = input.toCharArray();
		
		for(char c:input1)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
				
			}
			else
			{
				count.put(c, 1);
			}
		}
                  System.out.println("No of occurence is" + count);
		
	}
	
	
	public static void main(String[] args)
	{
		//Occurence("Java J2EE Java JSP J2EE");
		Occurence("H");

	}

}
