package com.java.family;

import java.util.ArrayList;

// 패키지와 static
// 패키지: 패키지 이름은 패키지에 속해 있는 클래스가 최대한 다른 클래스와 중복되는 것을 방지하도록 만듦
//       패키지 이름은 일반적으로 도메인을 거꾸로 이용
//       개발 중에 패키지의 이름과 구조는 변경될 수 있음
//       패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성과 기능을 가지고 있는 예상이 될 수 있도록 이름을 만듦


// 다른 패키지에 존재하는 값을 불러오기 위해서는 import로 호출해야 한다

import com.java.dailyJournal.DailyJournal; // 다른 패키지에 존재하는 값을 불러오기 위해서는 package의 명과 class의 명을 기재해야 함
import com.java.dailyJournal.ObjectClassDaily;

// 다른 패키지의 모든 클래스를 사용하고 싶을 때는 패키지 명 뒤에 .*을 붙인다
import com.java.dailyJournal.*;

// import를 하기 싫다면 클래스 명 앞에 풀네임을 적어주면 된다.(좋지 못한 방법.코드가 지저분해짐)

//public class FamilyClass {
//	
//	com.java.dailyJournal.DailyJournal journal = new com.java.dailyJournal.DailyJournal();
//	com.java.dailyJournal.ObjectClassDaily ObjectClass = new com.java.dailyJournal.ObjectClassDaily();


public class FamilyClass {
	
	DailyJournal journal = new DailyJournal();
	ObjectClassDaily ObjectClass = new ObjectClassDaily();
	
	
	
	
//	ArrayList<E> // ArrayList는 자바에 기본적으로 존재
	
	
// static: 어디서나 속성과 메서드를 공유할 수 있다.	

}
