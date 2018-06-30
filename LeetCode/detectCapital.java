package LeetCode;

public class detectCapital
{

	public static void main(String[] args)
	{
		System.out.println(detectCapitalUse("USA"));// true
		System.out.println(detectCapitalUse("Shakti")); //true
		System.out.println(detectCapitalUse("SHakti")); // false
		System.out.println(detectCapitalUse("shakti")); // true
		

	}
	public static boolean detectCapitalUse(String word) 
	{
		int l = 0;
		int x = 0;
		for(int i = 0; i< word.length(); i++)
		{
			int a = word.charAt(i);
			if(a >= 65 && a <= 90 && i ==0)
			{
				
				x = 1;

			}
			else if(a >= 65 && a <= 90 && i != 0)
			{
				l++;

			}


		}
		if(x == 1 && l == word.length()-1)
		{
			return true;
		}
		if(l >= 1 && l < word.length()-1 && x == 1)
		{
			return false;
		}
		if(x == 1 && l == 0)
		{
			return true;
		}
		if(x == 0 && l == 0)
		{
			return true;
		}
		return false;
	}
}

