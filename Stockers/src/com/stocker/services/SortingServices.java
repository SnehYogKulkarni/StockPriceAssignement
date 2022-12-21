package com.stocker.services;

public class SortingServices {
	// display share prices in ascending order
	public void displayPricesAscendingOrder(double array[]) {
		System.out.println(" Stock prices in ascending order are :");
		for(int i=0; i<array.length; i++) 
			System.out.print(array[i]+ "  " );
		System.out.println();
	}

	//display share prices in descending order
	public void displayPricesDecendingOrder(double array[]) {
		System.out.println(" Stock prices in ascending order are :");
		for(int i=array.length-1; i>=0; i--) 
			System.out.print(array[i]+ "  " );
		System.out.println();
	}

}
