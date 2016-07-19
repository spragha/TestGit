package com.raghav.corejava.progs.sort;

public class RecursiveBinarySearch {
	static int binarySearch(int[] A, int loIndex, int hiIndex, int value) {
	      
		   if (loIndex > hiIndex) {
		         // The starting position comes after the final index,
		         // so there are actually no elements in the specified
		         // range.  The value does not occur in this empty list!
		      return -1;
		   }
		   
		   else {
		         // Look at the middle position in the list.  If the
		         // value occurs at that position, return that position.
		         // Otherwise, search recursively in either the first
		         // half or the second half of the list.
		      int middle = (loIndex + hiIndex) / 2;
		      if (value == A[middle])
		         return middle;
		      else if (value < A[middle])
		         return binarySearch(A, loIndex, middle - 1, value);
		      else   // value must be > A[middle]
		         return binarySearch(A, middle + 1, hiIndex, value);
		   }

		}

	public static void main(String[] args) {
		int[] arr1 = { 2, 45, 234, 567, 876, 900, 976, 999 };

		int index = binarySearch(arr1, 0, arr1.length, 45);

		System.out.println("Found 45 at " + index + " index");

		index = binarySearch(arr1, 0, arr1.length, 999);

		System.out.println("Found 999 at " + index + " index");

		index = binarySearch(arr1, 0, arr1.length, 876);

		System.out.println("Found 876 at " + index + " index");
		
		System.out.println("The value founf in="+binarySearch(arr1,900));

	}
	public static int binarySearch(int[] array, int value)  {
	    int start = 0;
	    int end = array.length -1;              
	     
	    for (int i = 0; i < array.length; i++)   {
	        int middle = (end - start)/2;
	        if (array[i] == value)  {
	            return i;
	        }
	        else if (array[middle] > value)  {
	            end = middle - 1;
	        }
	        else    {
	            start = middle + 1;
	        }
	    }
	    return -1;
	}

}
