package lec20220809;

//BufferedReader, BufferedWriter: byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;	//IOException을 사용하기 위함

public class MainClass7 {

	public static void main(String[] args) {
		
		String fileName = "C:\\JavaPractice\\java_basic\\helloWriter.txt";
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			
			String str = "Hello Java World~~\n";
			str += "Hello C World~~\n";
			str += "Hello C++ World~~\n";
			
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);
			
			System.out.println("end");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if (bw != null) bw.close();
				if (fw != null) fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		

	}

}
