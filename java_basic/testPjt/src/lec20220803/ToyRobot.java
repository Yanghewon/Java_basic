package lec20220803;

//interface
//implement(실행)하는 class
//interface(interface만으로는 사용 불가)는 implement하는 class에서 구현할 수 있다
//사용하는 인터페이스의 메소드를 모두 구현해야한다

public class ToyRobot implements Toy {
	
	// 메소드를 재정립하는 이유
	// 각각의 class 특성에 맞게 사용해야하기 때문

	@Override
	public void walk() {
		System.out.println("The robot can walk.");
		
	}

	@Override
	public void run() {
		System.out.println("The robot can run.");
		
	}

	@Override
	public void alarm() {
		System.out.println("The robot has no alarm funtion.");
		
	}

	@Override
	public void light() {
		System.out.println("The robot has light funcion.");
		
	}

}
