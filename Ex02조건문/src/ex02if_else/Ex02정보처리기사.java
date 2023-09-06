package ex02if_else;

import java.util.Scanner;

public class Ex02정보처리기사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int es = sc.nextInt();
		System.out.print("OS : ");
		int os = sc.nextInt();
		System.out.print("데이터통신 : ");
		int dc = sc.nextInt();
		System.out.print("소프트웨어공학 : ");
		int sw = sc.nextInt();
		
//		#
//		boolean isCheck1 = (db+es+os+dc+sw) >= 60;
//		boolean isCheck2 = (db >= 8 && es >= 8 && os >= 8 && dc >= 8 && sw >= 8);
//		if (isCheck1 && isCheck2) {
//			System.out.println("합격입니다!");
//		}else{
//			System.out.println("불합격입니다!");
//		}
//		#
		
		int sum = db+es+os+dc+sw;
		
		if (db >= 8 && es >= 8 && os >= 8 && dc >= 8 && sw >= 8 ) {
			if (sum >= 60) {
				System.out.println("합격입니다!");
			}
		}else {
			System.out.println("불합격입니다!");
		}
		
		sc.close();
	}
}
