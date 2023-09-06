package 게임만들기;

import java.util.Random;

public class PlusGame implements OperatorGame{
	
	int num1 = 0;
	int num2 = 0;

	@Override
	public int random() {
		Random rd = new Random();
		int num = rd.nextInt(10)+1;
		
		return num;
	}

	@Override
	public String getQuizMsg() {

		num1 = random(); // 5
		num2 = random(); // 3
		
		return num1 + " + " + num2 + " = "; // 문제 출제
	}

	@Override
	public boolean checkAnswer(int ans) {

		if(ans == (num1 + num2)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	// extends -> 상속 받는 키워드
	// abstract -> 추상화에 대한 키워드
	// implements -> 인터페이스 구현에 대힌 키워드
	
	// 인터페이스가 가지고 있는 게임이라면 꼭 필요한 기능들을
	// 만들고자 하는 게임 컨셉에 맞추어 완벽하게 구현!
	
	

}
