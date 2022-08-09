package lec20220809;


// 입력과 출력
// FiledInputStream, FileOutputStream
// 파일복사
// DataInputStram, DataOutputStream
// BufferedReader, BufferedWriter

// 입력(Input): 다른 곳의 데이터를 가져오는 것, 출력(Output): 다른 곳으로 데이터를 내보내는 것
// 기본 클래스: 입/출력에 사용되는 기본 클래스는 1byte단위로 데이터를 전송하는 InputStream(입력), OutputSream(출력)이 있다.
// FiledInputStream/ File/OutputStream: 파일에 데이터를 읽고 /쓰기 위한 클래스로 read(), write() 메서드를 이용

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;	//IOException을 사용하기 위함

public class MainClass {

	public static void main(String[] args) {
		
		// read()
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("C:\\JavaPractice\\java_basic\\hello.txt");
			int data = 0;
			
			while(true) {	// 계속 파일을 읽으라는 명령어
				try {
					data = inputStream.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;	// 더이상 읽을 것이 없을 때 -1을 줌으로 멈추라는 명령어
				System.out.println("data : " + data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// read(byte[])
		
		try {
			
			inputStream = new FileInputStream("C:\\JavaPractice\\java_basic\\hello.txt");
			int data = 0;
			byte[] bs = new byte[3];	// ex) hello java가 있다면 3개의 단어로 끊어서 읽는 것(hel/ lo /jav/ a) 
			
			while(true) {
				
				try {
					data = inputStream.read(bs);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("data : " + data);
				for (int i = 0; i < bs.length; i++) {
					System.out.println("bs[" + i + "] : " + bs[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
