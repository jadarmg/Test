package Collections;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class linkedhashset
{

	public static void main(String[] args) 
	{
		LinkedHashSet hs=new  LinkedHashSet();    //Linked hash set is a child interface of set
		hs.add("A");   // Duplicates are not allowed and insertion order is preserved
		hs.add("A"); // Linked hash set is used in cached based application. To maintain speed of primary and Secoudary
		hs.add(10);    // memory
		hs.add("B");
		hs.add(null);
		hs.add("C");
		hs.add("a");
		
		System.out.println(hs.size());
		
		System.out.println(hs);

	}

}
