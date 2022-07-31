package testPjt;

// 데이터 은닉

public class Student {
	
	private String name;
	private int score;
	
	public Student(String n, int s) {
		name = n;
		score = s;
	}
	
	public void getInfo() {
		System.out.println(" -- getInfo -- ");
		System.out.println(" name " + name);
		System.out.println(" score " + score);
	}
	
// 마우스 오른쪽 버튼눌러 source항목에 getters and setters 항목에서 가져옴(자동완성 기능)
// private를 통해 고정시켜 놓은 값을 수정하고 싶을 때 사용
// 웹사이트에 아이디를 고정하는 것처럼 바뀌면 안 되는 값을 private로 고정하는 것
	
	public String getName() {
		return name;
	}

// name값은 고정하고 싶으면 제거하면 됨
//	public void setName(String name) {
//		this.name = name;

	public int getScore() {
		return score;
	}

// score값이 50 이상일 때만 값을 수정할 수 있다(사람이 실수하는 안전장치)
	public void setScore(int score) {
		if(score > 50) this.score = score;
	}
	
	
	
	
	

}
