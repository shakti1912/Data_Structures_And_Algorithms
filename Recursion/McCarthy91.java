package Recursion;
/*
 * John McCarthy introduced this as a test case for formal verification within computer science.
 */
public class McCarthy91 
{
	static int fun(int n)
	 {
	   if (n > 100)
	     return n - 10;
	   return fun(fun(n+11));
	 }
	 
	public static void main(String[] args)
	{
	 System.out.print(fun(99));
	  
	}

}
