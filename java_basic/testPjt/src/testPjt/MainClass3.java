package testPjt;
// for문(값을 정의내리고 조건식도 만듦)
// while문(조건식만 들어감)
// do ~ while문

import java.util.Scanner;
public class MainClass3 {
	public static void main(String[] args) {
		System.out.println("INPUT NUMBER : ");
		
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		
		}
		System.out.println();
		
		System.out.println("INPUT NUMBER : ");
		int num = scanner.nextInt();
		int k = 1;
		while(k < 10) {
			System.out.printf("%d * %d = %d\n", num, k, (num * k));
			k++;
		}
		int i = 10;
		do {
			System.out.println("무조건 1번은 실행합니다.");
		} while (i > 100);
		System.out.println();
		
		i = 10;
		do {
			System.out.println("무조건 1번은 실행합니다.");
			i++;
		} while (i < 13);
	}

}
