package com.stocker.services;

public class LinearSearch {
	// to find count of companies whose share price is rose
	public int countCompaniesInProfit(boolean []array) {
		int count =0;
		
		for(int i = 0; i< array.length; i++) {
			
			if(array[i]== true)
				 count++;
		}
		return count;
	}
}

