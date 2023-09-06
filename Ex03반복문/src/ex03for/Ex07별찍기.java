package ex03for;

public class Ex07별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.공포의 별찍기 1탄
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		}
		
		// 2.공포의 별찍기 2탄
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= i; j--) {
//				System.out.print("*");
//		}
//		System.out.println();
//		}
		
//	    for(int i = 5; i >= 1; i--) {
//	         for(int j = 1; j <= i; j++) {
//	            System.out.print("★");
//	         }
//	         System.out.println();
//	      }
		
		// 3.공포의 별찍기 3탄
	    for(int i = 1; i <= 5; i++) {
	         for(int j = 5; j >= i; j--) {	
	        	 System.out.print(" ");
	         }
	         for (int k = 1; k <= i; k++) {
	 			System.out.print("★");
	         }
	         System.out.println();
	      }
	    
//	    for(int i = 1; i <= 5; i++) {
//	         for(int j = 5; j <= 5 + 1 - i; j--) {	
//	        	 System.out.print(" ");
//	         }
//	         for (int k = 1; k <= i; k++) {
//	 			System.out.print("★");
//	         }
//	         System.out.println();
//	      }

	}

}
