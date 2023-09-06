package ex01while;

import java.util.Scanner;

public class Ex03다이어트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goalWeight = sc.nextInt();
		
		int week = 1;
		
		// 여러개 똑같은 변수명을 한 번에 바꾸는 방법 : alt + shift + R
		
		while(weight > goalWeight) {
			System.out.print(week+"주차 감량 몸무게 : ");
			int loseWeight = sc.nextInt();
			weight-=loseWeight;
			week++;
		}
		System.out.println(weight+"kg 달성!! 축하합니다!");
		
		sc.close();

	}

}
