package Recursion;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseLines
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//System.out.println(isPalindrome("ablewasiereisawelba"));
		File file = new File("temp.txt");

		Scanner in = new Scanner(file);
		reversePrint(in);

	}
	public static void reversePrint(Scanner in) throws FileNotFoundException
	{
		if(!in.hasNext())
		{
			return;
		}
		String s = in.nextLine();
		reversePrint(in);
		System.out.println(s);

	}


}
