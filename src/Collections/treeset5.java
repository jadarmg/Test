package Collections;

import java.util.ArrayList;
import java.util.TreeSet;

import Java_practice.Apple;

public class treeset5 
{
	public static void main(String[] args) 
		
	{
		TreeSet t=new TreeSet(new Compartor());
		t.add(new StringBuffer("a"));// String Buffer does not implements comparable interface
		t.add(new StringBuffer("A"));//Hence getting ClassCastException
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("Y"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("D"));
		t.add(new StringBuffer("C"));
		
		System.out.println(t);
		

	}

}
