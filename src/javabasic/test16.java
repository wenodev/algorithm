package javabasic;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : "); int dan = sc.nextInt();
		
		for(int i = 0; i<dan; i++) {
			for(int j = 0; j<dan; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		

	}

}
