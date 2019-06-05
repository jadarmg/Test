package Collections;

import java.util.Comparator;

public class Mycomparator implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			
			/*if(i1.i2)
				return 1;
			else if(i1>i2)
				return -1;
			else
				return 0*/;
				
				return i2.compareTo(i1);
			
			   //i1.comapareTo(i2);  natural sorting order 
						//-i1.comapareTo(i2); // Customized sorting order
						//i2.comapareTo(i1);  //Customized sorting order
						//-i2.comapareTo(i1);default sorting order
						//return 0-----1st element  will get inserted
						//return 1----elements will display in insertion order
						// return -1----->elements will display in reversee insertion order
	}

}

