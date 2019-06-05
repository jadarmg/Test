package Collections;

public class Employee implements Comparable
{
        String name;
        int empid;
     
        Employee(String name, int empid)
        {
        	this.name=name;
        	this.empid=empid;
        }
        
        public String toString()
        {
        	return name+ "------"  +empid;
        }
    
        public int compareTo(Object obj)
        {
			int eid1=this.empid;
			Employee e1=(Employee)obj;
			int eid2=e1.empid;
			if(eid1<eid2)
				return -1;
			else if(eid1>eid2)
				return +1;
			else
				return 0;
        	
        }
}
