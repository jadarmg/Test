package String;

public class Comparision 
{

	public static void main(String[] args) 
	{
		String s1="java";
//		String s2="Developer";
//		String s3=new String("java");
//		String s4=new String("Developer");
//		String s6=new String("Developer");
//		String s5="java";
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		
//		System.out.println(s1==s3);//false
//		System.out.println(s1.equals(s3));// To compare the values we will use equals method //true
//		System.out.println(s1==s5);//true
//		System.out.println(s2.equals(s4));//true
//		System.out.println(s2.equals(s6));//true
//		System.out.println(s4==s6);//false
		
		//System.out.println(s1.toUpperCase());
		/*System.out.println(s1.isEmpty());
		System.out.println(s1.indexOf("k"));
		System.out.println(s1.indexOf("a", 2));
		*/
	String S2 = "javaDeveloper";
	System.out.println(S2.indexOf('a', 2));// Starts from index 2 and will search for a
	System.out.println(S2.indexOf('e', 8));//11  Starts from index 8 and search for next index
	System.out.println(S2.indexOf('e', 9));//11 Starts from index 8 and search for next index
	
	String s4="Hi";
	String s5="bye";
	System.out.println(s4.concat("bye"));
	System.out.println(s4.concat(s5));
	System.out.println(S2.endsWith("per"));
	
		
		
				

	}

}
