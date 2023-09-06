package 학생정보관리프로그램;

public class Student {
	// 학생정보 관리프로그램에 대한 설계도
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	// private : 클래스 내부에 메서드를 통해서만 접근이 가능
	// getter/setter : 데이터의 무결성(정확성/일관성)
	// : setter ---> 지양
	
	public Student(String name, String number, int age, 
			int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	// 단축키 : alt + shift + s
	
	public void setStudent(String name, String number, int age, 
			int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ "+number +", "+age+"살 ]");
		System.out.println(name+"님의 Java점수는 "+scoreJava+"점 입니다.");
		System.out.println(name+"님의 Web점수는 "+scoreWeb+"점 입니다.");
		System.out.println(name+"님의 Android점수는 "+scoreAndroid+"점 입니다.");
		System.out.println("==================================================");
	}
	
	public Student() {
	}
}
