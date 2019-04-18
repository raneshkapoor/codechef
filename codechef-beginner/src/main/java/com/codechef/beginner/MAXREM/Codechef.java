package com.codechef.beginner.MAXREM;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i = 0;i < N;i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr, 0, N-1);
		
		for(int i = N-2;i >= 0;i--) {
			if(arr[i] == arr[i+1] && i != 0)
				continue;
			else {
				System.out.println((arr[i] % arr[i+1]));
				break;
			}
		}		
		
		/*int maxRem = 0;
		
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < N;j++) {
			//	System.out.println((i%j));
				if(arr[i] % arr[j] > maxRem) {
					maxRem = arr[i] % arr[j];
				}
			}
		}
		
		System.out.println(maxRem);*/
		
		System.exit(0);
	}
	
	private static void sort(int arr[], int low, int high) { 
        if (low < high) { 
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
	
	private static int partition(int arr[], int low, int high) { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) { 
            if (arr[j] <= pivot) { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp;   
        return i+1; 
    } 
	
}
