package Collections;

import java.util.Comparator;

public class compcomparator implements Comparator
{
   public int compare(Object obj1,Object obj2)
   {
	   Employee e1=(Employee)obj1;
	   Employee e2=(Employee)obj2;
	   String a1=e1.toString();
	   String a2=e2.toString();
	   
	   return a1.compareTo(a2);
   }
}
