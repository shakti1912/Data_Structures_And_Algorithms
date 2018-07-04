package Recursion;

public class PrintStars 
{
	public static void main(String[] args)
	{
		//printStars(3);
		printTriangle2(1, 4);
	}
	public static void printStars(int n)
	{
		if(n == 0)
		{
			System.out.println();
		}
		else
		{
			System.out.print("*");
			printStars(n-1);
		}
	}
	
	public static void printTriangle(int n)
	{ //int count = 1;
		if(n == 0)
		{
			return;
		}
		else if(n == 1)
		{
			System.out.println("*");
		}
		else
		{
			//System.out.print("*");
			printStars(n);
			System.out.println();
			printTriangle(n-1);
			
		}
	}
	public static void printTriangle2(int count, int n)
	{ 
		if(count > n)
		{
			return;
		}
		else 
		{
			//System.out.print("*");
			printStars(count);
			System.out.println();
			printTriangle2(count+ 1, n);
			
		}
	}
	

}
