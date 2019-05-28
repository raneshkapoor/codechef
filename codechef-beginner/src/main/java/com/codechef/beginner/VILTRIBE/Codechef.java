package com.codechef.beginner.VILTRIBE;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		int T = sc.nextInt();
		sc.nextLine();
		
		String str = "";
		
		for(int i = 0;i < T;i++) {
			
			str = sc.nextLine();
			
			int countA = 0;
			int countB = 0;
			int empty = 0;
			char emptyType = 'X';
			
			for(int j = 0;j < str.length();j++) {				
				switch(str.charAt(j)) {
				
				case 'A' :
					countA++;
					if(empty > 0 && emptyType == 'A') {
						countA += empty;
					}		
					empty = 0;
					emptyType = 'A';
					break;
				case 'B' :
					countB++;					
					if(empty > 0 && emptyType == 'B') {
						countB += empty;
					}		
					empty = 0;
					emptyType = 'B';
					break;
				case '.' :
					if(emptyType != 'X')
						empty++;					
					break;
				}				
			}
			
			System.out.println(countA + " " + countB);
			
		}
	}

}
