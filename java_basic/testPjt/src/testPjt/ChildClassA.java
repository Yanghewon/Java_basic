package testPjt;

public class ChildClassA {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClassA() {
		System.out.println("--ChildClassA construcotr--");
	}
	
	public ChildClassA(String n, String g, int a) {
		System.out.println("-- setInfo() START --");
		name = n;
		gender = g;
		age = a;
		
	}
	
	public void getInfo() {
		System.out.println("--getInfo() START--");
		
		System.out.println(" name : " + name);
		System.out.println(" gender : " + gender);
		System.out.println(" age : " + age);
		
		
	}

}
