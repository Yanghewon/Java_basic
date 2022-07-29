package testPjt;

public class MainClassB {

	public static void main(String[] args) {
		
		OverLoadingB Loading = new OverLoadingB();
		Loading.i = 10;
		Loading.b = true;
		Loading.d = 1.23;
		Loading.c = "j";
		Loading.s = "java";
		
		Loading.getInfo();
		
		Loading.getInfo(10, 20);
		
		Loading.getInfo("str1", "str2");
		
		
		
		
	}

}
