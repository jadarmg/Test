package Collections;

import java.util.TreeSet;

public class treeset1 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		/*t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));*/
		//System.out.println(t);  // Class cast exception
	    System.out.println("A".compareTo("Z"));
	    System.out.println("Z".compareTo("A"));
	    System.out.println("A".compareTo("A"));
	   try
	   {
		   System.out.println("A".compareTo(null));
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	    
	    
	    t.add("A");//in default natural sorting order JVM internally calls compareTo() method i.e  "Z".compareto("A");-ve value Z comes after A
	    t.add("Z");
	    t.add("B");
	System.out.println(t); //[A,B,C]

	}

}
