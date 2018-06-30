package SortingAndSearching;

import java.util.Arrays;

public class InsertionSort 
{
	static LinkedList list = new LinkedList();
	public static void main(String[] args)
	{
		int[] a = {105, 102, 107, 103, 106, 100, 104, 101};
		System.out.println("Array before Insertion Sort : " + Arrays.toString(a));
		System.out.println("Array after Insertion Sort " + Arrays.toString(recursiveInsertionSort(a, a.length)));

		LinkedList A = new LinkedList();
		A.insert(30);
		A.insertLast(3);
		A.insertLast(4);
		A.insertLast(20);
		A.insertLast(5);

		System.out.println("Traversing list before sorting ");
		A.traversal();
		LinkedList result = linkedsort(A);
		result.traversal();





	}

	public static int[] insertionSort(int[] a)
	{
		int j = -1;
		int n = a.length;
		for(int i = 1; i < n; i++)
		{
			int key = a[i];
			j = i-1;
			while(j >= 0 && a[j] > key)
			{
				a[j+1] = a[j];
				j = j - 1;

			}
			a[j+1] = key;
		}

		return a;

	}

	/*
	 * recursively sort n-1 elements and then put last element at its appropriate position in the sorted array.
	 */
	public static int[] recursiveInsertionSort(int[] A, int n)
	{
		if(n <= 1)
		{
			return A;
		}

		recursiveInsertionSort(A, n-1);

		int last = A[n-1];
		int j = n-2;

		while(j >= 0 && A[j] > last)
		{
			A[j+1] = A[j];
			j = j -1;

		}
		A[j+1] = last;
		return A;

	}

	/*
	 * Insertion sort on linked list
	 */
	public static LinkedList linkedsort(LinkedList A)
	{
		//LinkedList list = new LinkedList();
		Node current = A.head;
		while(current != null)
		{
			//insert in sorted order
			insert(current);
			current = current.next;
		}
		return list;

	}

	public static void insert(Node c)
	{

		//empty list
		if(list.head == null || c.data <= list.head.data)
		{
			c.next = list.head;
			list.head = c;
			return;
		}
		else
		{
			Node current = list.head;

			while(current.next != null && c.data > current.next.data)
			{
				current = current.next;
			}
			c.next = current.next;
			current.next = c;
		}

	}

}
