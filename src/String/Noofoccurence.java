package String;

import java.util.HashMap;

public class Noofoccurence 
{
	
	public static void occurence(String str)
	{
		char[] input = str.toCharArray();
		
		HashMap<Character,Integer> c=new HashMap<Character,Integer>();
		
		for(char b:input)
		{
			if(c.containsKey(b))
			{
				c.put(b,c.get(b)+1);
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
		occurence("I love you");

	}

}
