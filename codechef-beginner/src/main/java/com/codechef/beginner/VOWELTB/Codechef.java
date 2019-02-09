package com.codechef.beginner.VOWELTB;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String str = sc.nextLine();
		
		if(str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")) {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}		
	}
}