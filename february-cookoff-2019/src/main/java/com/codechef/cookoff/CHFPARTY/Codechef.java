package com.codechef.cookoff.CHFPARTY;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int T = sc.nextInt();
		
		int N;
		int arr[];
		boolean zeroFlag;
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			arr = new int[N];
			zeroFlag = false;
			
			for(int j = 0;j < N;j++) {
				arr[j] = sc.nextInt();
				if(arr[j] == 0)
					zeroFlag = true;
			}
			
			if(zeroFlag == false) {
				System.out.println(0);
				continue;
			}
			
			sort(arr, 0, N-1);
			
			System.out.println(getMaxFriends(arr));	
		}
	}	
	
	private static int getMaxFriends(int arr[]) {
		int count = 0;		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > i)
				return count;
			count++;
		}
		return count;
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