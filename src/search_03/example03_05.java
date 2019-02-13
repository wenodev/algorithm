package search_03;

import java.util.Scanner;
import java.util.Arrays;

public class example03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 입력 : "); int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print((i+1) + "번째 요소 입력: ");
			a[i] = sc.nextInt();
		}
		System.out.print("확인 값 : "); int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(a, key);
		if(idx<0) {
			System.out.println("삽입 포인트 : " + Math.abs(idx) +"번째");
		}else {
			System.out.println("원하는 값은 " + (idx+1) + "번째에 있습니다.");
		}
		
	}

}
