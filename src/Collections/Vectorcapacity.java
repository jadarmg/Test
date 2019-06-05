package Collections;

import java.util.Vector;

public class Vectorcapacity 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector(10,2);
		System.out.println(v.capacity());
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		
		System.out.println(v.capacity());
		
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.capacity());
		

	}

}
