package 일차원배열;

public class ex03배열예제 {

	public static void main(String[] args) {
		// 1) 정수형 데이터를 저장할 수 있는 arr 배열을 생성
		// 2) 문제에 적혀있는 값으로 초기화
		// 23, 45, 95, 17, 6, 89, 47, 56, 68, 17
		int[] arr = {23, 45, 95, 17, 6, 89, 47, 56, 68, 17};
		
		// 3) arr에 들어있는 값들 중에서 가장 큰 값을 찾아서 출력해보자
		int max = arr[0]; 
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			// max보다 값이 더 크면 max에 다시 값을 대입(재할당)
			if (arr[i] > max) {
				max = arr[i];
			}
		}System.out.println(max);
		
		// # bubble sort 
		
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] < arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println("bubble : "+arr[0]);
		
		// 4) arr에 들어있는 값들 중에서 가장 작은 값을 찾아서 출력해보자
		
		for (int i = 1; i < arr.length; i++) {
			// max보다 값이 더 크면 max에 다시 값을 대입(재할당)
			if (arr[i] < min) {
				min = arr[i];
			}
		}System.out.println(min);
		
		// # bubble sort 
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}System.out.println("bubble : "+arr[0]);
	}

}
