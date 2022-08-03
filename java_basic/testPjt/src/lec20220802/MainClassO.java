package lec20220802;

// 내부클래스(innerclass): 클래스 안에 또 다른 클래스를 선언하는 것으로 이렇게 하면 두 클래스의 멤버에 쉽게 접근할 수 있다
// 내부클래스는 코딩을 한 눈에 보기 어렵기 때문에 좋은 방법은 아님
//익명클래스(anonymousclass)

public class MainClassO {
	
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		System.out.println("oc.num : " + oc.num);
		System.out.println("oc.str1 : " + oc.str1);
		
		System.out.println();
		
		// 멤버 inner 클래스
		OuterClass.InnerClass in = oc.new InnerClass(); // InnerClass는 OuterClass에 있기 때문에 위에서 생성한 oc에 접근하도록 한다.
		System.out.println("in.num : " + in.num);
		System.out.println("in.str2 : " + in.str2); // InnerClass에는 
		
		System.out.println();
		
		// static inner 클래스(static 어디서나 공유 가능한)
		OuterClass.SInnerClass si = new OuterClass.SInnerClass();
		System.out.println("si.num : " + si.num);
		System.out.println("si.str3 : " + si.str3);
		
		
		System.out.println();
		
		// 익명(anonymous) 클래스
		// AnonymousClass ac = new AnonymousClass(); 보통 이렇게 시작하지만 익명클래스는 AnonymousClass ac(이름)을 생략하기 한다.
		// 이것 때문에 익명클래스라는 이름이 붙음
		// 이름이 없기 때문에 재호출이 어려움, 그렇기 때문에 한번 쓸 생각으로 사용
		new AnonymousClass() {
			
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
				
			};
		}.method();
		
	}
}
