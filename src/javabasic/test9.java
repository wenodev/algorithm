package javabasic;

import java.util.Scanner;

public class test9 {
	
	static int mid3(int a, int b, int c) {
		if (a >= b) {
			if(b>=c) {
				return b;
			}
			else if(c >= a) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}
		else if(b>c){
			return c;
		}else {
			return b;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정를 입력 하시오.");
		System.out.print("a = "); int a = sc.nextInt();
		System.out.print("b = "); int b = sc.nextInt();
		System.out.print("c = "); int c = sc.nextInt();
		
		System.out.println("중앙값은? " + mid3(a,b,c));
		
	}

}
