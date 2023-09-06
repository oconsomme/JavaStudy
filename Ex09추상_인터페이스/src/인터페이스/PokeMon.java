package 인터페이스;

public interface PokeMon {
	
	// 모든 캐릭터는 공격과 특수공격을 할 수 있다.
	
	// 인터페이스 
	// : 프로젝트 지침서, 설계도
	
	// 1) 필드
	final String name = "조자연"; // 인터페이스 필드는 상수 형태로 선언 및 초기화 필수
	
	// 2) 메서드
	// 단, 메서드는 반드시 선언만되어 있어야한다.
	// 인터페이스는 일반 메서드를 포함할 수 없다.
	// 무조건 추상메서드만 포함할 수 있다.
	
	// 일반공격 : atk
	public abstract void atk();
	
	// 특수공격 : specialAtk
	public abstract void specialAtk();
	
	
	
}
