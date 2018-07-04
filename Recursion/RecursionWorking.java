package Recursion;

public class RecursionWorking
{
	
	public static void main(String[] args)
	{
		
		// result = fun1(5,2);
		//print(result);
		
		//fun3(5);
		//print(result);
		//fun4(4);
		//int arr[] = {12, 10, 30, 50, 100};
		//int x = fun5(arr, 5);
		//print(x);
		
		//int i = 200;
		//if(i % 2 == 1)
		//{
		//	//print("its true");
		//}
		
		int x = 8818;
		//print(x%10);
		print(x%100);
		
		
		
		
	}

	static int fun1(int x, int y) 
	{
	  if(x == 0)
	    return y;
	  else
	  {  
	    int toPrint =  x + fun1(x - 1,   y);
	  	print(toPrint);
	  	return toPrint;
	  }
	}
	
	/* Assume that n is greater than or equal to 1 
	 * This function calculates log n
	 */
	static int fun2(int n)
	{
	  if(n == 1)
	     return 0;
	  else
	     return 1 + fun2(n/2);
	}
	
	/* Assume that n is greater than or equal to 0 */
	static void fun3(int n)
	{
	  if(n == 0)
	    return;
	 
	  fun3(n/2);
	  print(n%2);
	}  
	
	static void fun4(int x)
	{
	  if(x > 0)
	  {
	     fun4(--x);
	     print(x);
	     //fun4(--x);
	  }
	}
	
	static int fun5(int a[],int n)
	{
		  int x;
		  if(n == 1)
		    return a[0];
		  else
		    x = fun5(a, n-1);
		  if(x > a[n-1])
		    return x;
		  else
		    return a[n-1];
		}
	
	
	static void print(Object x)
	{
		System.out.print(x);
	}

////
public boolean array220(int[] nums, int index) {
	  if(index >= nums.length)
	  {
	    return false;
	  }
	  if(array220Helper(nums, nums[index]*10, index+1))
	  {
	    return true;
	  }
	  else
	  {
	    return array220(nums, index+1);
	  }
	}

	public boolean array220Helper(int[] nums, int val, int index)
	{
	   if(index >= nums.length)
	  {
	    return false;
	  }
	  else
	  {
	    if(nums[index] == val)
	    {
	     return true; 
	    }
	    else
	    {
	      return array220Helper(nums, val, index + 1);
	    }
	  }
	}

	
	//////////
	public String stringClean(String str)
	{
		  if(str.length() <= 1)
		  {
		    return str;
		  }
		  if(str.length() > 2 && str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2))
		  {
		    
		    return str.charAt(0) + stringClean(str.substring(3));
		}
		  if(str.charAt(0) == str.charAt(1))
		  {
		     return str.charAt(0) + stringClean(str.substring(2));
		  }
		  return str.charAt(0) + stringClean(str.substring(1));
		}
}

////public boolean strCopies(String str, String sub, int n) {
if(n == strCount(str, sub))
{
  return true;
}
return false;
}

public int strCount(String str, String sub) {
if(str.length() < sub.length())
{
  return 0;
}
if(str.substring(0, sub.length()).equals(sub))
{
  return 1 + strCount(str.substring((sub.length())), sub);
}
return strCount(str.substring(1), sub);
}
