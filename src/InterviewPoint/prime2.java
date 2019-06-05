package InterviewPoint;

public class prime2 
{
   public static void prime(int n)
   {
	   int i,m=0,flag=0;
	   
	   m=n/2;
	   
	   if(n==0 || n==1)
	   {
		   System.out.println("n is not prime no");
	   }
	   
	   for(i=n/2;i<=m;i++)
	   {
		   if(n%2==0)
		   {
			   System.out.println(n +"is not prime no");
			   flag=1;
			   break;
		   }
		  
		   
		}
	   
	   if(flag==0)
	   {
		   System.out.println(n + "is prime no");
	   }
   }
	public static void main(String[] args) 
	{
		prime(3);
		prime(10);

	}

}
