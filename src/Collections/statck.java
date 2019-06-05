package Collections;

import java.util.ListIterator;
import java.util.Stack;

public class statck 
{

	public static void main(String[] args) 
	{
		Stack s=new Stack();  				// Stack works on LIFO Last in first out concept
		System.out.println(s.capacity());      //Stack is child class of vector its initial capacity is 10
		s.push("A");               // Here we have following methods
		s.push("B");               //Push,pop,peek,search
		s.push("z");               //push---add element to the stack
		                           //pop----removes last element
		//s.pop();     				//peek---without removal only it will displays
									//search()---gives offset i.e postion
		System.out.println(s);
		
		s.peek();
		
		System.out.println(s);
		System.out.println(s.indexOf("C"));
		System.out.println(s.search("C"));
		System.out.println(s.search("A"));
		
	
		
		
		
	}

}
