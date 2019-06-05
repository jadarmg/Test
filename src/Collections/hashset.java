package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class hashset 
{

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();     //Hashset is 1st underlying DS of Set.
        System.out.println(h.size());// Does not allows duplicates and insertion order is not preserved.
		h.add("A");                  //has 4 constructors of initial size of 16 and load factor is 0.75
		h.add("B");                  //HashSet h=new HashSet();
		h.add("C");					//HashSet h=new HashSet(int initial capacity);
		h.add("A");					//Suppose if we want to modify load factor from .75 to .9
		h.add(null);              // HashSet h=new HashSet(int initial capacity ,float loadcapacity);
		h.add(10);					//HashSet h=new HashSet(collection);
		//System.out.println(h);
		System.out.println(h.add("A"));
		Iterator itr = h.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
	
		
		

	}

}
