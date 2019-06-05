package MAP;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap 
{

	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		h.put("Malatesh", 100);
		h.put("mantu", 101);
		h.put("manti", 102);
		h.put("paanti", 103);
		h.put("jadar", 104);
		h.put("jaddu", 105);
		
		Map k1 = Collections.synchronizedMap(h);
		System.out.println(k1);
		
	System.out.println(h);//o/p {Malatesh=100, paanti=103, manti=102, mantu=101, jadar=104, jaddu=105}
	
	System.out.println(h.get("Malatesh"));
	System.out.println(h.containsKey("netra"));
		
		Set s = h.entrySet();//[Malatesh=100, paanti=103, manti=102, mantu=101, jadar=104, jaddu=105]
		
		Collection h1 = h.values();//[100, 103, 102, 101, 104, 105]
		System.out.println(h1);
		Set h2 = h.keySet();
		System.out.println(h2);//[Malatesh, paanti, manti, mantu, jadar, jaddu]
		h.put("Malatesh", 106);
		System.out.println(h);//{Malatesh=106, paanti=103, manti=102, mantu=101, jadar=104, jaddu=105}
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey() + "----------------" + m1.getValue());
			
			if(m1.getKey().equals("Malatesh"))
			{
				m1.setValue("400");
				System.out.println(m1);
				
				System.out.println(h);
			}
		}
		

	}

}
