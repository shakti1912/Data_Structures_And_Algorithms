package LeetCode;

public class strStr {

	 public  static int strStr(String haystack, String needle) 
		{
			if(needle.length() == 0)
			{
				return 0;
			}
	        if(haystack.length()  < needle.length())
	        {
	            return -1;
	        }
			for(int i= 0; i < haystack.length(); i++)
			{
				if (haystack.charAt(i) == needle.charAt(0))
				{
					String sub = haystack.substring(i);
					if(sub.length() >= needle.length() && check(sub, needle))
					{
						return i;
					}
				}
			}
			return -1;

		}
		
		public static boolean check(String h, String n)
		{
			int i=0;
			while(i < n.length())
			{
				if(h.charAt(i) != n.charAt(i))
				{
					return false;
				}
				i++;	
			}
			return true;
		}
	public static void main(String args[])
	{
		System.out.println(strStr("mississippi", "issipi"));
	}

}
