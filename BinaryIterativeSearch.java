package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search{
	@Override
	public String searchName() {
		return "BinaryIterative";
	}

	@Override
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		
		while(min < max) { //exit loop when min and max overlap
			int mid = (min + max) / 2;
			if(arr[mid] == target) {
				return mid;
			}
			if(arr[mid] > target) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}
}
