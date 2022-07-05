package ConceptStudy;

public class Bicycle {
	
	public String color; //속성
	public int price;
	
	public Bicycle() {
		System.out.println("Bicycle sonctructor - I");
	}
	
	public Bicycle(String c, int p) {
		System.out.println("Bicycle sonctructor - II");
		color = c;
		price = p;
	}
	
	public void info() { // 객체의 정보 조회를 할 때 info사용
		System.out.println(" -- info() --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}

}
