package testPjt;

// Object class(최상위 class)
// 예를 들어 ParentClass는 어느 누구의 상속도 받고 있지 않지만 상속관계를 확인해 보면 최상위 클래스인 Object가 존재함
// class 이름을 클릭하고 ctrl + t를 하면 상속관계가 나옴
// 상속class
// super: 상위 클래스를 호출할 때 super 키워드를 이용
// this: super와 다르게 본인 class의 객체를 호출할 때 좀더 명확하게 하고자 사용

public class ParentClass {
	
	int openYear = 1995;
	
	public ParentClass() {
		System.out.println("ParentClass constructor");
	}
	
	public void parentFun( ) {
		System.out.println("parentFun()");
		
	}
	
	private void privateFun() {
		System.out.println("privateFun()");
	}
	
	public void makeJJajang() {
		System.out.println("-- makeJJajang() --"); // ChildClass에서 재정의 할 메소드
	}
	
	public void jjamppong() {
		System.out.println("-- jjamppong() START --");
	}


}
