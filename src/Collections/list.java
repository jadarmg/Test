package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class list 
{

	public static void main(String[] args) 
	{
		List lst=new ArrayList();   
		lst.add(10);
		lst.add(10);
		lst.add("Hi");
		lst.add(true);
		
		lst.add(new String("Bangalore"));
		lst.add(new String("Bangalore"));
		System.out.println(lst);
		ListIterator Itr = lst.listIterator();
		while(Itr.hasNext())
		{
			System.out.println(Itr.next());
		}
		System.out.println("-------------Printing list in reverse order------------");
		while(Itr.hasPrevious())
		{
			System.out.println(Itr.previous());
		}

	}

}
