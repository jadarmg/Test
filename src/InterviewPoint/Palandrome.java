package InterviewPoint;

import java.util.Scanner;

public class Palandrome 
{
     public static void CheckPalandrome()
     {
    	Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the String/no to check whether it is palandrome or not");
    	 String input=sc.nextLine();
    	 String reverse="";
    	 for(int i=input.length()-1;i>=0;i--)
    	 {
    		 reverse=reverse+input.charAt(i);
    	 }
    	 
    	 if(input.equalsIgnoreCase((reverse)))
    	 {
    		 System.out.println("Given input is Palandrome " +reverse );
    	 }
    	 else
    	 {
    		 System.out.println("Given input is not Palandrome not " + reverse);
    	 }
     }
	public static void main(String[] args) 
	{
		CheckPalandrome();

	}

}
