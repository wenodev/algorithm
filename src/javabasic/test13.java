package javabasic;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값 입력 : "); int a = sc.nextInt();
		
		int b=0;
		do {
			System.out.print("b의 값 입력 : "); 
			b = sc.nextInt();
			if(b<=a) {
				System.out.println("a보다 큰 값을 입력하세요");
			}
		}while(b<=a);
		
		System.out.printf("b-a의 값은 = %d", b-a);
	}

}
