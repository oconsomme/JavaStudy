package ex02do_while;

import java.util.Scanner;

public class Ex02합계와평균 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int num = 0;
		float sum = 0;
		float avg = 0;
		int i;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			sum += num;
			count++;
		}while(num <= 100);
		sum -= num;
		count--;
		avg = sum/count;
		i = (int)sum;
		/*
		 * do{
		 * 	System.out.println("숫자를 입력하세요 : ");
		 * 	int num = sc.nextInt();
		 * 
		 * 	if (num > 100){
		 * 		break;
		 * 	}
		 * 	
		 * 	sum += num;
		 * 	cnt++;
		 * } while(true);
		 * 
		 *  System.out.println("합계 : " + sum);
		 * 	double temp1 = (double)sum / cnt;
		 * 	int temp2 = (int) (temp1*100);
		 * 	double result = temp / 100.0;
		 *	System.out.printf("평균 : " + (double)sum / cnt);
		 */
		System.out.println("합계 : "+i);
		System.out.printf("평균 : %.2f", avg);
		sc.close();
	}

}
