package Collections;

import java.util.Vector;

public class vector2 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();    //Default value of vector constructor is 10. if we want to add one element 
		System.out.println(v.capacity()); // also its size will be doubled
		
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		System.out.println(v.capacity());   // Every time when we try to add element its size will be doubled
                                            // to avoid this we have other constructors to achive this
		Vector v1=new Vector(11); 
		for(int i=0;i<=10;i++)
		{
			v1.addElement(i);
		}
		
		v1.addElement("AA");
		System.out.println(v1);
		
		System.out.println(v1.capacity());  
		
		Vector v2=new Vector(10,5);
		System.out.println(v2.capacity());
		 
		for(int i=1;i<=10;i++)
		{
			v2.addElement(i);
		}
		
		//v2.addElement("BB");
		
		System.out.println(v2);
		System.out.println(v2.capacity());
		
		
		
		
	}

}
