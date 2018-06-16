package LeetCode;

public class ValidPalindrome 
{
	public static boolean valid(String input)
	{
//		String newInput = "";
//		input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//		int len = input.length();
//		int l = 0;
//		int r = len-1;
//		for(int i=0; i < len/2; i++)
//		{
//			if(input.charAt(i) != input.charAt(len-1-i))
//			{
//				return false;
//			}
//			
//			
//		}
//		return true;
		
		
		
//		
		
		String newInput = "";
		input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int len = input.length();
		int l = 0;
		int r = len-1;
		while(l < r)
		{
			if(input.charAt(l++) != input.charAt(r--))
			{
				return false;
			}
			
			
		}
		return true;
		
		
	}
	
	public static void main(String args[])
	{
		System.out.println(valid("naman"));
	}

}
