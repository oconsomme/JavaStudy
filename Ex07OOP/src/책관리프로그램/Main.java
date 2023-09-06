package 책관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 객체 배열
		Scanner sc = new Scanner(System.in);
		
		// vo --> Value Object
		// 자료형[] 레퍼런스변수명 = new 자료형[배열의크기];
		// BookData 자료형을 가진 변수들만 저장할 수 있다.
		BookData[] bookList = new BookData[5];
		// b1은 BookData 자료형을 가진 상태
		BookData b1 = new BookData("Java", 21000, "홍길동");
		BookData b2 = new BookData("C++", 29000, "박문수");
		BookData b3 = new BookData("Database", 31000, "김장독");
		BookData b4 = new BookData("Android", 18000, "이순신");
		BookData b5 = new BookData("Web", 26000, "김철수");
		
		bookList[0] = b1;
		bookList[1] = b2;
		bookList[2] = b3;
		bookList[3] = b4;
		bookList[4] = b5;
		
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		System.out.println("<< 구매 가능한 책 목록 >>");
		for (int i = 0; i < 5; i++) {
			if (bookList[i].getPrice() <= money) {
				System.out.print("["+bookList[i].getTitle()+"/");
				System.out.print(bookList[i].getPrice()+"/");
				System.out.println(bookList[i].getWriter()+"]");
			}
		}
		
		// bookList[0] = b1;
		// b1 출력하기
		// System.out.println(bookList[0]);
		// bookList[0] == b1
		// b1.getTitle()
		// bookList[0].getTitle()
		// System.out.println(bookList[0].getTitle());
		sc.close();
	}

}
