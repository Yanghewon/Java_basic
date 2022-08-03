package lec20220802;

// 내부클래스(innerclass): 클래스 안에 또 다른 클래스를 선언하는 것으로 이렇게 하면 두 클래스의 멤버에 쉽게 접근할 수 있다
// 내부클래스는 코딩을 한 눈에 보기 어렵기 때문에 좋은 방법은 아님
// 익명클래스(anonymousclass)

public class OuterClass {
	
	int num = 10;
	String str1 = "java";
	static String str11 = "world";
	
	public OuterClass() {
		System.out.println("OuterClass constructor");
	}
	
	class InnerClass {
		
		int num = 100;
		String str2 = str1; // 본인 class에 없는 str1을 사용할 수 있는 이유는 OuterClass에 내부클래스로 존재하기 때문
		
		public InnerClass() {
			System.out.println("InnerClass constructor");
		}
	}
	
	static class SInnerClass {
		int num = 100;
		//static 클래스는 외부 클래스 멤버에 접근할 수 없다.
		//String str3 = str1;
		String str3 = str11;
		
		public SInnerClass() {
			System.out.println("static InnerClass constructor");
		}
	}
	
	
	
	
	
	
	

}
