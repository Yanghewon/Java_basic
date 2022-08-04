package lec20220804;


//문자열 클래스
//문자열을 다루는 String클래스와 이를 보안한 StringBuffer, String Builder 클래스에 대해서 학습
//문자열을 다루는 String 클래스(객체)는 데이터가 변화면 메모리상의 변화가 많아 속도가 느리다.
//문자열이 변경되면 기존의 객체를 버리고, 새로운 객체를 메모리에 생성
//이때, 기존 객체는 GC에 의해서 메모리 회수가 이루어진다.

//StringBuffer, StringBuilder
//String 클래스의 단점을 보완한 클래스로 데이터가 변경되면 메모리에서 기존 객체를 재활용
//문자열이 변경되면 기존의 객체를 재활용한다.
//속도는 StringBuilder가 조금 더 빠르며, 데이터 안정성은 StringBuffer가 조금 더 좋다.

public interface InterfaceA {

}
