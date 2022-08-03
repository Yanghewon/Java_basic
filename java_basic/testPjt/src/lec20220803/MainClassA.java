package lec20220803;

//클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)로 만들어 놓고, 이것을 상속해서 사용
//abstract 클래스의 특징
//멤버변수를 가진다.
//abstract 클래스를 상속하기 위해서는 extends를 이용한다.
//abstract 메서드를 가지며, 상속한 클래스에서 반드시 구현해야한다.
//일반 메서드도 가질 수 있다.
//일반 클래스와 마찬가지로 생성자도 있다.


public class MainClassA {
	
	public static void main(String[] args) {
		
		AbstractClassEx ex = new ClassEx(10, "java");
		ex.fun1();
		ex.fun2();
		
	}

}
