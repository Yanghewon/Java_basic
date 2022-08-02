package testPjt;

public class SecondChildClass extends ParentClass {
	
	public SecondChildClass() {
		System.out.println("SecondChildClass constructor");
	}
	
	@Override //이걸 써주면 상위클래스의 메소드를 재정의 했다는 것을 빠르게 알 수 있음
	public void makeJJajang() {
		System.out.println("-- more delicious makeJJajang() --");
	}


}
