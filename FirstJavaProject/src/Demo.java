
public class Demo {

	public static void main(String arg[])
	{
		
		String s = "I like QA automation" ;
		
		String s1[] = s.split(" ");
		
		int len = s.length();
		
		int i,j;
		
		
		
		for (i=s1.length-1;i>=0;i--)
		{
			
			System.out.print(s1[i]);					
			
			System.out.print(" ");
		}
		
		
	}
	
	
}
