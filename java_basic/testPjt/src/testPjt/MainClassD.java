package testPjt;

public class MainClassD {
	
	public static void main(String[] args) {
		
		int[] iArr = {10, 20, 30};
		ObjectClassD obj1 = new ObjectClassD("Hello", iArr); // 배열은 객체이기 때문에 그 객체의 주소가 출력됨
		
		ObjectClassD obj2 = new ObjectClassD(10, 20);
		
		obj2.getInfo();
		
		
		
	}

}
