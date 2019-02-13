package search_03;

import java.util.Scanner;
import java.util.Arrays;

public class example03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] marvel = {"captain","hulk","ironman","black"};
		
		System.out.print("키워드 입력: "); String key = sc.next();
		
		int idx = Arrays.binarySearch(marvel, key);
		
		if(idx<0) {
			System.out.println("잘못입력");
		}else {
			System.out.println("있습니다.");
		}
	}

}
