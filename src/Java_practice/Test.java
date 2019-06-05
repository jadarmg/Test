package Java_practice;

public class Test 
{
	String name;
	
	Test(String name)
	{
		this.name=name;
	}
  
	public static void main(String[] args) 
	{
		Test t1=new Test("kalli");
		//t1.display();
		System.out.println(t1.name);
	}

 /*void display() 
 {
	 System.out.println(""+name);
		// TODO Auto-generated method stub
		
	}*/

}
