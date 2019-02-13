package array_02_1;
//난수입력, 배열요소바꾸기, 배열 역순정렬

import java.util.Scanner;
import java.util.Random;

public class example02_06 {
	
	
	
	static void show(int[] a) {
		System.out.println("[배열 요소 출력]");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");

		
	}
	
	static void swap(int[] a, int n1, int n2) {
		int temp = a[n1];
		a[n1] = a[n2];
		a[n2] = temp;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i<a.length/2; i++) {
			swap(a, i, a.length-1-i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("몇개의 수를 생성하시겠습니까? ");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for(int i = 0; i<num; i++) {
			a[i] = rand.nextInt(100);
		}
		
		show(a);

		System.out.println("몇번과 몇번을 바꾸겠습니까?");
		System.out.print("첫번째 : "); int n1 = sc.nextInt();
		System.out.print("두번째 : "); int n2 = sc.nextInt();
		
		swap(a, n1-1, n2-1);
		show(a);

		System.out.println("Let's reverse!");
		reverse(a);
		show(a);
	}

}
