package com.codechef.beginner.DECINC;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = sc.nextInt();
		if(N % 4 == 0)
			System.out.println("" + (++N));
		else
			System.out.println("" + (--N));
	}
}