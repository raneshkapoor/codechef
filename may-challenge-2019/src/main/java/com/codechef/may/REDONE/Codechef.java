package com.codechef.may.REDONE;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	private static final int MOD = 1000000007;
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		int N;
		long result;
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			
			result = N + 1;
			
			/*for(int j = 1;j < N;j++) {
				result = (long)(j + result + (long)j*result) % MOD;
			}*/
			
			for(int j = N;j > 1;j--) {
				result = ( result * j ) % MOD;
			}
			
			System.out.println(( result - 1 ));
			
		}
		
	}

}
