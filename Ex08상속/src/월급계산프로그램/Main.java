package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
	      // 1. Regular 객체 생성하기
	      RegularEmployee regular
	      = new RegularEmployee("SMHRD001", "김미희", 4000, 400);
	      System.out.println(regular.print());
	      
	      // 2. TempEmployee 객체 생성하기
	      TempEmployee temp 
	      = new TempEmployee("SMHRD002", "박문수", 3000);
	      System.out.println(temp.print());
	      
	      // 3. PartTime
	      PartTimeEmployee part
	      = new PartTimeEmployee("SMHRD001", "홍길동", 10, 10);
	      System.out.println(part.print());
	      
	      // Employee를 객체로 생성하자
	      // Employee emp = new Employee("SMHRD004", "조자연", 500);

	}

}
