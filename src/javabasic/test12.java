package javabasic;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		do {
			System.out.print("1이상의 양의 정수를 입력하세요 : ");
			num = sc.nextInt();
		}while(num<=0);
		
		for(int n = 1; n<=num; n++) {
			sum += n;
		}
		
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
	}

}
