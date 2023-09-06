package 일차원배열;

import java.util.Scanner;

public class ex04입력배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자가 입력한 값으로 배열을 초기화
		// 1번 숫자 : 
		// 2번 숫자:
		// ...
		// 6번 숫자 : 
		
		// 1) 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		// +tip
		// in이라는 키워드는 Console창에 입력할 수 있도록 도와줌

		// 정수형, 배열의 크기 : 6
		int[] number = new int[6];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print((i+1)+"번 숫자 : ");
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
		System.out.println(number[i]);
		}
		
		sc.close();
	}

}
