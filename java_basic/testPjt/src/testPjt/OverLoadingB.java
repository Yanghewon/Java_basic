package testPjt;

public class OverLoadingB {
	public int i;
	public boolean b;
	public double d;
	public String c;
	public String s;
	
	public void getInfo() {
		System.out.println(" -- getInfo - 1 -- ");
		
		System.out.println("i = " + i);
		System.out.println("b = " + b);
		System.out.println("d = " + d);
		System.out.println("c = " + c);
		System.out.println("s = " + s);
		
	}

	
	public void getInfo(int x, int y) {
		System.out.println(" -- getInfo - 2 -- ");
		
		System.out.printf(" parameter --> x : %d, y : %d\n", x, y);
		
	}
	
	public void getInfo(String s1, String s2) {
		
		System.out.println(" -- getInfo - 3 -- ");
		System.out.printf(" parameter --> s1 : %s, s2 : %s\n", s1, s2);
	}
}
