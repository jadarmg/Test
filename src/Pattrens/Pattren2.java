package Pattrens;

public class Pattren2 
{

	public static void main(String[] args) 
	{
		
		int k=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i+k;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			k=k+1;
		}

	}

}
