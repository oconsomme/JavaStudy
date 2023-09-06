package ex01변수;

public class Ex03변수실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 변수 num1에 10을 넣기
		// int num1 = 10;
		int num1; // 선언
		num1 = 10; // 할당
		num1 = 100;
		// 변수의 특징 - 변수에 새로운 값을 할당하는 순간 이전의 값은 사라진다.
		System.out.println(num1);
		
		int myAge = 23;
		int yourAge = 30;
		
		/*
		int tmp = myAge;
		myAge = yourAge;
		yourAge = tmp;
		*/
		
		System.out.println("나의 나이 : " + myAge);
		System.out.println("짝꿍의 나이 : " + yourAge);
		// 자동정렬 : ctrl + shift + F키 
	}

}
