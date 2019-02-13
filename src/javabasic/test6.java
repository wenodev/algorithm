package javabasic;

public class test6 {
	
	int n1 = 10;
	static int n2 = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6 t1 = new test6();
		test6 t2 = new test6();
		
		t1.n1 = 30;
		t2.n1 = 40;
		System.out.println(t1.n1 +" "+ t2.n1);
		
		t1.n2 = 50;
		t2.n2 = 60;
		System.out.println(t1.n2 + " " + t2.n2);

	}

}
