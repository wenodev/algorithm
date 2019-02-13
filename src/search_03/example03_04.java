package search_03;

import java.util.Scanner;

public class example03_04 {
	
	static void show(int[] a) {
		System.out.println("[배열 요소 출력]");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");	
	}
	
	static boolean binary(int[] a, int num, int key) {
		int pl = 0;
		int pr = num - 1;
		
		while(pl<=pr){
			int pc = (pl+pr)/2;
			if(a[pc] == key) {
				return true;
			}else if(a[pc] < key) {
				pl = pc+1;
			}else {
				pr = pc-1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요수 수 : "); int num = sc.nextInt();
		
		int[] a = new int[num];
		
		System.out.println("[요소 값 입력]");
		for(int i = 0; i<num; i++) {
			System.out.print((i+1) + "번째 : "); 
			a[i] = sc.nextInt();
		}
		show(a);
		
		System.out.print("찾고 싶은 값 입력: "); int key = sc.nextInt();
		
		System.out.println(binary(a, num, key));
	}

}
