package Collections;

import java.util.Comparator;

public class Mycomparator2 implements Comparator
{
       public int compare(Object obj1,Object obj2)
       {
    	   String i1=obj1.toString();
    	   String i2=obj2.toString();
    	   
    	   int a=i1.length();
    	   int b=i2.length();
    	   
    	   if(a<b)
    		   return -1;//if object of 1st length is  less than 2nd length then return -1
    	   else if(a>b)
    		   return +1;//if object of 1st length is  greater than 2nd length then return 1
    	   else
    		   return i1.compareTo(i2); //if length r equal then retrun based on Alphabetical order
    	   
    	   
       }
}
