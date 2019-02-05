package com.codechef.beginner.AREAPERI;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int L = sc.nextInt();
		int B = sc.nextInt();
		
		if((L*B) > (2*(L+B))) {
			System.out.println("Area");
			System.out.println((L*B));
		}
		else if((L*B) < (2*(L+B))) {
			System.out.println("Peri");
			System.out.println((2*(L+B)));
		}
		else {
			System.out.println("Eq");
			System.out.println((L*B));
		}		
	}
}