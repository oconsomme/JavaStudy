package 월급계산프로그램;

public class TempEmployee extends Employee {
//	
//	String empno;
//	String name;
//	int pay;
	
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	@Override
	public int getMoneyPay() {
		return pay/12;
	}

//	public String print() {
//	      return empno+" : "+name+" : "+pay;
//	   }
	
	
}
