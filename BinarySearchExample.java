package Lab;

public class BinarySearchExample
{
	public static void binarySearch(int arr[], int first, int last, int key)
//	initiates code for an array from low to high
	{
		int mid = (first + last) / 2;
//		wants the key to equal the mid, implementing a parameter for the middle to be found
		while (first <= last)
//			beginning to calculate the middle value
		{
			if (arr[mid] < key)
			{
				first = mid + 1;

			} else if (arr[mid] == key)
//				finds the middle by narrowing down the mid
			{
				System.out.println("Element is found at index: " + mid);
				break;
//				prints the mid if found
			} else
			{
				last = mid - 1;
//				establishes the last by putting the distance from the middle
			}
			mid = (first + last) / 2;
		}
		if (first > last)
//			if the array is not printed in order for the index the mid will not be found
		{
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[])
	{
		int arr[] =
//				defines the array
				{ 10, 20, 30, 40, 50 };
//		defines the key
		int key = 30;
		int last = arr.length - 1;
//		calls the binary search method from above to look for the index
		binarySearch(arr, 0, last, key);
	}
}
