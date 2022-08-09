package lec20220809;

// 파일 복사

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;	//IOException을 사용하기 위함

public class MainClass3 {
	
	public static void main(String[] args) {
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("C:\\JavaPractice\\java_basic\\hello.txt");
			outputStream = new FileOutputStream("C:\\JavaPractice\\java_basic\\helloCopy.txt");
			
			byte[] arr = new byte[3];	// 3단어씩 끊어서 읽어옴
			
			while(true) {
				int len = inputStream.read(arr);
				if(len == -1) break;
				outputStream.write(arr, 0, len);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
			
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (Exception e) { e.printStackTrace(); }
			}
		}
		
	}
	

}
