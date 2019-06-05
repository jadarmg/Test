package InterviewPoint;

import java.util.HashMap;
import java.util.Scanner;

public class NoOCC 
{
   public static void Occurnece()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the input to check occurence");
	   String str = sc.nextLine();
	   char[] input = str.toCharArray();
	   
	   HashMap<Character, Integer> c=new HashMap<Character, Integer>();
	   
	   for(char b:input)
	   {
		   if(c.containsKey(b))
		   {
			   c.put(b, c.get(b)+1);
		   }
		   else
		   {
			   c.put(b,1);
		   }
		   
		   
	   }
	   System.out.println("No of occurence is " +c);
   }
	public static void main(String[] args) 
	{
		Occurnece();

	}

}
