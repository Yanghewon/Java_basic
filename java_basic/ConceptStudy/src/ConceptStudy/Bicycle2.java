package ConceptStudy;

public class Bicycle2 {
	
	public String color; //속성
	public int price;
	
	public Bicycle2(String c, int p) {
		System.out.println("Bicycle2 sonctructor - II");
		color = c;
		price = p;
	}
	
	public void info() { // 객체의 정보 조회를 할 때 info사용
		System.out.println(" -- info() --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
