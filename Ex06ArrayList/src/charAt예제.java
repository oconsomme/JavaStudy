
public class charAt예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMiddle("power");
	}
	public static void getMiddle(String str) {
		int num = str.length()/2;
		if (str.length() % 2 == 1) {
			System.out.println(String.valueOf(str.charAt(num)));
		}
		else {
			System.out.println(String.valueOf(str.charAt(num-1))+String.valueOf(str.charAt(num)));
		}
	}

}
