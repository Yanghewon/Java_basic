package lec20220809;

// BufferedReader, BufferedWriter: byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.*;	//IOException을 사용하기 위함

public class MainClass6 {

	public static void main(String[] args) {
		
		String fileName = "C:\\JavaPractice\\java_basic\\helloReader.txt";
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String strLine;
			
			while ((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
