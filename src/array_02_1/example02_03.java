package array_02_1;
//배열의 복제

public class example02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");

		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
