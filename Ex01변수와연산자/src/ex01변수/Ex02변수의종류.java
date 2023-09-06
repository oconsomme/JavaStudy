package ex01변수;

public class Ex02변수의종류 {
	public static void main(String[] args)
	// TODO Auto-generated method stub
	// main 안 만들었을때 tip : main 쓰고 ctrl+space
	{
		// JAVA 변수의 종류
		
		// 정수형 데이터 타입
		// byte - 1byte = bit x 8 (-128 ~ 0 ~ +127)
		byte num1 = 127;
		
		// short - 2byte
		short num2 = 5000;
		
		// int - 4byte(2**32);
		int num3 = 244444444;
		
		// long - 8byte
		long num4 = 3000000000L;
		
		// 실수형 데이터 타입
		// float - 4byte
		// float num5 = 14.3f;
		float num5 = (float)14.3;
		
		//double - 8byte
		double num6 = 3.14;
	
		// 논리형 데이터 타입
		// boolean - 1 bit or 1 byte
		boolean isCheck = true;
		
		// 문자형 데이터 타입
		// char - 2byte
		char text = 'A'; // ascii code : 65
		System.out.println(text+1);
		System.out.println((char)99);
		
		
	}
}
