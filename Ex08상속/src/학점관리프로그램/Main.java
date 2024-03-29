package 학점관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("=========================학생 관리 프로그램=========================");
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		while(true) {
			System.out.print("[1]성적입력[2]전체조회[3]학생검색[4]프로그램 종료 >> ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학번 : ");
				String number = sc.next();
				System.out.print("Java점수 : ");
				int scoreJava = sc.nextInt();
				System.out.print("Web점수 : ");
				int scoreWeb = sc.nextInt();
				System.out.print("Android점수 : ");
				int scoreAndroid = sc.nextInt();
				Student s = new Student(name,number,scoreJava,scoreWeb,scoreAndroid);
				list.add(s);
				System.out.println();
				
			} else if (select == 2) {
				System.out.println("======================전체조회======================");
				System.out.println("이름\t학번\tJava\tAndroid\tWeb");
				if (list.size() == 0) {
					System.out.println("조회 할 데이터가 없습니다.");
				} else {
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName()+"\t"+list.get(i).getNumber()+"\t"
									 + list.get(i).getScoreJava()+"\t"+list.get(i).getScoreWeb()+"\t"
									 + list.get(i).getScoreAndroid());
					}
					
				}
				System.out.println("==================================================");
			} else if (select == 3) {
				System.out.print("검색할 이름 입력 : ");
				String searchName = sc.next();
				int j = 1;
				System.out.println("======================학생검색======================");
				for(int i = 0; i < list.size(); i++) {
					if (searchName.equals(list.get(i).getName())) {
						System.out.println(list.get(i).getName()+"\t"+list.get(i).getNumber()+"\t"
								 + list.get(i).getScoreJava()+"\t"+list.get(i).getScoreWeb()+"\t"
								 + list.get(i).getScoreAndroid());
					} else {
						j++;
						if (j > list.size()) {
						System.out.println("검색한 이름의 정보가 없습니다.");
						}
					}
				}
				System.out.println("==================================================");
			} else if (select == 4) {
				System.out.println("학점 관리 프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
		sc.close();
	}
	
}
