package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "BinaryRecursive";
	}
	
	@Override
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length - 1); //calling upon another method with more variables
	}
	
	public int search(int[] arr, int target, int min, int max) {
		int mid = (min + max) / 2;
		if(min > max) //whenever the values cross return -1
			return -1;
		if(arr[mid] == target) { //finishes when mid is target
			return mid;
		}
		if(arr[mid] > target) {
			return search(arr, target, min, mid - 1);//recurse top half
		} else {
			return search(arr, target, mid + 1, max);//recurse bottom half
		}
	}
}
