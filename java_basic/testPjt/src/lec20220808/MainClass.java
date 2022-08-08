package lec20220808;

// Collections
// 배열과 같이 자료(데이터)를 효율적으로 관리하기 위한 방법에 대한 학습
// List
// List는 인터페이스로 이를 구현한 클래스는 인덱스를 이용해서 데이터를 관리한다.
// Map
// Map은 인처페이스로 이를 구현한 클래스는 key를 이용해서 데이터를 관리한다.
// 특징: key를 이용, 중복 불가, 데이터 중복은 가능

import java.util.ArrayList; // ArratList를 사용하기 위한 필요조건
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		
		// ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("list.size ; " + list.size());
		
		// 데이터 추가
		list.add("Hello");
		list.add("Java");
		list.add("World");
		System.out.println("list.sixe : " + list.size());
		System.out.println("list : " + list);
		
		list.add(2, "Programing"); // 추가
		System.out.println("list : " + list);
		
		list.set(1, "C"); // 변경 - 0은 Hello, 1은 Java, 2는 World 이기 때문에 1에 해당하는 JAVA가 C로 바뀌는 코드
		System.out.println("list : " + list);
		
		// 데이터 추출
		String str = list.get(2);
		System.out.println("list.get(2) : " + str);
		System.out.println("list : " + list);
		
		
		// 데이터 제거
		str = list.remove(2);
		System.out.println("list.remote(2) : " + str);
		System.out.println("list : " + list);
		
		// 데이터 전체 제거
		list.clear();
		System.out.println("list : " + list);
		
		// 데이터 유무
		boolean b = list.isEmpty();
		System.out.println("list.isEmpty() : " + b);
		
		System.out.println(" ================================ ");
		
		// HashMap 객체 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>(); // Integer(정수형)은 키값, String은 데이터
		System.out.println("map.size() : " + map.size());
		
		// 데이터 추가
		map.put(5,  "Hello");
		map.put(6, "Java");
		map.put(7, "World");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		
		map.put(8, "!!");
		System.out.println("map : " + map);
		
		// 데이터 교체
		map.put(6, "c");
		System.out.println("map : " + map);
		
		// 데이터 추출
		str = map.get(5);
		System.out.println("map.get(5) : " + str);
		
		// 데이터 제거
		map.remove(8);
		System.out.println("map : " + map);
		
		// 특정 데이터 포함 유무
		b = map.containsKey(7); // 키값
		System.out.println("map.containkey(7) : " + b);
		
		b = map.containsValue("World"); // 데이터값
		System.out.println("map.containsValue(\"World\") : " + b);
		
		
		// 데이터 전체 제거
		map.clear();
		System.out.println("map : " + map);
		
		// 데이터 유무
		b = map.isEmpty();
		System.out.println("map.isEmpty() : " + b);
		
		
		

	}

}
