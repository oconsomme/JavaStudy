package ex02do_while;

import java.util.Random;
import java.util.Scanner;

public class Ex04PlusGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 난수를 뽑는 방법
		
		// 틀렸을때는 기존 문제를
		// 성공했을때는 새로운 문제를 출력
		// 첫 게임을 시작할때는 3개의 목숨이 주어진다
		// 문제의 답을 틀렸을때는 목숨을 하나씩 차감하며
		// 클라이언트에게 알려준다.
		// 정답 맞출때마다 카운트를 한다
		// 마지막 게임 종료시 최종 맞춘 개수를 보여준다.
		// 정답횟수 : 00개
		Random rd = new Random();
		System.out.println("=====Plus Game=====");
		int num1 = rd.nextInt(10) + 1;
		int num2 = rd.nextInt(10) + 1;
		int cnt = 3;
		int cnt2 = 0;
		
		while(cnt > 0) {
			
			System.out.print(num1 + "+" + num2 + "=");
			int inputNum = sc.nextInt();
			
			// 정답확인
			int answer = num1 + num2;
			if (inputNum == answer) {
				System.out.println("Success!!!!");
				cnt2++;
				num1 = rd.nextInt(10) + 1;
				num2 = rd.nextInt(10) + 1;
				
			} else {
				System.out.println("Fail");
				cnt--;
			}
		}
		System.out.println("게임종료");
		System.out.println("정답횟수 : "+cnt2+"개");
		
		sc.close();
	}

}
