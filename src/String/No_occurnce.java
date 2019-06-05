package String;

import java.util.HashMap;

public class No_occurnce 
{
    public void ChecknoOcc(String str)
    {
    	char[] input = str.toCharArray();
    	System.out.println(input);
    	
    	HashMap<Character, Integer> c=new HashMap<Character, Integer>();
    	
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
    	
    	System.out.println("No of occurnece " + c);
    }
	public static void main(String[] args) 
	{
		No_occurnce n=new No_occurnce();
		n.ChecknoOcc("Malaatehsa");
        n.ChecknoOcc("I love you");
	}

}
