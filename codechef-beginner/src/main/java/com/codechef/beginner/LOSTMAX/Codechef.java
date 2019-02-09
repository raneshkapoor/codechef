package com.codechef.beginner.LOSTMAX;

import java.util.Scanner;

class Codechef {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int T = sc.nextInt();
		
		String str;
		
		int max;
		int count;
		
		sc.nextLine();
		
		for(int i = 0;i < T;i++) {
			
			count = 0;
			max = 0;			
			str = sc.nextLine();
			
			for(String num: str.split(" ")) {				
				if(Integer.parseInt(num) >= max) {
					if(Integer.parseInt(num) != str.split(" ").length - 1) {
						max = Integer.parseInt(num);
					} else {
						count++;
					}					
				}
			}		
			
			if(count > 1 && max <= str.split(" ").length - 1) {
				max = str.split(" ").length - 1;
			}
			
			System.out.println(max);
			
		}
	}
}