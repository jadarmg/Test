package InterviewPoint;

public class reverse 
{

	public static void revers(String str)
	{
		char[] input = str.toCharArray();
		
		for(int i=input.length-1;i>=0;i--)
		{
			System.out.print(input[i]);
		}
	}
	public static void main(String[] args) 
	{
		revers("ABC");

	}

}
