package ex02연산자;

public class Ex04복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 대입연산자 -> =
		// 우측의 값을 왼쪽에 넣겠다
		
		// 복합대입연산자
		int a = 10;
		
		// 문제. 기존 a의 값에 10을 더 더해주고 싶다면 어떻게 해야할까?
		// a = a + 10;
		a += 10;
		a -= 5;
		a /= 5;
		a %= 3;
		System.out.println(a);
		
		// 복합대입연산자 우선순위
		int num = 29;
		num -= 2 + 3 * 4;
		// num = num - 2 + 3 * 4; (x)
		//	-> 우선순위 num = num - (2 + 3 * 4); (o)
		System.out.println(num);

	}

}
