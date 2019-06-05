package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class treeset3 
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new Mycomparator());
		t.add(30);
		t.add(5);
		t.add(20);
		t.add(30);
		t.add(20);
		t.add(1);
		
		/*t.add("M");  //we can compare strings too just we need to cast to String object
		t.add("B");
		t.add("N");
		t.add("A");
		t.add("Z");
		t.add("P");*/
		
		
		
		System.out.println(t);
	}
	
	
}
