package ex02연산자;

public class Ex07논리연산자 {

	public static void main(String[] args) {
		// 논리연산자 -> 결과가 true or false
		// NOT, AND, OR
		// NOT -> boolean 결과를 반대로 보여준다
		boolean isCheck1 = true;
		System.out.println(!isCheck1);
		
		// AND(그리고) -> 좌항의 결과와 우항의 결과가 TRUE일때만 결과가 TRUE, 아니면 전부 FALSE
		int num1 = 10;
		int num2 = 5;
		int num3 = 3;
		int num4 = 7;
		System.out.println((num1 > num2)&&(num3 > num4));
		System.out.println((num1 > num2)&&(num3 < num4));
		
		// OR -> 좌항 또는 우항의 결과가 TRUE이면 결과는 TRUE, 좌항과 우항 둘 다 FALSE면 FALSE
		System.out.println((num1 > num2)||(num3 > num4));
		System.out.println((num1 < num2)||(num3 > num4));
	}

}
