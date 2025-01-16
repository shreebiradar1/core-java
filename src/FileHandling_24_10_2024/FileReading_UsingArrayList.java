package FileHandling_24_10_2024;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//
//System.out.println("Displaying product..\n");
//String line;
//while((line = bfread.readLine()) != null) {
//	String row[] = line.split(",");
//	for(String data : row) {
//		System.out.println(" "+data);
//	}
//}
//System.out.println();

public class FileReading_UsingArrayList {
	public static void main(String[] args) throws IOException  {
		ArrayList alist = new ArrayList();
			String path = "D:\\Programming\\java\\W26\\Day_15\\src\\FileHandling_24_10_2024\\Product";
			
			File file = new File(path);
			FileReader fileRead = new FileReader(file);
			BufferedReader buffRead = new BufferedReader(fileRead);
			Scanner sc = new Scanner(buffRead);
			
			String line="";
			while((line = buffRead.readLine()) != null) {
				String row[] =line.split(",");
				alist.add(row);
				
				for(String data : row) {
					System.out.println(data);
				}
			}
			buffRead.close();
			sc.close();
	}
}
