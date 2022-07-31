package testPjt;

public class ObjectClassD {
	
	public int x;
	public int y;
	
	public ObjectClassD(String s, int[] iArr) {
		System.out.println(" -- ObjectClass() -- ");
		
		System.out.println("s ----> " + s);
		System.out.println("iArr ----> " + iArr);
		
	}
	
	public ObjectClassD(int x, int y) {
		
		this.x = x; // this는 지금 작업하는 객체를 가르킴
		this.y = y;
	}
	
	public void getInfo() {
		System.out.println("x ----> " + this.x); // 이렇게 사용도 가능
		System.out.println("y ----> " + y);
	}

}
