package search_03;

import java.util.Scanner;
import java.util.Random;

public class example03_01 {
	
	static void show(int[] a) {
		System.out.println("[배열 요소 출력]");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");	
	}
	
	static boolean search(int[] a, int num) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소 갯수 : "); int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for(int i = 0; i<num; i++) {
			a[i] = rand.nextInt(10);
		}
		show(a);
		
		System.out.print("찾는수 : "); int n1 = sc.nextInt();

		
		
		System.out.println("배열 a에 " + n1 +"이 있나요?" );
		System.out.println(search(a,n1));

		
		
		

	}

}
