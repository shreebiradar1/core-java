package EcommerceArrayListfile_tried;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductMan {
	public static void productMan() throws Exception {
		System.out.println("\t\tWelcome to Product Management\n");
		ArrayList<Product> prodList = new ArrayList();
		//Taking file data to the ArrayList
		ArrayList<String[]>filedata = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		String path = "D:\\Programming\\java\\W26\\Day_16\\src\\EcommerceArrayListfile\\ProductData.csv";
		FileReader file = new FileReader(path);
		BufferedReader bfread = new BufferedReader(file);

//		File data storing in file_data ArrayList
		String line = "";
		while((line = bfread.readLine()) != null) {
			Product prod = new Product();
			String row[] = line.split(",");
			
			prodList.add(prod);
		}
			
		while (true) {
			System.out.println("What you want to do in Product Management\n");
			System.out.println("1. Add Product");
			System.out.println("2. Search Product");
			System.out.println("3. Remove Product");
			System.out.println("4. Display Product");
			System.out.println("5. Exit");
			
			int check = sc.nextInt();
			
			
			if (check == 1) {
				Product prod = new Product();

				System.out.println("Adding Product\n");

				System.out.println("Enter Product Id : ");
				prod.ProdId = sc.next();

				System.out.println("Enter Product Name : ");
				prod.name = sc.next();

				System.out.println("Enter Product Price : ");
				prod.price = sc.next();

				System.out.println("Enter Product Quantity : ");
				prod.ProdQuant = sc.next();

				prodList.add(prod);
				System.out.println("Product Added Successfully in ArrayList\n");

				FileWriter filewrite = new FileWriter(path,true);
				BufferedWriter bfwrite = new BufferedWriter(filewrite);
				
				for (Product data : prodList) {
					bfwrite.write(data.ProdId + "," + data.name + "," + data.price + "," + data.ProdQuant + "\n");
				}
				bfwrite.close();
				System.out.println("Product Added Successfully in File\n");
			} else if (check == 2) {
				System.out.println("Searching product\n");

				System.out.println("Enter Product name : ");
				String Search = sc.next();
				
				
				for(String[] data : filedata) {
					for(String element : data) {
						if(element.contains(Search)) {
							System.out.println("Product Found...!");

						}	
					}
				}
				
		//Only checking the first line don't know why
				
//				String line = "";
//				while((line= bfread.readLine()) != null) {
//					System.out.println(line);
//				String row[]= line.split(",");
//				for(int i = 0;i<row.length;i++) {
//					if(row[i].contains(Search)) {
//						System.out.println("Product found");
//					}
//					
//				}
//				}
				
				//Searching for First ArrayList(prodList)
				//when we exit the program our first ArrayList will get empty
				
//				boolean found = false;
//				
//				for(Product data : prodList) {
//					if(data.name.equalsIgnoreCase(Search)) {
//						System.out.println("Product found...\n" +
//                                "ID: " + data.ProdId + ", Name: " + data.name.toUpperCase() +
//                                ", Price: " + data.price + ", Quantity: " +data.ProdQuant);
//						found = true;
//						break;
//
//					}
//				} if(!found) {
//					System.out.println("Product not found...\n");
				
			} else if (check == 3) {
				System.out.println("Removing Product\n");
				System.out.println("Enter product name : ");
				String productremove = sc.next();
				
				System.out.println("To Be Implemented");
				
				//if still it works then the second ArrayList data will be deleted and
				//it will be deleted by default when we exited the program
//				for(String[] data : filedata) {
//					for(String element : data) {
//						if(element.contains(productremove)) {
//							
//							System.out.println("Product Remove successfully");
//						}
//						
//					}
//				}
				//This logic works for the first ArrayList(prodList)
				
//				String line ="";
//				String row[] =line.split(",");
//				for(line)
//				for (int i = 0; i < prodList.size(); i++) {
//					if (prodList.get(i).name.equals(remove)) {
//						prodList.remove(i);
//						System.out.println("Product Remove successfully..\n");
//						
//					}
//				}
			} else if (check == 4) {
				
				System.out.println("Displaying product..\n");
				for(String[] data : filedata) {
					for(String value : data) {
						System.out.println(value);
					}
				}

				
			} else if (check == 5) {
				System.out.println("Exiting product Management..\n");
				return;
			}
		}

	}
}
