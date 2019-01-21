package LeetCode;

public class BackSpaceStringCompare
{

	public static void main(String args[])
	{
		String S = "ab#c";
		String T = "ad#c";
		System.out.println(backspaceCompare(S, T));
		
	}
	

	public static boolean backspaceCompare(String S, String T)
	{
		if(!S.contains("#") && !T.contains("#"))
		{
			if(S.equals(T))
			{
				return true;
			}
		}
		
		
	}

}
