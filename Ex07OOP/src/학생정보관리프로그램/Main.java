package 학생정보관리프로그램;

public class Main {

	public static void main(String[] args) {
		// Student 클래스를 사용하는 곳
		Student student1 = new Student();
		Student student2 = new Student();
		student1.setStudent("나예호", "20200801", 20, 10, 80, 95);
		student2.setStudent("김운비", "20111003", 19, 90, 65, 30);
		student1.show();
		student2.show();
	}

}
