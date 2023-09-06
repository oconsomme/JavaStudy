package 학점관리프로그램;

public class Student {
	private String name;
	private String number;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public Student(String name, String number, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	
	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
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
	
}
