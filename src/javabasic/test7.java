package javabasic;

import java.util.Scanner;

public abstract class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3개의 수를 입력하시오");
		System.out.print("a ="); int a = scan.nextInt();
		System.out.print("b ="); int b = scan.nextInt();
		System.out.print("c ="); int c = scan.nextInt();
		
		int max = a;
		
		if(a<b) {
			max = b;
		}else if (b<c) {
			max = c;
		}
		System.out.printf("최대값은? %d 이다", max);
	}
}
