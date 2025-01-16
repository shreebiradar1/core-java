package FHUsingArrayList_25_10_2024;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class FileHandlingUsingArrayList {
	public static void main(String[] args) throws IOException {
		ArrayList alist = new ArrayList();
		
		String path = "D:\\Programming\\java\\W26\\Day_15\\src\\FHUsingArrayList_25_10_2024\\User";
		
		File file = new File(path);
		FileReader ReadFile = new FileReader(file);
		BufferedReader buffRead = new BufferedReader(ReadFile);
		
		Scanner sc = new Scanner(buffRead);
		alist.add(buffRead);
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);	
			
			sc.close();
		}
	}
}
