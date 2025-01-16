package FileHandling_24_10_2024;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading_UsingWhile {
	public static void main(String[] args) throws IOException {
		String filePath = "D:\\Programming\\java\\W26\\Day_15\\src\\FileHandling_24_10_2024\\Product";
		
		File file = new File(filePath);
		
		FileReader fileRead = new FileReader(file); 
		
		BufferedReader buffRead = new BufferedReader(fileRead);
		
		
//		System.out.println(buffRead.readLine());
		String line = "";
		
		while((line = buffRead.readLine())!= null) {
		System.out.println(line);
			
		}
		
//		Scanner sc = new Scanner(buffRead);
//		while(sc.hasNextLine()) {
//			String line = sc.nextLine();
//			System.out.println(line);
//			
//		}

	}
}
