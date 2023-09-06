package member;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		// DAO 클래스 안에 있는 메소드를 사용하기 위해 객체 생성
		MemberDAO dao = new MemberDAO();
		
		Scanner sc = new Scanner(System.in);
		// CRUD -> Create/Read/Update/Delete -> 어떠한 프로그램이든 기본적으로 존재해야하는 기능들
		
		while(true) {
			System.out.print("1.회원가입 2.로그인 3.회원목록 4.회원정보수정 5.회원탈퇴 6.종료 >> ");
			int menu = sc.nextInt();
		
			if (menu == 1) {
				System.out.println("=======회원가입=======");
				// 아이디, 비밀번호, 닉네임
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.print("닉네임 입력 : ");
				String nick= sc.next();
				
				int cnt = dao.join(id, pw, nick);
				
				if (cnt > 0) {
						System.out.println("회원가입 성공!");
					}else {
						System.out.println("회원가입 실패");
					}
							
			}else if (menu == 2) { 
								
				System.out.print("아이디 >> ");
				String id = sc.next();
				System.out.print("비밀번호 >> ");
				String pw = sc.next();
				
				MemberVO info = dao.login(id,pw);
				if(info != null)
					System.out.println(info.getNick()+"님 환영합니다!");
				else
					System.out.println("로그인 실패");
			
				
			}else if (menu == 3) {
				
				// 전체 회원의 정보가 보여지게 만들자
				// 아이디		비밀번호		닉네임
				// --------------------------
				//  a		  a			  a
				//  b		  b 		  b
				
				// DAO에 있는 기능을 가져다가 사용
				dao.select();
				
				
			}else if (menu == 4) {
				
				// 회원정보 수정
				// 사용자로부터 아이디를 입력받아서 비밀번호를 바꿈
				System.out.print("비밀번호를 바꾸고 싶은 아이디 입력 >> ");
				String id = sc.next();
				
				System.out.print("비밀번호 재설정>> ");
				String newPw = sc.next();
				
				int cnt = dao.update(id, newPw);
				
				if (cnt > 0) {
						System.out.println("비밀번호 변경 성공!");
					}else {
						System.out.println("비밀번호 변경 실패");
					}
				
			}else if (menu == 5) {
						
				// 사용자에게서 아이디랑 비밀번호를 입력받아서
				// 해당 아이디와 비밀번호가 있으면 테이블에서 정보 삭제
				System.out.print("회원 탈퇴 아이디 >> ");
				String id = sc.next();
				System.out.print("회원 탈퇴 비밀번호 >> ");
				String pw = sc.next();
			
				int cnt = dao.delete(id, pw);
			
				if (cnt > 0) 
						System.out.println("회원탈퇴성공");
					
				else {
						System.out.println("회원탈퇴실패");
					}			
				
			}else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}

}
