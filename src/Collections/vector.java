package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vector 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.addElement(10);
		v.addElement("Hi");
		v.addElement(new String("Bangalore"));
		System.out.println(v.elementAt(0));
		
		System.out.println(v);
		
		v.removeElementAt(1);
		
		System.out.println("After removing element " + v);
		
		List ls=new ArrayList();
		ls.add("Bye");
		ls.add(20);
		ls.add("Super");
		
		v.addAll(ls);
		
		System.out.println("After adding list to vector " + v);
		
		System.out.println(v.get(0));
	}

}
