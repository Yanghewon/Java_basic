package lec20220809;

//DatalnputStream, DataOutputStream
//byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;	//IOException을 사용하기 위함

public class MainClass4 {

	public static void main(String[] args) {
		
		String str = "Hello Java World";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream("C:\\JavaPractice\\java_basic\\helloWorld.txt");
			dataOutputStream = new DataOutputStream(outputStream);
			
			dataOutputStream.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputStream != null) outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
