package ex02연산자;

import java.util.Scanner;

public class Ex02산술연산자실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3자리 숫자를 입력받아 십의자리 이하의 값을 다 버리기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 >> ");
		int num = sc.nextInt();
		// 1. 몫
		int result = (num / 100) * 100;
		// 2. 나머지
		// int result = num - num % 100;
		// 3. 변칙
		// String result = num / 100 + "00";
		System.out.print("결과확인 >> " + result);
		
		sc.close();
	}

}
