package MAP;

import java.util.Comparator;

public class comparator implements Comparator
{
      public int compare(Object obj1,Object obj2)
      {
    	  Integer a=(Integer)obj1;
    	  Integer b=(Integer)obj2;
    	  
    	  return b.compareTo(a);
      }
}
