package ex03for;

import java.util.Scanner;

public class Ex03배수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		// 숫자를 입력받고 그 숫자의 배수 10개를 나타내게 하시오.
		for (int i = 1; i<=10; i++) {
			System.out.println(num*i);
		}
		sc.close();
	}

}
