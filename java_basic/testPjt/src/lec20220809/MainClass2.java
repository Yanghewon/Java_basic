package lec20220809;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;	//IOException을 사용하기 위함

public class MainClass2 {
	
	public static void main(String[] args) {
		
		// write()
		OutputStream outputStream = null;
		try {
			
			outputStream = new FileOutputStream("C:\\JavaPractice\\java_basic\\hello2.txt");
			String data = "Hello java world!!";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// write()
		
		try {
			
			outputStream = new FileOutputStream("C:\\JavaPractice\\java_basic\\hello2.txt");
			String data = "Hello java World!!";
			byte[] arr = data.getBytes();
			
			try {
				outputStream.write(arr, 0, 5); 	// 시작점과 끝의 자릿수를 저장, 그러면 'hello '까지 입력됨(띄어쓰기도 포함)
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
