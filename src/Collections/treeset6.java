package Collections;

import java.util.TreeSet;

//Program to sort object and String Buffer based on their length if length are same insert based on their alphabetical order
public class treeset6 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new Mycomparator2());
		t.add("AAA");
		t.add("A");
		t.add("XX");
		t.add("ABCD");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AC"));
		
		System.out.println(t);

	}

}
