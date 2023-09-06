package 일차원배열;

import java.util.Arrays;

public class ex02배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 배열 arr을 생성
		// 다음과 같은 값으로 초기화 하기
		// 3, 10, 4, 8, 17, 22, 31
		
		int [] arr = {3,10,4,8,17,22,31};
		// 1) arr 배열에 들어있는 값을 for문을 사용해서 한번에 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		// 2) arr 배열에 들어있는 값들 중에서 짝수만 출력하기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
		// 3) arr 배열에 들어있는 값들 중에서 가장 큰 수를 출력하기(선택)
		System.out.println(Arrays.stream(arr).max().getAsInt()); 
		
		// 배열안에 있는 값들에 하나하나 접근하면서
		// 서로 비교를 통해 큰 값이 출력되기 만들어 주자!
		
		//if (arr[0] > 기준값) {
		//	최대값 = arr[0];
		// }
		
		// 최대값이 들어갈 공간 : max
		int max = arr[0];
		// max = 0 : 만약에 배열에 들어가있는 모든 값들이 음수라면
		// 정확한 결과값을 받아볼 수가 없다!
		//	+ 배열안에 들어있는 값들로만 비교를 해야한다
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		} System.out.println(arr[0]);
	}

}
