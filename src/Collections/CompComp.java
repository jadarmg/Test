package Collections;

import java.util.TreeSet;

public class CompComp 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee("nags",100);
		Employee e2=new Employee("ciru",105);
		Employee e3=new Employee("suppi",101);
		Employee e4=new Employee("mala",10);
		Employee e5=new Employee("neti",200);
		Employee e6=new Employee("muddi",300);
		
		TreeSet t=new TreeSet(new compcomparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		System.out.println(t);

	}

}
