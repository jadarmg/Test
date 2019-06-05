package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class list1 
{
  public static void ls()
  {
	  ArrayList lst=new ArrayList();//List is a child interface of collection.Represntaion of group of ind object as a   
		lst.add(10);             //single entity where duplicates are allowed and preserve insertion order is called list.
		lst.add(10);
		lst.add("Hi");
		lst.add(true);
		lst.add(new String("Bangalore"));
		lst.add(new String("Bangalore"));
		lst.add(5, "ahh");
		int s = lst.indexOf("Hi");
		System.out.println("Index of Hi in the list " + s);
		List lst1=new ArrayList();
		lst1.add(20);
		lst1.add("bye");
		System.out.println("Adding one list to another list");
		lst.addAll(lst1);
		lst.addAll(1, lst1);
		lst.retainAll(lst1);
		//lst.clear();

		System.out.println(("Size of array list " + lst.size()));
		lst.contains(11);
		for(Object a:lst)
		{
			String a1 = a.toString();
			System.out.println(a1);
		}
		
		ListIterator ls = lst.listIterator();
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}
		System.out.println("----------Printing list in reverse order-------------");
		
		while(ls.hasPrevious())
		{
			System.out.println(ls.previous());
		}
  }
	public static void main(String[] args) 
	{
		list1.ls();

	}
	
}
