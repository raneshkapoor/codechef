package com.codechef.cookoff.TABLET;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int T = sc.nextInt();
		
		int N;
		int B;
		
		int W;
		int H;
		int P;
		
		int max = -1;
		
		for(int i = 0;i < T;i++) {
			max = -1;
			
			N = sc.nextInt();
			B = sc.nextInt();
			
			for(int j = 0;j < N;j++) {
				W = sc.nextInt();
				H = sc.nextInt();
				P = sc.nextInt();
				
				if(P <= B && (W*H) > max) {
					max = W*H;
				}
			}
			
			if(max == -1)
				System.out.println("no tablet");
			else
				System.out.println(max);
			
		}
	}	
}