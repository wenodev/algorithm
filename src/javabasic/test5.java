package javabasic;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone = {"samsung", "lg", "apple"};
		
		for( int i=0; i<phone.length; i++) {
			System.out.println(phone[i]);
		}
		
		System.out.println("------------------");
		
		for(String s : phone) {
			System.out.println(s);
		}
	}

}
