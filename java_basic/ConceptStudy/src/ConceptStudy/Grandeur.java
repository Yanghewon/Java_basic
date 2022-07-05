package ConceptStudy;

public class Grandeur {
	
	public String color; // 클래스의 속성
	public String gear;
	public int price; // 가격은 숫자이기 때문에 int사용
	
	public Grandeur() { // 생성자
		System.out.println("Concept constructor");
	}
	
	public void run() { // 기능(public 접근, void 제한)
		System.out.println("--run()--");
	}
	
	public void stop() { // 기능(public 접근, void 제한)
		System.out.println("--stop()--");
	}
	
	public void info() { // 기능(public 접근, void 제한)
		System.out.println("-- info() --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
		System.out.println("gear : " + gear);
	}

}
