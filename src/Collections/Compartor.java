package Collections;

import java.util.Comparator;

public class Compartor implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
    	String i1=obj1.toString();
    	String i2=obj2.toString();
    	return 1;
    	
    	//return i2.compareTo(i1);// Customized Sorting order
    }							//return i1.compareTo(i2)  Natural Soring order
								// return 0 only 1st elements will get inserted
    							// return 1 only  elements will displayed in  inserted order
    							//return -1 only  elements will displayed in  reverse inserted order
}
