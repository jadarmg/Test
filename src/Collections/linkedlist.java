package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist 
{

	public static void main(String[] args) 
	{
		LinkedList<Object> ls=new LinkedList<>();
		ls.add("Hi");
		ls.add("Bye");
		ls.add(10);
		ls.add(true);
		ls.addFirst("Mala");
		ls.addLast("Tesh");
		ls.add(null);
		
		
		ls.addFirst("ne");
		ls.add(0, "tra");
		ls.set(0, "gm");
		ls.removeFirst();
		ls.removeLast();
		ListIterator<Object> itr = ls.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
