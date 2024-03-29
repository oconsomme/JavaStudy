package 상품관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		Product[] productList = new Product[5];
		
		while (true) {
			System.out.print("[1]물건추가 [2]예상 판매량 조회 [3]종료 >> ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.print("물건이름 : ");
				String name = sc.next();
				System.out.print("단가 : ");
				int unitPrice = sc.nextInt();
				System.out.print("수량 : ");
				int amount = sc.nextInt();
				Product p1 = new Product(name, unitPrice, amount);
				productList[i] = p1;
				i++;
			}
			else if (select == 2) {
				System.out.println("[제품명]\t단가\t수량");
				int sum = 0;
				for(int j = 0; j < i; j++) {
					sum += productList[j].getAmount()*productList[j].getUnitPrice();
					System.out.print("["+productList[j].getName()+"]\t" +
									 productList[j].getUnitPrice()+"\t"+
									 productList[j].getAmount()+"개");
					
					System.out.println();
				}
				System.out.println("판매 시 매출 : "+sum+"원");
				System.out.println();
			}
			else if (select == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
		
		sc.close();
	}

}
