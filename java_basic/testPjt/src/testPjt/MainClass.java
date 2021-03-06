package testPjt;

import java.util.Scanner;

// 변수
// 기본자료형
// 특수 문자와 서식 문자
// 연산자(피연산자(단항,이항,삼항 연산자))
// 배열
public class MainClass {
	
	public static void main(String[] args) {
		
		// 기본자료형(byte가 작을수록 그 속에 담을 수 있는 bit가 적어 프로그램이 원활하게 돌아가기 어려움)
		char c ='a'; // 2byte
		System.out.println("c= " + c);
		
		int i = 10; // 4byte
		System.out.println("i = " + i);
		
		double d = 10.123; // 8byte
		System.out.println("d = " + d);
		
		boolean b= false; // 1byte
		System.out.println("b = " + b);
		
		String s = "Hello Java World!!"; // 객체자료형 4byte
		System.out.println("s = " + s);
		
		s = "Good";
		System.out.println("s = " + s);
		
		// 자동(묵시적) 형 변환:
		// -> 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by = 10; // 1byte
		int in = by; // 4byte
		System.out.println("in = " +in);
		
		// 명시적 형 변환:
		// 큰 공간의 메모리에서 작은 공간의 메모리로 이동
		int ivar = 100;
		byte bvar = (byte)ivar;
		System.out.println("bvar = " +bvar); // 명시적 형 변환은 데이터가 누실 될 수 있다(큰 숫자가 오면 작은 byte가 다 담아낼 수 x)
		
		// 특수문자
		
		System.out.println("Good\tMorning~"); // \t -> 탭
		System.out.println("Good\nMorting~"); // \n -> 줄바꿈
		System.out.println("Good\'Morning~"); // \' -> 작은 따옴표
		System.out.println("Good\"Morning~"); // \" -> 큰 따옴표
		System.out.println("Good\\Morning~"); // \\ -> 역슬래쉬
		
		// 서식 문자
		
		System.out.println("오늘의 날씨는 10도 입니다.");
		System.out.printf("오늘의 날씨는 %d도 입니다.\n", 8); // -> printf()의 f는 format을 뜻함 이때 개행(탭)이 실행되지 않기 때문에 직접 넣어줘야 함
		
		char c1 = 'a';
		char c2 = 'A';
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다\n\n", c1, c2);
		
		int num1 = 20;
		System.out.println("오늘의 기온은 " +num1+ "도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);
		
		System.out.printf("홍길동\'s Info. : %d학년 %d반 %d번\n", 6, 2, 10);
		
		// 정수
		int num2 = 30;
		System.out.printf("num2(10진수) : %d\n", num2);
		System.out.printf("num2(8진수) : %o\n", num2);
		System.out.printf("num2(16진수) : %x\n", num2);
		
		// 문자
		System.out.printf("소문자 \'%s\'을 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
		
		// 서식 문자 정렬 기능
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		System.out.println();
		
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		// 서식 문자 소수점 제한 기능
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
		
		// 산술 연산자
		
		int x = 10;
		int y = 20;
		
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		// 복합 연산자
		
		System.out.println("x += 10 :" + (x +=10)); // -> x = x + 10
		System.out.println("x -= 10 :" + (x -=10));// -> x = x - 10
		System.out.println("x *= 10 :" + (x *=10)); // 곱하고 대입
		System.out.println("x /= 10 :" + (x /=10)); // 나누고 대입
		System.out.println("x %= 10 :" + (x %=10)); // 나머지를 대입
		
		// 관계 연산자
		
		System.out.println("x > y :" + (x > y)); // x가 y보다 클때 참
		System.out.println("x < y :" + (x < y)); // x가 y보다 작을때 참
		System.out.println("x >= y :" + (x >= y)); // x가 y보다 크거나 같을때 참
		System.out.println("x <= y :" + (x <= y)); // x가 y보다 작거나 같을때 참
		System.out.println("x == y :" + (x == y)); // x와 y가 같을때 참
		System.out.println("x != y :" + (x != y)); // x와 y가 다를때 참
		
		// 증감 연산자
		
		x = 10;
		System.out.println("++x :" + (++x)); // x = x + 1
		x = 10;
		System.out.println("--x :" + (--x));
		
		x = 10;
		System.out.println("x++ :" + x++); // x를 먼저 출력을 하고 나중에 1을 더해줌
		System.out.println("x :" + x);
		
		x = 10;
		System.out.println("x-- :" + x--);
		System.out.println("x :" + x);
		
		// 논리 연산자
		
		boolean b1 = false;
		boolean b2 = true;
		System.out.println("b1 && b2 :" + (b1 && b2)); // b1와 b2가 모두 참이면 참
		System.out.println("b1 || b2 :" + (b1 || b2)); // b1 또는 b2가 참이면 참
		System.out.println("!b1 : " + !b1); // b1 상태를 부정
		System.out.println("!b2 :" + !b2); // b2 상태를 부정
		
		
		/* 조건(삼항) 연산자
		 * 조건식 -> 식1 : 식2
		 * 조건식이 참이면 식1이 실행되고, 거짓이면 식2가 실행된다
		 */
		
		x = 10; y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200; // 증감 연산자가 거짓이기 때문에 result에 200이 대입됨
		System.out.println("result : " + result);
		
		result = (x < y) ? 100 : 200; // 증감 연산자가 참이기 때문에 result에 100이 대입됨
		System.out.println("result : " + result);
				
		result = (x == y) ? 100 : 200; // 증감 연산자가 거짓 때문에 result에 200이 대입됨
		System.out.println("result : " + result);
		
		// 비트 연산자(2진수로 계산해야함), 속도 향상, 그러나 실제로 거의 안 씀
		
		x = 2;
		y = 3;
		System.out.println("x & y : " + (x & y)); // x와 y가 모두 1이면 1
		System.out.println("x | y : " + (x | y)); // a와 b중 하나라도 1이면 1
		System.out.println("x ^ y : " + (x ^ y)); // a와 b가 같이 않으면 1
		
		// 배열에 같은 형만 담을 수 있음
		
		int[] arr1 = new int[5]; // 배열 선언 단계
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		
		/*
		int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		*/
		int[] arr2 = {10, 20, 30}; // 배열 선언과 초기화를 동시에
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		
		// 배열을 이용한 학사관리
		String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
		score[0] = scanner.nextInt(); // 점수를 입력한 값을 score에 저장
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s 점수 : \t%.2f\n", name[0], (double)score[0]);
		System.out.printf("%s 점수 : \t%.2f\n", name[1], (double)score[1]);
		System.out.printf("%s 점수 : \t%.2f\n", name[2], (double)score[2]);
		System.out.printf("%s 점수 : \t%.2f\n", name[3], (double)score[3]);
		System.out.printf("%s 점수 : \t%.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("--------------------------\n평 점 : \t%.2f", ave);
		
		
		
		
		
		
		
		
		
	}

}
