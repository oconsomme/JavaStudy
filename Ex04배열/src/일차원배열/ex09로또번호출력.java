package 일차원배열;

import java.util.Random;
import java.util.Scanner;

public class ex09로또번호출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 로또번호 출력하는데 단, 중복 값이 없어야한다!
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("=====로또타임=====");
		int[] arr = new int[5];
		System.out.println("이번주 출력번호는요...!! 두구두구두구!!!!");
		
		for (int i = 0; i < 5; i++) {
			arr[i] = rand.nextInt(1,11);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();

	}

}
