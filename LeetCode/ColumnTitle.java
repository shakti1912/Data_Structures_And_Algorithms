package LeetCode;

public class ColumnTitle
{
	public static String convertToTitle(int n)
	{
		String title = "";
		String[] s = new String[26];
		for(int i=0; i< s.length; i++)
		{
			s[i] = String.valueOf((char) (65+i));
		}
		while(n > 0)
		{
			int x = n % 26;		//64 + x
			System.out.println(x);
			if(x == 0)
			{
				title = "Z" + title;
			}
			else
			{
				title = s[x-1] + title;
			}
			n = n/26;
			System.out.println(n);
		}
		//title = s[n] + title;
		System.out.println(title);


		return title;
	}

	public static void main(String args[])
	{
		convertToTitle(52);
	}

}
