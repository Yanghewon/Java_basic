package lec20220802;

public class OuterClass {
	
	int num = 10;
	String str1 = "java";
	static String str11 = "world";
	
	public OuterClass() {
		System.out.println("OuterClass constructor");
	}
	
	class InnerClass() {
		
		int num = 100;
		String str2 = str1;
	}
		
		public InnerClass() {
			
		}
	}
	
	
	
	
	
	
	
	

}
