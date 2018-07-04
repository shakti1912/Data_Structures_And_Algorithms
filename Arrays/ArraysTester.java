package Arrays;

public class ArraysTester
{
	
	public static void main(String[] args)
	{
		/*
		int[] a = generateArray(10);
		reverseArray revArr = new reverseArray();
		System.out.println("Array before reversing: ");printArray(a);
		//int[] x = revArr.reverse(a, a.length);
		int[] x = revArr.recursiveReverse(a,0,a.length-1);
		System.out.println("\nArray after reversing: ");printArray(x);
	*
		int[] a = generateArray(12);
		FindLeaders fl = new FindLeaders();
		int[] x = fl.leaders(a);
		printArray(x);
		System.out.println();
		
		int[] x2 = fl.leadersOptimal(a);
		printArray(x2);
		
		int[] a = generateArray(12);
		ExactTwoSum ETS = new ExactTwoSum();
		boolean b = ETS.TwoSum(a, 1); 
		System.out.println(b);
		
		boolean b2 = ETS.TwoSum2(a, 102121);
		System.out.println(b2);
		
		
		int[] a = {2,2,4,4,3,4,4};
		MajorityElement ME = new MajorityElement();
		System.out.println(ME.majority(a));
		*
		int[] a = {2, 3, 5, 4, 5, 2, 4, 3, 5,5,2, 2, 4, 4, 2};
		OddTimes OT = new OddTimes();
		System.out.println(OT.bestSolution(a));
		*
		int[] a = {1, 2, 4,6,5, 7, 8};
		MissingNumber MN = new MissingNumber();
		System.out.println(MN.missing(a));
		System.out.println(MN.usingSum(a));
		System.out.println(MN.usingXOR(a));
		*/
		int[] a = {1, 2, 4,6, 10,12,5, 7, 8};
		printArray(a);
		System.out.println();
		ArrayRotation AR = new ArrayRotation();
		int[] x = AR.rotation(a, 2);
		printArray(x);
		System.out.println();
		int[] y = AR.onebyone(a, 2);
		printArray(y);
		
		
	}
	
	public static void sortedArrayTester()
	{
		//for sorted array
				int[] a2 = new int[20]; 
				a2[0] = 1;
				a2[1] = 2;
				a2[2] = 3;
				a2[3] = 4;
				a2[4] = 5;
				a2[5] = 7;
				a2[6] = 10;
				a2[7] = 15;
				a2[8] = 19;
				System.out.println("Array before: ");
				for(int i=0; i < a2.length; i++)
				{
					System.out.print(a2[i]+ " ");
				}
				
				OpsOnSortedArray ops2 = new OpsOnSortedArray();
				System.out.println("\n\nUsing  Linear Search: 15 is at index " + ops2.LinearSearch(a2, 15));
				System.out.println("Using Recursive Binary Search: 3 is at index " + ops2.BinarySearchRecursive(a2, 3, 0, 9));
				System.out.println("Using Iterative Binary Search: 7 is at index " + ops2.BinarySearchIterative(a2, 7, 0, 9));
				
				
				ops2.insert(a2, 6, 9);
				
				System.out.println("\nArray After inserting 6: ");
				for(int i=0; i < a2.length; i++)
				{
					System.out.print(a2[i]+ " ");
				}
				
				//deleting from the sorted array
				int n2 = a2.length;
				ops2.delete(a2, 10, n2);
				System.out.println("\n\nArray After deleting 10: ");
				for(int i=0; i < a2.length; i++)
				{
					System.out.print(a2[i]+ " ");
				}
	}
	
	public static void unsortedArrayTester()
	
	{
		//for unsorted array
				OpsOnUnsortedArray Arrayops = new OpsOnUnsortedArray();
				int[] a = {20,30,40,54,12,1,0,-1,6,7};
				int n = a.length;
				System.out.println(Arrayops.search(a, -2));
				
				int[] b = new int[10];
				b[0] = 1;
				b[1] = 2;
				
				Arrayops.insert(b, 100, 2);
				System.out.print("Insert operation: ");
				for(int i=0; i < b.length; i++)
				{
					System.out.print(b[i]+ " ");
				}
				
				System.out.print("\n" + "Before Deletion: ");
				
				//testing delete operation
				for(int i=0; i < a.length; i++)
				{
					System.out.print(a[i]+ " ");
				}
				
				System.out.print("\n" + "After Deletion: ");
				n = Arrayops.delete(a, 40, n);
				n = Arrayops.delete(a, 0, n);
				
				
				
				for(int i=0; i < n; i++)
				{
					System.out.print(a[i]+ " ");
				}
				System.out.print("\n");
				
	}
	public static int[] generateArray(int length)
	{
		int[] a2 = new int[length]; 
		
		a2[0] = 150;
		a2[1] = 2;
		a2[2] = 3;
		a2[3] = 4;
		a2[4] = 100;
		a2[5] = 5;
		a2[6] = 7;
		a2[7] = 10;
		a2[8] = 15;
		a2[9] = 32;
		a2[10] = 19;
		a2[11] = -1;
		
		return a2;
	}
	
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	

}
