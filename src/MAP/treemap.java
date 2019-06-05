package MAP;

import java.util.TreeMap;

public class treemap 
{

	public static void main(String[] args)
	{
		TreeMap t=new TreeMap(new comparator());
		t.put(105, "a");
		t.put(100, "b");
		t.put(101, "c");
		t.put(106, "d");
		t.put(104, "e");
		t.put(110, "f");
		t.put(200, "g");
		t.put(201, "h");
	//	t.put("abc", "j");  //java.lang.ClassCastException  Heterogenous objects are not allowed
	//	t.put(null, "l");
		
		System.out.println(t); //java.lang.NullPointerException if we are try to insert

	}

}
