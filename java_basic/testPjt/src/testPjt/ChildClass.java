package testPjt;

// 상속class
//ParentClass의 하위 클래스
//super: 상위 클래스를 호출할 때 사용


public class ChildClass extends ParentClass {
	
	int openYear = 2000;
	
	public ChildClass() {
		System.out.println("ChildClass constructor");
	}
	public void childFun( ) {
		System.out.println("childFun()");
		
	}
	
	@Override //이걸 써주면 상위클래스의 메소드를 재정의 했다는 것을 빠르게 알 수 있음
	public void makeJJajang() {
		System.out.println("-- more delicious makeJJajang() --");
	}
	
	public void getOpendYear() {
		System.out.println("ChildClass's Open Year : " + this.openYear);
		System.out.println("ParentClass's Open Year : " + super.openYear);
	}

}
