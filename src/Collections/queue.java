package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queue 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue(); //extends Abstract clss
		pq.add("Mala");// internally sorted queue
		pq.add("A");   // only homogenous elements should add if not wil get classCastException
		pq.add("Netra"); //Null insertion is not possible
		pq.add("Soni");//since it is not indexed we cannot user simple for loop
	//	pq.add(10);     //
	//	pq.add(null);
		
	//	System.out.println(pq);
		
		Iterator itr = pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
