package ex01단순if문;

import java.util.Scanner;

public class Ex02배수판별 {
	public static void main(String[] args) {
		
		// 정수를 입력받아 3의 배수이면서 5의 배수를 판별하는 알고리즘 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 여러줄 주석 -> 드래그 ctrl + /
		
		// 입력받은 수가 3의 배수이면서 5의 배수라면
		// 15 -> 15(은)는 3의 배수이면서 5의 배수입니다.
		if (num%3==0 && num%5==0) {
			System.out.println(num+"(은)는 3의 배수이면서 5의 배수입니다.");
		}
		
		sc.close();
	}
}
