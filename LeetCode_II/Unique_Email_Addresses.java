package LeetCode_II;

public class Unique_Email_Addresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int numUniqueEmails(String[] emails)
	{
		for(int i=0; i < emails.length; i++)
		{
			int index = emails[i].indexOf("@");
			String local = emails[i].substring(0, index);
			String domain = emails[i].substring(index+1);
			
		}

	}


}
