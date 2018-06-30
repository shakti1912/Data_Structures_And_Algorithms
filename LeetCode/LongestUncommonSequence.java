package LeetCode;

public class LongestUncommonSequence
{
	public static int findLUSlength(String a, String b) 
	{
		int ret = -1;
		String uncommon = "";
		if(a.length() > b.length())
		{
			for(int i =0; i < b.length(); i++)
			{

				String temp = "";
				for(int j = i;  j < b.length(); j++)
				{
					String sub = b.substring(i, j+1);
					if(!a.contains(sub))
					{
						temp = sub;
					}

				}
				if(temp.length() >= uncommon.length() )
				{
					uncommon = temp;
				}	
			}
		}
		else
		{
			for(int i =0; i < a.length(); i++)
			{

				String temp = "";
				for(int j = i;  j < a.length(); j++)
				{
					String sub = a.substring(i, j+1);
					if(!b.contains(sub))
					{
						temp = sub;
					}

				}
				if(temp.length() >= uncommon.length() )
				{
					uncommon = temp;
				}	
			}
		}
		System.out.println(uncommon);
		return uncommon.length();


	}

	public static void main(String args[])
	{
		System.out.println(findLUSlength("aefeaf", ""));

	}
}
