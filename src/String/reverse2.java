package String;

public class reverse2 
{
     public void swap(int x,int y)
     {
    	 System.out.println("Value of x before Swapping x=" +x);
    	 System.out.println("Value of y before Swapping y=" +y);
    	 x=x+y;
    	 y=x-y;
    	 x=x-y;
    	 System.out.println("Value of x after Swapping x=" +x);
    	 System.out.println("Value of y after Swapping y=" +y);
     }
	public static void main(String[] args) 
	{
		reverse2 r=new reverse2();
		r.swap(20,10);

	}

}
