package testPjt;

// 메서드 오버라이드(override): 부모 클래스의 기능을 자식 클래스에서 재정의 해서 사용함
//		상위 클래스의 메소드(이름)를 하위 클래스에서 그대로 사용하되 보강할 내용을 추가로 수정하면 됨

public class MainClassPC {

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		childClass.childFun();
		childClass.parentFun();
		
//		childClass.privateFun(); 상속 중에서도 private는 이용할 수 없다.
//								 public은 사용가능
		
		childClass.makeJJajang();

	
	ParentClass[] pArr = new ParentClass[2];
	
	
	FristChildClass fch = new FristChildClass();
//	== ParentClass fch = new FirestChildClass(); 상속해주는 clss를 데이터 타입으로 사용가능
	SecondChildClass sch = new SecondChildClass();
//	== ParentClass sch = new SecondChildClass();
	
	pArr[0] = fch;
	pArr[1] = sch;
	
	ChildClass c = new ChildClass();
	c.getOpendYear();
	
	}

}
