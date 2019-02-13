package javabasic;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		System.out.print("정수입력: "); int num = sc.nextInt();
		
		
		for(int i = 1; i<=num; i++) {
			sum += i;
		}
		System.out.println("정수의 합 = " + sum);
	}

}
