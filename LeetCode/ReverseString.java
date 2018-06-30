package LeetCode;
/**
If a string is going to remain constant throughout the program,
	then use String class object because a String object is immutable.
If a string can change (example: lots of logic and operations in the construction of the string) 
	and will only be accessed from a single thread, using a StringBuilder is good enough.
If a string can change, and will be accessed from multiple threads, 
	use a StringBuffer because StringBuffer is synchronous so you have thread-safety.
 */
public class ReverseString {

	public static String reverseString(String s) 
	{
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1 ;i >=0; i--)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString(); 
	}
	
	public static void main(String args[])
	{
		System.out.println(reverseString("shakti"));
	}

}
