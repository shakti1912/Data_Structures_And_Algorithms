package Hashing.General_Problems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashingTester
{
	public static void main(String[] args)
	{
		//PairEqualTester();
		//FindDuplicatesTester();
		//SymmetricPairTester();
		//GroupOccurrencesTester();
		//DisjointTester();
		//PairProductTester();
		//FindItineraryTester();
		//employeeTester();
		//DivideArrayTester();
		//FindMissingTester();
		//MaximumCharTester();
		//RepeatingElementTester();
		// PrintDistinctElements();
		 PermutatedRowsTester();
	}

	public static void PairEqualTester()
	{
		PairEqualSum pair = new PairEqualSum();
		int[] n = {1, 4, -8, 45, 6, 10};
		boolean b = pair.equalSum4(n, 16);
		System.out.print(b);
	}
	public static void SubsetArrayTester()
	{
		SubsetArray s = new SubsetArray();
		int arr1[] = {11, 1, 13, 21, 3, 7};
		int arr2[] = {11, 0 , 7, 1};
		boolean b = s.subset(arr1, arr2);
		System.out.print(b);
	}
	public static void FindDuplicatesTester()
	{
		FindDuplicates f = new FindDuplicates();
		int[] a = {1, 2, 3, 4, 4};
		System.out.println(f.find(a, 3));
		System.out.print(f.findHashing(a, 3));	
	}
	public static void SymmetricPairTester()
	{
		SymmetricPairs pairs = new SymmetricPairs();
		int c = pairs.pairs();
		System.out.print(c);
		
	}
	
	public static void GroupOccurrencesTester()
	{
		GroupOccurrences group = new GroupOccurrences();
		int[] a = {4, 6, 9, 2, 3, 4, 9, 6, 10, 4};
		group.group(a);
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
	public static void DisjointTester()
	{
		int  set1[] = {12, 34, 11, 9, 3};
	     int  set2[] = {7, 2, 1, 5};
	    DisjointSets dis = new DisjointSets();
	    boolean b = dis.areDisjoint(set1, set2);
	    System.out.print(b);
	}
	public static void PairProductTester()
	{
		int arr[] = {10, 20, 9, 40};
        int x = 400;
        PairProduct p = new PairProduct();
	    boolean b = p.equalProduct(arr, x);
	    System.out.print(b);
	}
	public static void FindItineraryTester()
	{
		HashMap<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("Chennai", "Banglore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");
		FindItinerary it = new FindItinerary();
		System.out.println("Following list shows itinerary: " );
		System.out.print(it.itinerary(dataSet).toString());
	   
	}
	
	public static void employeeTester()
	{
		EmployeeManager em = new EmployeeManager();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "C");
		map.put("B", "C");
		map.put("C", "F" );
		map.put("D", "E");
		map.put("E", "F" );
		map.put("F", "F"); 
		HashMap<String, Integer> m = em.find(map);
		System.out.print(m.toString());
	}
	
	public static void DivideArrayTester()
	{
		int arr[] = {92, 75, 65, 48, 45, 35};		
		int k = 10;
		DivideArray div = new DivideArray();
		boolean b = div.divide(arr, k);
		System.out.print(b);
	
	}
	
	public static void FindMissingTester()
	{
		FindMissing fm = new FindMissing();
		int arr[] = {1, 14, 11, 51, 15};
		int low = 50;
		int high = 55 ;
		ArrayList<Integer> list = fm.missing(arr, low, high);
		System.out.print(list.toString());
	}
	
	public static void MaximumCharTester()
	{
		MaximumChar m = new MaximumChar();
		System.out.print(m.maximum("test"));
		
	}
	public static void RepeatingElementTester()
	{
		RepeatingElement rm = new RepeatingElement();
		int[] a = {10, 5, 3, 4, 3, 5, 6};
		System.out.print(rm.repeating2(a));
	}
	
	public static void PrintDistinctElements()
	{
		HashSet<Integer> set = new HashSet<Integer>();
		int[] a = {10, 5, 3, 4, 3, 5, 6};
		for(int i = 0; i < a.length; i++)
		{
			set.add(a[i]);
		}
		System.out.print(set.toString());	
	}
	
	public static void PermutatedRowsTester()
	{
		int mat[][] = {
				{3, 1, 4, 2}, 
                {1, 6, 9, 3},
                {1, 2, 3, 4},
                {4, 3, 2, 1}
                };
		PermutatedRows pr = new PermutatedRows();
		System.out.print(pr.permuted(mat, 3).toString());
	}
	

}
