package com.codechef.beginner.DIFFSUM;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		if(N1 > N2)
			System.out.println("" + (N1 - N2));
		else
			System.out.println("" + (N1 + N2));
	}
}