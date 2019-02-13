package javabasic;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pwd = 123456;
		int encPwd, decPwd;
		int key = 125365;
		
		System.out.println("암호환 전 비밀번호 : " + pwd);

		encPwd = pwd ^ key;
		System.out.println("암호화 후 비밀번호 : " + encPwd);
		
		decPwd = encPwd ^ key;
		System.out.println("복호화 후 비밀번호 : " + decPwd);
	}
}
