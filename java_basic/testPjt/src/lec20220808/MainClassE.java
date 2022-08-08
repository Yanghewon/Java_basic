package lec20220808;

// 예외처리
// Exception, try ~ catch, finally, throws, 다양한 예외처리
// 프로그램에 문제가 발생했을 때 시스템 동작에 문제가 없도록 사전에 예방하는 코드를 작성하는 방법에 대해서 학습
// 예외란: 프로그램에 문제가 있는 것을 말하며, 예외로 인해 시스템 동작이 멈추는 것을 막는 것을 '예외처리'라고 한다.
// Exception: 이때 error는 개발자가 대처가능
// Error: 이때 error는 개발자가 대처할 수 없음
// Exception은 Checked Exception, Unchecked Exception으로 나뉜다
// Checked Exception: 예외처리를 반드시 해야하는 경우(네트워크, 파일 시스템 등)
// Unchecked Exception: 예외처리를 개발자의 판단에 맞기는 경우(데이터 오류 등)
// Exception의 하위 클래스로 NullPointerException, NumberFormatException 등이 있다
// NullPointerException: 객체를 가리키지 않고 있는 레퍼런스를 이용할 때
// ArraylndexOutOfBoundException: 배열에서 존재하지 않는 인덱스를 가리킬 때
// NumberFormatException: 숫자데이터에 문자데이터 등을 넣었을 때

// try ~ catch: 개발자가 예외처리하기 가장 쉽고, 많이 사용되는 방법
// try { 예외가 발생할 수 있는 코드} catch(Exception e) { 예외가 발생했을 때 처리할 코드}

// finally: 예외 발생 여부에 상관없이 반드시 실행됨

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClassE {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Exception BEFORE");
		
		// try구문 안에서 중간에 예외가 하나라도 발생하면 그 뒤의 코딩은 작동하지 않음
		// fianlly를 붙이면 중간에 예외가 생겼더라도 무조건 실행시킴
		
		try {
			r = i / j;
		} catch (Exception e) {
			e.printStackTrace(); 	// 오류가 난 것을 콘솔창에서 알려주는 것
			String msg = e.getMessage();	// 예외를 간략하게 나타낸 문자를 받는 것
			System.out.println("Exception: " + msg);
		}
		
		System.out.println("Exception AFTER");
		
		Scanner scanner = new Scanner(System.in);
		// int i, j;
		ArrayList<String> list = null;
		
		int[] iArr = {0, 1, 2, 3, 4};
		
		System.out.println("Exception BEFORE");
		
		try {
			System.out.println("input i :");
			i = scanner.nextInt();
			System.out.println("input j : ");
			j = scanner.nextInt();
			
			System.out.println("i / j = " + (i / j));
			
			for (int k = 0; k < 5; k++) {
				System.out.println("iArr[" + k + "] : " + iArr[k]);
			}
			
			System.out.println("list.size() : " + list.size());
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("예외 발생 여부에 상관없이 언제나 실행 됩니다.");
		}
		
		// throws: 예외 발생시 예외 처리를 직접하지 않고 호출한 곳으로 넘긴다
		
		System.out.println("Exception AFTER");
		
		MainClassE mainClass004 = new MainClassE();
		
		try {
			mainClass004.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void firstMethod() throws Exception {
		secondMethod();
	}
	
	public void secondMethod() throws Exception {
		thirdMethod();
	}
	
	public void thirdMethod()throws Exception {
		System.out.println("10 / 0 = " + (10 / 0));
	}

}
