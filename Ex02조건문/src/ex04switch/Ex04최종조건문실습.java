package ex04switch;

import java.util.Scanner;

public class Ex04최종조건문실습 {

	public static void main(String[] args) {
		// 자판기 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int m = sc.nextInt();
		System.out.println("메뉴를 고르세요");
		System.out.print("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원) >> ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1: 
			if (m < 800) {
				System.out.println("돈이 부족합니다.");
				System.out.println("잔돈 : "+m);
			}
			int changeMoney1 = m-800;
			System.out.println("잔돈 : "+changeMoney1+"원");
			System.out.println("천원 : "+changeMoney1/1000+"개");
			System.out.println("오백원 : "+changeMoney1%1000/500+"개");
			System.out.println("백원 : "+changeMoney1%1000%500/100+"개");
			break;
		case 2: 
			if (m < 500) {
				System.out.println("돈이 부족합니다.");
				System.out.println("잔돈 : "+m);
			}
			int changeMoney2 = m-500;
			System.out.println("잔돈 : "+changeMoney2+"원");
			System.out.println("천원 : "+changeMoney2/1000+"개");
			System.out.println("오백원 : "+changeMoney2%1000/500+"개");
			System.out.println("백원 : "+changeMoney2%1000%500/100+"개");
			break;
		case 3: 
			if (m < 1500) {
				System.out.println("돈이 부족합니다.");
				System.out.println("잔돈 : "+m);
			}
			int changeMoney3 = m-1500;
			System.out.println("잔돈 : "+changeMoney3+"원");
			System.out.println("천원 : "+changeMoney3/1000+"개");
			System.out.println("오백원 : "+changeMoney3%1000/500+"개");
			System.out.println("백원 : "+changeMoney3%1000%500/100+"개");
			break;

		}
		sc.close();
	}

}
