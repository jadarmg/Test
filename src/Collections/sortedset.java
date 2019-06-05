package Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset 
{

	public static void main(String[] args) 
	{
		SortedSet s=new TreeSet();
		s.add(100);    //Sorted Set is child interface of set
		s.add(101);   //Whenever we need to represent a group of object according to some sorting techniques is called Sorted Set
		s.add(102); // It has 6 spl element
		s.add(105);  //s.first()
		s.add(103);  //s.last()
		s.add(106);  //s.headSet()
		s.add(106);  //s.tailSet()
		s.add(107);  //s.comparator() and s.subSet(object1, object2)
		System.out.println("Size of TreeSet " + s.size());
		
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(104));
		System.out.println(s.tailSet(100));
		System.out.println(s.comparator());
		System.out.println(s.subSet(100, 105));

	}

}
