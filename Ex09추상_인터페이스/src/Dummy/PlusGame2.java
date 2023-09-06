package Dummy;

import java.util.Random;

public class PlusGame2 implements GameRule{
	
	int[] numArr = new int[10];
	int[] addNumArr = new int[5];
	String[] addArr = {"+", "-","*","%"};
	String QuizMsg;
	
	@Override
	public int random() {
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			numArr[i] = rand.nextInt(1, 11);
		}
		
		for (int j = 0; j < 5; j++) {
			addNumArr[j] = rand.nextInt(0,4);
		}
		
		return 0;
	}

	@Override
	public String getQuizMsg() {

		//		String[] arr = {"+", "-","*","%"};
//		for (int i = 0; i < 4; i++) {
//		
//		}
		for (int i = 0; i < 5; i++) {
			//for (int j = 0; j < 9; j++) {
				random();
				QuizMsg = (numArr[i]+addArr[addNumArr[i]]+numArr[9-i]+" = ");
				System.out.println();
			//}
		}
		return QuizMsg;
	}

	@Override
	public boolean checkAnswer(int ans) {
		for (int i = 0; i < 5; i++) {
			//for (int j = 0; j < 9; j++) {
			if (addNumArr[i] == 0) {
				if (numArr[i]+numArr[9-i] == ans) {
					return true;
				} else {
					return false;
				}
			}
			else if (addNumArr[i] == 1) {
				if (numArr[i]-numArr[9-i] == ans) {
					return true;
				} else {
					return false;
				}
			}
			else if (addNumArr[i] == 2) {
				if (numArr[i]*numArr[9-i] == ans) {
					return true;
				} else {
					return false;
				}
			}
			else if (addNumArr[i] == 3) {
				if (numArr[i]/numArr[9-i] == ans) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}	
		}
		return false;		
	}

}
