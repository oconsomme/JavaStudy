package ex01변수;

import java.util.Scanner;

public class Ex06키보드입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 입력을 받을 수 있는 변수 생성 (Scanner)
		Scanner sc = new Scanner(System.in);
		
		// 스캐너를 통해 정수를 입력받는 방법
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.printf("입력한 숫자는 -> %d", num);
		// System.out.println("입력한 숫자는 -> " + num);
		
		sc.close();
	}

}
