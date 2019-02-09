package com.codechef.beginner.ATM2;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int T = sc.nextInt();
		
		int N;
		int K;
		int req;		
		
		for(int i = 0;i < T;i++) {
			N = sc.nextInt();
			K = sc.nextInt();
			for(int j = 0;j < N;j++) {
				req = sc.nextInt();	
				if(K >= req) {
					System.out.print("1");
					K -= req;
				} else {
					System.out.print("0");
				}				
			}
			System.out.println();			
		}		
	}	
}