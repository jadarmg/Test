package Collections;

public class Student 
{
	String n;
	int a;
	
	Student(String n,int a)
	{
		this.n=n;
		this.a=a;
		System.out.println("n= " + n);
		System.out.println("a=" +a);
	}
     
	public static void main(String[] args) 
	{
		/*String[] s=new String[20];
		s[0]="";*/
		Student s1[]=new Student[2];
		s1[0]=new Student("Ma",5);
		s1[1]=new Student("la",7);
		/*//System.out.println(s1[0].n);
		for(int i=0;i<s.length-1;i++)
		{
			System.out.println(s1[i].n);
		}*/
		
		
		
        

	}

}
