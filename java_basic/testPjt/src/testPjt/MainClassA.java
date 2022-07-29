package testPjt;

public class MainClassA {
	
	
	public static void main(String[] args) {
		
		ChildClassA child1 = new ChildClassA();
		child1.name = "hong gil dong";
		child1.gender = "M";
		child1.age = 10;
				
		child1.getInfo();
		
		ChildClassA child2 = new ChildClassA();
		
		child2.setInfo("Chanho", "M", 27);
		child2.getInfo();
		
			
	}

}
