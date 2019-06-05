package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class treeset4 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new Mycomparator1());
		t.add("Z");
		t.add("A");
		t.add("C");
		t.add("B");
		t.add("Y");
		t.add("z");
		
		System.out.println(t);

	}

}

/*public class Mycomparator1 implements Comparator
{
      public int compare(Object obj1,Object obj2)
      {
    	  String s1=obj1.toString();
    	  String s2=obj2.toString();
    	  
    	  return s2.compareTo(s1);    returns o/p in descending order
    	   return s1.compareTo(s2); 	returns o/p in ascending order
    	   retrun 0;       will give 1st inserted element
    	   return 1		   will give o/p as per insertion oder
    	   return -1       will give o/p as reverse insertion order
    			   
    	  
      }*/
