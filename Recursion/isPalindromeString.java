package Recursion;

public class isPalindromeString 
{

	public static void main(String[] args)
	{
		System.out.println(isPalindrome("1321"));
		
	}
	
	public static boolean isPalindrome(String s)
	{
		if(s.length() <= 1)
		{
			return true;
		}
		else
		{
			return (s.charAt(0) == s.charAt(s.length() -1)) && (isPalindrome(subString(s)));
		}
	}
	
	public static String subString(String s)
	{
		String res = s.substring(1, s.length()-1);
		return res;
	}
}
