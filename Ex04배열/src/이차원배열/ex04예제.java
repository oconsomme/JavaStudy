package 이차원배열;

public class ex04예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[5][5];
		int num = 21;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][arr[0].length-1-j] = num;
				num++;
			}
		}
//		num = 21;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr[00].length-1; j >= 0; j--) {
//				arr[i][j] = num;
//				num++;
//			}
//		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
			
		}
	}
}
