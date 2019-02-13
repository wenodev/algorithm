package array_02_1;
//배열요소 최대값 구하기

import java.util.Scanner;

public class example02_04 {
	
	static int max(int[] a) {
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구하시오");
		System.out.print("사람 수 입력: "); int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print(i + "번째 키 입력: ");
			height[i] = sc.nextInt();
//			System.out.println("");
		}
		
		System.out.println("가장 큰 키 = " + max(height));
	}

}
