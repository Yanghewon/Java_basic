package lec20220803;

// interface
// implement(실행)하는 class
// interface(interface만으로는 사용 불가)는 implement하는 class에서 구현할 수 있다
// 사용하는 인터페이스의 메소드를 모두 구현해야한다

public class Interfaceclass implements InterfaceA, InterfaceB {

	public Interfaceclass() {
		System.out.println(" -- Interfaceclass constructor -- ");
	}
	
	@Override // 인터페이스의 구현
	public void funA() {
		System.out.println(" -- funA() -- ");
		
		
	}
	
	@Override // 인터페이스의 구현
	public void funB() {
		System.out.println(" -- funB() -- ");
		
		
	}

	

}
