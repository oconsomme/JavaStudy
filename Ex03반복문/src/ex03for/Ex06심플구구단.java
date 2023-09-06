package ex03for;

public class Ex06심플구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(2+"단");
//		for(int i = 1; i<=9; i++) {
//			//System.out.println("2*"+i+"="+2*i);
//			System.out.printf("2x%d=%d",i,2*i);
//			System.out.println();
//		}
		
//		for(int i = 2; i<=9; i++) {
//			System.out.println("====="+i+"단"+"=====");
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"x"+j+"="+i*j);
//			}
//		}
		
		for(int i = 2; i<=9; i++) {
			System.out.print(+i+"단 : ");
			for(int j=1; j<=9; j++) {
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println("");
		}
		
	}

}

/*
 * package ex03for;

public class Ex06심플구구단 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

//      System.out.println(2 + "단");
//      for(int i = 1; i <= 9; i++) {
//         System.out.println(2 +"X" + i + "=" + 2 * i);
//      }

//      for(int k = 2; k <= 9; k++) {
//         //System.out.println(k + "단");
//         for(int i = 1; i <= 9; i++) {
//            System.out.println(k +"X" + i + "=" + k * i);
//         }
//      }
      
      for(int i = 2; i <= 9; i++) {
         System.out.print(i + "단 :\t");
         for(int j = 1; j <= 9; j++) {
            System.out.print(i + "X" + j + "=" + i * j + "\t");
         }
         System.out.println();
      }
      
      

   }

}*/
