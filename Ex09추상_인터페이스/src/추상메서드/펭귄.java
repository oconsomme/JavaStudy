package 추상메서드;

public class 펭귄 extends 조류{

	// abstract class를 상속받으면 
	// 그 안에 있는 abstract 메서드를 
	// 반드시 자식클래스에서 구현해줘야한다.
	// 구현하기 싫으면 자식 클래스도 abstract class가 되어야함.
	
	// + 이전과는 다르게 구현을 강제화
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("꿹");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("헤엄친다 어푸어푸");
	}
	
}
