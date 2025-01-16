package FileHandling_24_10_2024;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading_UsingWhileSplit {
	public static void main(String[] args) throws IOException {
		String path = "D:\\Programming\\java\\W26\\Day_15\\src\\FileHandling_24_10_2024\\Product";
		
		File file = new File(path);
		
		FileReader fileRead = new FileReader(file);
		
		BufferedReader buffRead = new BufferedReader(fileRead);
		Scanner sc = new Scanner(buffRead);
		
//		Printing memory address
//		while(sc.hasNextLine()) {
//			String line = sc.next();
//			String[] value = line.split(",");
//			System.out.println(value);
//		}
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String value[] = line.split(",");
			for(String data :value) {
				System.out.println(data);
			}
		}
	}
}
