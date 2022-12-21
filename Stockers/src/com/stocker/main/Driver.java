package com.stocker.main;
import com.stocker.services.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int n;
		int ch;
		
		System.out.print("\n Enter number of Companies information to be saved :: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		double sharePrice[] = new double[n];
		boolean value[] = new boolean[n];
		
		for(int i =0; i<n; i++) {
			
			System.out.print("\n Enter current stock price of Company"+(i+1)+ ":: ");
			sharePrice[i]= sc.nextInt();
			
			System.out.print("\n Whether the company's stock price rose today compared to yesterday?:: ");
			value[i] = sc.nextBoolean();
		}
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(sharePrice, 0, sharePrice.length -1);
		
		SortingServices sortingServices = new SortingServices();
		
		LinearSearch linearSearch = new LinearSearch();
		
		BinarySearch binarySearch = new BinarySearch();
		
		do {
			
			System.out.println(" \n-----------------------------------------------\r\n" + 
					"Enter the operation that you want to perform\r\n" + 
					"1. Display the companies stock prices in ascending order\r\n" + 
					"2. Display the companies stock prices in descending order\r\n" + 
					"3. Display the total no of companies for which stock prices rose today\r\n" + 
					"4. Display the total no of companies for which stock prices declined today\r\n" + 
					"5. Search a specific stock price\r\n" + 
					"6. press 0 to exit\r\n" + 
					"----------------------------------------------- ");

			ch = sc.nextInt();
			
			switch(ch) {
			
			case 0: ch = 0;
					break;
			case 1: sortingServices.displayPricesAscendingOrder(sharePrice);
					break;
					
			case 2: sortingServices.displayPricesDecendingOrder(sharePrice);
					break;
			case 3: System.out.println(" The total no of companies for which stock prices rose today :: " + linearSearch.countCompaniesInProfit(value));
					break;
			case 4: System.out.println(" The total no of companies for which stock prices declined today :: " + ( n- linearSearch.countCompaniesInProfit(value)));
					break;
			case 5: double key;
					System.out.print("\n Enter Stock price to be searched :: ");
					key = sc.nextDouble();
					binarySearch.searchValue(sharePrice, key);
					break;
			default: System.out.println(" Enter Valid Option");
			}
			
		}while(ch!=0);
		
		System.out.println(" Exited Succesfully");
		sc.close();
		
	}

}
