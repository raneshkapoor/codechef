package com.codechef.beginner.MAX2;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int N = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		int count = 0;
		
		for(int i = str.length()-1;i >= 0;i--) {
			if(str.charAt(i) == '0')
				count++;
			else
				break;
		}
		
		System.out.println(count);
		
		System.exit(0);
	}
}