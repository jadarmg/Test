package Java_practice;
import java.util.Scanner;
public class Demo2Concatiante 
{
	 int i;
	 static public void main(String[] args) 
	{
	  System.out.println("Hi " + "Welcome to " + " java " +"class ");
	  System.out.println("Sum of 4 and 5 is "+ (4+5));
	  System.out.println(4+5 +" is sum of 4 and 5");
	  System.out.println("");
	  System.out.println("----------------");
	  System.out.println("\"It is sunny day\"");
	  System.out.println("\"hi\"");
	  System.out.println("\"My name is Malatesha G Jadar\"");
	  System.out.println('i');
	  System.out.println("i");
	  System.out.println("\"hii\"");
	  Demo2Concatiante d=new Demo2Concatiante();
	  Demo2Concatiante d1=new Demo2Concatiante();
	  d1=null;
	  System.out.println(d);
	  System.out.println(d1);
	  System.out.println(d.i);
	  Scanner sc=new Scanner(System.in);
	 
	  System.out.println("Enter the 1st digit ");
	  int a=sc.nextInt();
	  
	  System.out.println("Enter the 2nd digit ");
	  int b=sc.nextInt();
	  
	  System.out.println("Sum of" + a + " and " + b + " is "+ "c=" +(a+b));
}
}
