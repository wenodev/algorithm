package javabasic;

import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단? "); int dan = sc.nextInt();
		for(int i=1; i<dan+1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
