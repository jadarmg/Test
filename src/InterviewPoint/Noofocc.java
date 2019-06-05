package InterviewPoint;

import java.util.HashMap;
import java.util.Scanner;

public class Noofocc 
{
 
	public static void noofocc(String a)
	{
		/*Scanner sc=new Scanner(System.in);
		   System.out.println("Enter String to check occurence");
		   String a=sc.nextLine();*/
		   String a1 = a.trim();
		   
		   System.out.println("Enterd input is " + a1);
		   
		   char[] input = a1.toCharArray();
		 
		   
		   HashMap<Character,Integer> c=new HashMap<Character,Integer>();
		   
		   for(char b:input)
		   {
		   if(c.containsKey(b))
		   {
			   c.put(b, c.get(b)+1);
		   }
		   else
		   {
			   c.put(b, 1);
		   }
		 }
		   
		   System.out.println("No  of occurence is " +c);

	}

	public static void main(String[] args) 
	{
		Noofocc.noofocc("   Hi");
    }
}