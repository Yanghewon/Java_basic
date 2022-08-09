package lec20220809;

//DatalnputStream, DataOutputStream
//byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다
//복사

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;	//IOException을 사용하기 위함

public class MainClass5 {

	@SuppressWarnings("null") // 31번줄 문제로 해결하기 위해 넣었지만 무엇인지 잘 모르겟음
	public static void main(String[] args) {
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			
			inputStream = new FileInputStream("C:\\JavaPractice\\java_basic\\helloWorld.txt");
			dataInputStream = new DataInputStream(inputStream);
			
			String str = dataInputStream.readUTF();
			
			outputStream = new FileOutputStream("C:\\JavaPractice\\java_basic\\helloWorldCopy.txt");
			dataOutputStream.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
