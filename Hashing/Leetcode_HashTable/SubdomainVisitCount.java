package Hashing.Leetcode_HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SubdomainVisitCount 
{
	public static List<String> subdomainVisits(String[] cpdomains) 
	{
		ArrayList<String> list = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String s: cpdomains)
		{
			String[] twoParts = s.split(" ");
			String a = twoParts[0];
			String b = twoParts[1];
			while(!b.isEmpty())
			{
				//String t = b.substring(0, b.indexOf("."));
				if(map.containsKey(b)) 
				{
					map.put(b, map.get(b)+Integer.parseInt(a));
				}
				else
				{
					map.put(b, Integer.parseInt(a));
				}
				b = b.substring(b.indexOf(".")+1);
				if(b.indexOf(".") == -1)
				{
					b = "";
				}
				
			}
			String last = s.substring(s.lastIndexOf(".")+1);
			if(map.containsKey(last)) 
			{
				map.put(last, map.get(last)+Integer.parseInt(a));
			}
			else
			{
				map.put(last, Integer.parseInt(a));
			}
		}
		Set<String> set = map.keySet();
		for(String x: set)
		{
			String f = map.get(x) + " " + x;
			list.add(f);
		}
		return list;
	}

	public static void main(String args[])
	{
		String[] str = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		List<String> l = subdomainVisits(str);
		System.out.println(l);
	}


}
