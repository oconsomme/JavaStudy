package 일차원배열;

import java.util.Scanner;

public class ex06배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 수박게임 Start! ====");
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
		
		// 2) 수, 박을 저장할 배열
		String[] arr= {"수", "박"};
		System.out.println();
		int num2 = sc.nextInt();
		for(int i = 0; i < num2; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[0]);
			} else {
				System.out.print(arr[1]);
			}
		}
		
		sc.close();
		
		
	}

}
