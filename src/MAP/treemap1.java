package MAP;

import java.util.TreeMap;
import java.util.TreeSet;

public class treemap1 
{

	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap(new comparator1());
		t.put("XXX", 1);
		t.put("AAA", 1);
		t.put("CCC", 1);
		t.put("BBB", 1);
		t.put("aaa", 1);
		
		System.out.println(t);

	}

}
