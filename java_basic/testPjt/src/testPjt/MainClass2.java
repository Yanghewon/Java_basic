package testPjt;
// 배열과 메모리
// 조건문
import java.util.Arrays;
import java.util.Scanner; // switch문에서 사용

public class MainClass2 {
	public static void main(String[] args) {
		
		// 배열의 기본 속성
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null; // 배열을 만들지 않아 주소가 텅 비어있는 것을 null
		int[] arrAtt3 = null;
		
		//배열의 길이
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		// 배열 요소 출력
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// 배열 요소 복사
		arrAtt3 = Arrays.copyOf(arrAtt1,  arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// 배열 레퍼런스
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3); // arrAtt3만 값이 다른 이유는 위에서 요소만 복사해온 것으로 새로운 곳의 주소를 담고 있기 때문
		
		// 다차원 배열(데이터 처리 속도가 느려지기 때문에 3차원 이상 쓰지 않음)
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		// 조건문
		int num1 = 20;
		int num2 = 20;
		
		// if 조건식
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		}
		System.out.println();
		
		// if 조건식 else
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
			} else {
				System.out.println("num1는 num2보다 크거나 같다.");
		}
		System.out.println();
		
		// if(조건식) else if (조건식)
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else if(num1 > num2) {
			System.out.println("num1는 num2보다 크다.");
		} else {
			System.out.println("num1는 num2는 같다.");
		}
		
		// switch문
		System.out.println("점수를 입력하세요. : ");
		Scanner inputNum = new Scanner(System.in); // 5번에서 import Scanner 완료
		int score = inputNum.nextInt();
		
		switch (score) {
		case 100:
		case 90:
			System.out.println("Perfect"); // 중복으로 사용 가능
			
			break; // 입력된 값에 해당되는 결과를 출력하고 끝내라
		case 80:
			System.out.println("score is 80");
			
			break;
		case 70:
			System.out.println("score is 70");
			
			break;
		case 60:
			System.out.println("score is 70");
			
			break;
		case 50:
			System.out.println("score is 70");
			
			break;


		default: // 입력된 값에 해당되는 값이 없으면 실행하는 것
			System.out.println("score?");
			break;
		}
		
		inputNum.close(); // resource 회수해야 함
		
		
				
		

	}

}
