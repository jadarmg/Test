package Collections;

import java.util.LinkedList;

public class linkedlist2 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList();
		ll.add("Netra");
		ll.add("muddu");
		ll.add("Jaanu");
		
		ll.addFirst("Appi");
		
		System.out.println(ll.get(0));
		
		ll.set(0, "Kempi");
		System.out.println(ll);
		ll.addFirst("Appi");
		System.out.println(ll);
		ll.addLast("NetraMalatesh");
		System.out.println(ll);
		ll.set(4, "Kempavva");
		System.out.println(ll);
		ll.add(4, "rasgulla");
		System.out.println(ll);
		
		//Linked list also list it is used whenever there is insertion and deletion operation is required
		//The worst selection related to linked list is retriveable
		//Linked list implements serializable and clonable interface i.e marker interface
		

	}

}
