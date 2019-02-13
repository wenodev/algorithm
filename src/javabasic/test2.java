package javabasic;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("##메뉴선택##");
		System.out.println("[1]구매자, [2]판매자");
		System.out.print("##메뉴를 선택하세요 ->");
		
		String sel = scan.next();
		
		if(sel.equals("1")) {
			System.out.println("구매자로 로그인 하셨습니다.");
		}else if(sel.equals("2")) {
			System.out.println("판매자로 로그인 하셨습니다.");
		}
	}
}

