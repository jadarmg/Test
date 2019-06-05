package InterviewPoint;

import java.util.HashMap;

public class NoOcc2 
{
     public static void NoOCC(String Str)
     {
    	 char[] input = Str.toCharArray();
    	 HashMap<Character,Integer> c=new  HashMap<Character,Integer>();
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
    	 
    	 System.out.println("No of Occurence is " + c);
     }
	public static void main(String[] args)
	{
		NoOCC("sahakaska");

	}

}
