package pjTest;

public class MainClass {

	public static void main(String[] args) { // 프로그램이 실행될 때 가장 먼저 실행되는 출발점
			System.out.println("Hello Java World!!"); // 터미널에 출력할 때
			
			int i = 10; // 변수에 저장된 데이터 변경o
			int j;
			j = 100;
			
			System.out.println("i + j =" + (i+j));
			i = 200;
			System.out.println("i + j =" + (i+j));

		}
}
