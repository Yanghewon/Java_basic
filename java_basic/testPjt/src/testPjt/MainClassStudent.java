package testPjt;

// 테이터 은닉

public class MainClassStudent {
	
	public static void main(String[] args) {
	
	Student student1 = new Student("홍길동", 90);
	student1.getInfo();
	
	student1.setScore(100);
	student1.getInfo();
	}
}
