package com.codechef.beginner.COLOR;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		
		int N;
		String str;
		
		int rCount;
		int gCount;
		int bCount;
		
		for(int i = 0;i < T;i++) {
			
			N = sc.nextInt();
			sc.nextLine();
			str = sc.nextLine();
			
			rCount = 0;
			gCount = 0;
			bCount = 0;
			
			if(N == 1 || (N == 2 && (str.charAt(0) == str.charAt(1)))) {
				System.out.println("0");
				continue;
			}
			if(N == 2 && str.charAt(0) != str.charAt(1)) {
				System.out.println("1");
				continue;
			}
			
			for(int j = 0;j < N;j++) {
				switch (str.charAt(j)) {
				case 'R':
					rCount++;
					break;
				case 'G':
					gCount++;
					break;
				case 'B':
					bCount++;
					break;
				default:
					break;
				}
			}
			
			if(rCount >= gCount && rCount >= bCount) {
				System.out.println("" + (N - rCount));
			}
			else if(gCount >= bCount && gCount >= rCount) {
				System.out.println("" + (N - gCount));
			}
			else {
				System.out.println("" + (N - bCount));
			}	
		}		
	}
}