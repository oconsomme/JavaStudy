import java.util.ArrayList;
import java.util.Scanner;

public class ex02뮤직플레이어 {

	public static void main(String[] args) {
		// 노래 리스트가 저장될 ArrayList 만들기 : musicList
		ArrayList<String> musicList = new ArrayList<>();
		// "가수이름 - 노래제목" : String
		// 입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 보여지는 화면 구현
		while (true) {
			
			System.out.print("[1]노래조회 [2]노래추가 [3]노래삭제 [4]종료 >> ");
			// 숫자 입력받기 : select
			int select = sc.nextInt();
			
			// 1 ---> ArrayList에 데이터가 있으면 재생목록을 보여주기
			//	 ---> 데이터가 없으면 "재생 목록이 없습니다."
			if (select == 1) {
				System.out.println("=====현재 재생 목록=====");
				if (musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					for (int i = 0; i < musicList.size(); i++) {
					System.out.println((i+1)+". "+musicList.get(i));
					}
				}
				
				System.out.println("====================");
			}
			
			// 2 ---> 마지막 위치에 추가
			//   ---> 원하는 위치에 추가
			else if(select == 2) {
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				int select2 = sc.nextInt();
				if (select2 == 1) {
					System.out.print("추가할 노래 입력 >> ");
					String song = sc.next();
					musicList.add(song);
				}
				else if (select2 == 2) {
					
					System.out.print("추가할 노래 입력 >> ");
					String song = sc.next();
					System.out.print("추가할 위치 입력 >> ");
					int location = sc.nextInt();
					musicList.add(location-1, song);
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			
			else if(select == 3) {
				if (musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				} else {
					for (int i = 0; i < musicList.size(); i++) {
						System.out.println((i+1)+". "+musicList.get(i));
					}
					System.out.println("====================");
					System.out.print("[1]선택삭제 [2]전체삭제 >> ");
					int select3 = sc.nextInt();
					if (select3 == 1) {
						System.out.print("삭제할 노래 선택 >> ");
						int index = sc.nextInt();
						musicList.remove(index-1);
						System.out.println("노래가 삭제되었습니다.");
					}
					else if(select3 == 2) {
						musicList.clear();
					}
					else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
			}
			else if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		sc.close();
		
	}
	
	public static void search(ArrayList<String> musicList) {
		System.out.println("=====현재 재생 목록=====");
		if (musicList.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (int i = 0; i < musicList.size(); i++) {
			System.out.println((i+1)+". "+musicList.get(i));
			}
		}
		
		System.out.println("====================");
	}
	

}
