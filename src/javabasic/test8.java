package javabasic;

public class test8 {
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}if (max < c) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( max3(3,10,8));
	}

}
