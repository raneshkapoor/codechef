package com.codechef.beginner.HOWMANY;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int N = sc.nextInt();
		
		if(N < 10) {
			System.out.println("1");
		}
		else if(N < 100) {
			System.out.println("2");
		}
		else if(N < 1000) {
			System.out.println("3");
		}
		else {
			System.out.println("More than 3 digits");
		}		
	}
}