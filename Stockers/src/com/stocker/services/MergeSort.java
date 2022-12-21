package com.stocker.services;

public class MergeSort {
public void sort(double[] array, int left, int right) {
		
		// base condition   
		if(left < right) {
			
			//find the middle element
			int mid = (left + right)/2; 
			
			//sort left and right array
			sort(array, left, mid);  // 
			sort(array, mid+1, right); // 
			
			//merge the sorted values
			merge(array, left, mid, right);
		}
	}

	private void merge(double[] array, int left, int mid, int right) {
		
		// find the size of two sub arrays
		int n1 = mid - left + 1; 
		int n2 = right - mid;  
		
		//create 2 temp arrays
		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];
		
		//copy data into temp arrays
		for(int i = 0 ; i < n1; i++) {
			leftArray[i] = array[left + i]; 
		}
		
		for(int j = 0 ; j < n2; j++) {
			rightArray[j] = array[mid + 1 + j];
		}
		
		//merge the temp arrays
		int i = 0, j =0;
		int k = left; 
		// 1 2 3 4
		while(i < n1 && j < n2) {
			if(leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else
			{
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		//copy remaining element of left array if any
		while(i < n1) {
			array[k] = leftArray[i];
			i++; 
			k++; //
		}
		
		//copy remaining element of left array if any
		while(j < n2) {
			array[k] = rightArray[j];
			j++; 
			k++;
		}
	}


}
