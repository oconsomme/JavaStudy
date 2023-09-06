
public class ex07메서드예제 {

	public static void main(String[] args) {
		// 완전수 구하기
		// : 나를 제외한 약수의 합이 나와 같은 수 
		// 6의 약수 : 1 + 2 + 3 == 6
//		
//		// 1단계) 약수인지 아닌지 확인해주는 메서드 만들기
//		int num1 = 10;
//		int num2 = 2;
//		boolean divisor = isDivisor(num1, num2);
//		System.out.println(divisor);
//		// 2단계) 
//		getDivisor(10);
//		getDivisor(16);
//		getDivisor(124);
//		
//		// 3단계) 약수의 합을 구해주는 메서드 getSumOfDivisors()
//		int num = 10;
//		int result = getSumOfDivisors(num);
//		
//		System.out.println(num+"의 약수의 합 : "+result);
//		getDivisor(num);
//		
//		// 4단계) 완전수인지 아닌지를 판단해주는 메서드 isPerfectNumber
//		int num3 = 369;
//		boolean result2 = isPerfectNumber(num3);
//		System.out.println("완전수인가요? : "+result2);
		
		// 5단계)
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}
	
	// 1. isDivisor() : 약수인지 아닌지 판단해서 true/false를 돌려주는 메서드
	public static boolean isDivisor(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (isDivisor(num,i)) {
				// isDivisor : num1을 num2로 나눴을때 나누어 떨어지는가?
				// if문 조건식 : num을 i로 나눴을때 나누어 떨어지는가?
				
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static int getSumOfDivisors(int num){
		int sum = 0;
		for(int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum+num;
	}
	public static boolean isPerfectNumber(int num3) {
		if (getSumOfDivisors(num3)-num3 == num3) {
			return true;
		} else {
			return false;
		}
		
	}
	public static void getPerfectNumber(int startValue, int endValue) {
		System.out.print(startValue+"~"+endValue+"까지의 완전수 : ");
		for (int i = startValue; i <= endValue; i++) {
			if (isPerfectNumber(i)) {
			System.out.print(i+" ");
			}
		}
	}


}
