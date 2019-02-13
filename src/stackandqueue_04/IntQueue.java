package stackandqueue_04;

import java.util.Scanner;

public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] queue;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	IntQueue(int capacity){
		max = capacity;
		front = rear = num = 0;
		queue = new int[max];
	}
	
	public void enqueue(int x) throws OverflowIntQueueException{
		if(num >= max) {
			throw new OverflowIntQueueException();
		}
		queue[rear++] = x;
		num++;
		if(rear==max) rear = 0;
	}
	
	public void dequeue() throws EmptyIntQueueException{
		if(num <= 0) throw new EmptyIntQueueException();
		front++;
		num--;
		if(front==max) front = 0;
	}
	
	public void show() {
		for(int i = 0; i<num; i++) {
			System.out.print(queue[i+front%max] + " ");
		}
		System.out.println("");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("큐 데이터 크기 : "); int size = sc.nextInt();
		IntQueue que = new IntQueue(size);
		
		while(true) {
			System.out.print("[1]삽입 [2]삭제[3]확인 [4]종료 : "); int menu = sc.nextInt();
			int x;
			switch(menu) {
			case 1:
				System.out.print("입력할 데이터: "); x = sc.nextInt();
				que.enqueue(x);
				break;
			case 2:
				que.dequeue();
				break;
			case 3:
				que.show();
				break;
			}
			if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}	
		}
	}
}
