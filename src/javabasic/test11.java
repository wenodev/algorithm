package javabasic;

import java.util.Scanner;

public class test11 {

	static int sumof(int a, int b) {
		int sum = 0;
		int len = b-a+1;
		for(int i=0; i<len; i++) {
			sum += a;
			a++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: "); int a = sc.nextInt();
		System.out.print("두번째 정수 입력: "); int b = sc.nextInt();
		System.out.println(sumof(a,b));
	}
}
