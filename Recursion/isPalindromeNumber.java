package Recursion;

public class isPalindromeNumber 
{
	public static void main(String[] args)
	{
		//System.out.println(isPalindrome(12321));
		System.out.println(12321/10);
		System.out.println(12321 >> 1);

	}

	public static boolean isPalindrome(int n)
	{
		if(n < 10)
		{
			return true;
		}
		else
		{
			//return (n/10.charAt(0) == s.charAt(s.length() -1)) && (isPalindrome(subString(s)));
		}
		return false;
	}

	public static String subString(String s)
	{
		String res = s.substring(1, s.length()-1);
		return res;
	}

}
