package testPjt;

public class MainClassO {
	
	public static void main(String[] args) {
	
	ObjectClass obj1 = new ObjectClass();
	ObjectClass obj2 = new ObjectClass();
	ObjectClass obj3 = new ObjectClass();
	
	obj1.getInfo();
	obj1 = null; // 레퍼런스가 끊기게 됨(null은 객체 값을 없애기 때문)
//	obj1.getInfo(); 를 하게 되면 오류가 뜸(객체 값이 사라져 주소가 사라진 것은 아니고 존재함)
	
	obj2.getInfo(); // 객체가 각각 다른 주소를 가지고 있기 때문에 obj1 = null을 했더라도 obj2는 실행되는 것)
	
	System.out.println(" obj1 : " + obj1);
	System.out.println(" obj2 : " + obj2);
	System.out.println(" obj3 : " + obj3);
	
	// 똑같은 Class에서 객체를 생성하였지만 다 다른 주소를 가지고 있다
	
	
	if(obj1 == obj2) {
		System.out.println("obj1 == obj2");
	} else {
		System.out.println("obj1 != obj2");
	}
	
	if(obj2 == obj3) {
		System.out.println("obj2 == obj3");
	} else {
		System.out.println("obj2 != obj3");
	}

	if(obj1 == obj3) {
		System.out.println("obj1 == obj3");
	} else {
		System.out.println("obj1 != obj3");
	}
	// 각 객체는 다른 주소를 가지고 있기 때문에 모두 else구문으로 출력됨
	
	
	}
}
