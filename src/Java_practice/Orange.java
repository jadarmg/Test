package Java_practice;

public class Orange 
{

	public static void main(String[] args) 
	{
		
		/*Orange o3;
		o3=new Orange();
		System.out.println(o3 instanceof Orange);
		Orange o2=new Orange();
		System.out.println(o2 instanceof Orange);
		Orange o1=new Orange();
		System.out.println(o1);
		
		Orange o2=new Orange();
		System.out.println(o2);
		
		System.out.println(o1==o2);
		System.out.println(o1!=o2);
		
		o1=o2;
		System.out.println(o1==o2);
      int a=10,b=20,c=30;
		System.out.println(a++);//whenever we are performing post increment its value will not increase unless it is used for next timr
	
		System.out.println(a);
		//System.out.println(++a);
*/		
		String s=new String("Hello");
		System.out.println(s instanceof String);
		if(s instanceof String)
		{
			System.out.println("S is a instance of String");
		}
		s=null;
		
		if(!(s instanceof String))
		{
			System.out.println("S is not an instance of String");
		}
	}

}
