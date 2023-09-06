package 일차원배열;

import java.util.Scanner;

public class ex05배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		// 2) 사용자가 입력한 5개의 점수들을 배열에 저장
		// 배열의 이름 : score
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번째 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		// 3) 입력된 점수들을 모두 출력하기
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+" ");
		}
		System.out.println();
		// 4) 최고 점수, 최저 점수
		int max = score[0];
		int min = score[0];
		int sum = 0;
		float avg = 0;
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
		} System.out.println("최고 점수 : "+max);
		
		for (int i = 1; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			}
		} System.out.println("최저 점수 : "+min);
		
		// 5) 총합, 평균 출력하기
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} System.out.println("합계 : "+sum);
		
		avg = sum/score.length;
		System.out.println("평균 : "+avg);
		
		sc.close();
	}
	

}
