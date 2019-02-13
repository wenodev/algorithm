package stackandqueue_04;

import stackandqueue_04.IntStack.EmptyIntStackException;
import stackandqueue_04.IntStack.OverflowIntStackException;
import java.util.Scanner;

public class IntStack{
	private int max;
	private int ptr;
	private int[] stk;
	
	IntStack(int capacity){
		ptr = 0;
		max = capacity;
		stk = new int[max];
	}
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}		
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	
	public int push(int x) throws EmptyIntStackException {
		if(ptr>=max) {
			throw new EmptyIntStackException();
		}
		return stk[ptr++] = x;
	}
	public void pop() throws OverflowIntStackException {
		if(ptr <= 0) {
			throw new OverflowIntStackException();
		}
		ptr--;
	}
	public void show() {
		for(int i = 0; i<ptr; i++) {
			System.out.print(stk[i]+" ");
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 사이즈: "); int num = sc.nextInt();
		IntStack s = new IntStack(num);
		
		while(true) {
			int x;
			System.out.print("[1]푸시 [2]팝 [3]확인[4]종료: "); int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("push할 데이터: "); x = sc.nextInt();
				try {
					s.push(x);
				}catch(OverflowIntStackException e){
					System.out.println("스택이 다 찾습니다..");
				}
				break;
			case 2:
				try {
					s.pop();
				}catch(EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 3:
				s.show();
				break;
			}
			if(menu == 4) {
				System.out.println("프로그램 종료.");
				break;
			}
		}
	}
	
}






