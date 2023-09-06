package ex02연산자;

import java.util.Scanner;

public class Ex09삼항연산자홀짝판별 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = num%2 == 0 ? "짝수" : "홀수";
		System.out.println(num+"는(은) "+result+"입니다.");
		
		sc.close();
	}

}
