package testPjt;

public class ChildClassA {
	
	public String name;
	public String gender;
	public int age;
	

	public ChildClassA() {
		System.out.println("--ChildClassA construcotr--");
	}
	
	public void setInfo(String n, String g, int a) { //학생의 정보를 넣기
		System.out.println("-- setInfo() START --");
		
		name= n;
		gender = g;
		age = a;
		
	}
	
	public void getInfo() { //학생의 정보를 가져오기
		System.out.println("--getInfo() START--");
		
		System.out.println(" name : " + name);
		System.out.println(" gender : " + gender);
		System.out.println(" age : " + age);
		
		
	}
	
//	private void mySeceret() { // private은 내부에서만 사용 가능(public은 외부에서도 사용 가능)
//		System.out.println("-- mySeceret() --");
//	}
//	}
//
}
