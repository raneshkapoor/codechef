package com.codechef.beginner.BUGCAL;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int T = sc.nextInt();
		
		int a;
		int b;
		
		for(int i = 0;i < T;i++) {	
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println(getSum("" + a, "" + b));			
		}		
	}	
	
	private static String getSum(String a, String b) {
		
		int min = a.length();
		if(b.length() < min)
			min = b.length();
		
		String str = "";
		
		for(int i = 1;i <= min;i++) {			
			str = "" + ((Integer.parseInt("" + a.charAt(a.length()-i)) + Integer.parseInt("" + b.charAt(b.length()-i))) % 10) + str;
		}
		
		if(a.length() < b.length()) {
			str = b.substring(0, b.length() - a.length()) + str;
		} else if(b.length() < a.length()) {
			str = a.substring(0, a.length() - b.length()) + str;
		}		
		return str;
	}
}