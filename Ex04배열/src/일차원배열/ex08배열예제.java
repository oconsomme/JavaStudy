package 일차원배열;

import java.util.Scanner;

public class ex08배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===채점하기===");
		System.out.println("답을 입력하세요");
		int[] input = new int[5];
		int[] answer = {1,4,3,2,1};
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번답 >> ");
			input[i] = sc.nextInt();
		}
		System.out.println("정답확인");
		for (int i = 0; i < 5; i++) {
			if (input[i] == answer[i]) {
				System.out.print("O ");
				sum += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.print("총 점 : "+sum);
		sc.close();
	}

}
