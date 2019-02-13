package javabasic;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10 이상의 양의 정수 입력 : "); int num = sc.nextInt();
		
		if(num/10 < 10) {
			System.out.println(num + "은 2자리수 입니다.");
		}else if (num/10 >= 10 && num/10 <100) {
			System.out.println(num + "은 3자리수 입니다.");
		}else if (num/10 >= 100 && num/10 <1000) {
			System.out.println(num + "은 4자리수 입니다.");
		}else {
			System.out.println(num + "은 5자리수 이상입니다.");
		}
		

	}

}
