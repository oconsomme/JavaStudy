package 이차원배열;

public class ex07예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		int num = 21;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i%2 != 0) {
					arr[i][arr[0].length-1-j] = num;
				}else {
				arr[i][j] = num;
				}
				num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
			
		}
		
	}

}
