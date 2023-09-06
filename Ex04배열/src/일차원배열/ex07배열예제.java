package 일차원배열;

import java.util.Scanner;

public class ex07배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int star[] = new int[5];

		for(int i = 0; i < star.length; i++) {
			System.out.print((i+1)+"번째 별의 개수를 입력 >> ");
			int snum = sc.nextInt();
			star[i] = snum;
		}
		for(int i = 0; i < star.length; i++) {
			System.out.print(star[i]+" : ");
			for (int j = 0; j < star[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
