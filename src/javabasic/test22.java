package javabasic;

import java.util.Scanner;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단? "); int dan = sc.nextInt();
		for(int i=dan; i>=1; i--) {
			for(int k = 5; k>i; k-- ) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}