package testPjt;

import java.util.Arrays;

// 배열과 메모리
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
		
		
				
		

	}

}
