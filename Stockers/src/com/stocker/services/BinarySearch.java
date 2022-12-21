package com.stocker.services;

public class BinarySearch {

	public void searchValue(double [] array, double key) {
		int left = 0;
		int right = array.length - 1;
		int mid;
		
		while(left<=right) {
			
			mid = (left+right)/2;
			
			if(key == array[mid]) {
				System.out.println("\n Stock value " +key+" is presnt");
				break;
			}
			else if(key < array[mid])
				right = mid-1;
			
			else if(key > array[mid])
				left = mid + 1;
		}
		
		if(left>right)
			System.out.println("\n Stock Value not present ");
	}
}
