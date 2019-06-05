package Collections;

import java.util.Set;
import java.util.TreeSet;

public class treeset 
{

	public static void main(String[] args) 
	{
		TreeSet s=new TreeSet();
		s.add(null);
		System.out.println(s);
		/*s.add("Hi");
		s.add("Hi");
		s.add("10");
		try
		{
			s.add(10);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		System.out.println("Size of tree set is " + s.size());

	}

}
