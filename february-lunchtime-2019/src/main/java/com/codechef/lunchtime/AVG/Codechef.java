package com.codechef.lunchtime.AVG;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
	
		int T = sc.nextInt();
		
		int N;
		int K;
		int V;
		int sum = 0;
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			V = sc.nextInt();
			
			sum = 0;
			
			for(int j = 0;j < N;j++) {
				sum += sc.nextInt();
			}
			
			V = V * (N + K);	
			V -= sum;
			
			if(V/K < 0)
				System.out.println(-1);
			else if(V % K != 0)
				System.out.println(-1);
			else
				System.out.println(V/K);
			
		}
	}	
}