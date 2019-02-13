package javabasic;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" " + "| ");
		for(int i = 1; i<=9; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println("-|--------------------");
		for(int i = 1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(" " + i*j);
			}
			System.out.println("");
		}
		
	}
 
}
