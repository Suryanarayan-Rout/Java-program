package com.surya_code.corejavapack;

public class AlternatePrime_Num {
	
	static boolean alterPrime(int a) {
		if(a<=1)return false;
		for(int i = 2; i <= a/2; i++) {
			if(a % i == 0)return false;
			else continue;
		}
		return true;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the lower range : ");
		int l = sc.nextInt();
		System.out.print("Enter the upper range : ");
		int u = sc.nextInt();
		int count = 0;
		for(int i = l; i<= u; i++) {
			if(alterPrime(i)) {
				count++;
				if(count % 2 == 0)System.out.println(i);
			}
		} 
	}
}
