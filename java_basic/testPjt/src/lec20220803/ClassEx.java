package lec20220803;


public class ClassEx extends AbstractClassEx {
	
	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s); // super: 데이터를 상위클래스로 보내는 것
		//MainClass에서 i(10), s(java)를 받은 것을 상위 클래스(AbstractClassEx)로 보내 21구문에 대입시킨 것
	}
	
	@Override
	public void fun2() {
		System.out.println(" -- fun2() START -- ");
	}
	

}
