package ex03다중if_else;

import java.util.Scanner;

public class Ex02학점판별기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		if (grade >= 90) {
			System.out.println("A학점입니다.");
		}else if(80 >= grade) {
			System.out.println("B학점입니다.");
		}else if(70 >= grade) {
			System.out.println("C학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		
		sc.close();
	}	
	
}