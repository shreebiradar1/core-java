package Ecommerce_with_database_11_11_2024;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ProductMan {
	public static void prodMan() throws IOException {
		ArrayList<Product> prodList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		String path = "D:\\Programming\\java\\W26\\Day_16\\src\\EcommerceArrayListFile_31_10_2024\\ProductData.csv";
		FileReader fileRead = new FileReader(path);
		BufferedReader bfRead = new BufferedReader(fileRead);
		String line = "";
		while ((line = bfRead.readLine()) != null) {
			String filedata[] = line.split(",");
			Product readData = new Product();

			readData.prodName = filedata[0];
			readData.prodPrice = filedata[1];
			readData.prodQuant = filedata[2];
			prodList.add(readData);

		}
		System.out.println("\t\tWelcome to Product Management\n");

		while (true) {
			System.out.println("1.Add Product");
			System.out.println("2.Search Product");
			System.out.println("3.Remove Product");
			System.out.println("4.Display Product");
			System.out.println("5.Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Product prod = new Product();
				System.out.println("\tAdding Product..\n");
				System.out.println("Enter product name : ");
				prod.prodName = sc.next();

				System.out.println("Enter Product Price : ");
				prod.prodPrice = sc.next();

				System.out.println("Enter product Quantity : ");
				prod.prodQuant = sc.next();
				
				System.out.println("Product Added Sucessfully..\n");
				prodList.add(prod);
				break;

			case 2:
				System.out.println("\tSearching Product\n");
				System.out.println("Enter product name : ");
				String search = sc.next();
				boolean found = false;
				for (Product data : prodList) {
					if (data.prodName.contains(search)) {
						System.out.println("\tProduct found\n");
						found = true;
					}
				}
				if (!found) {
					System.out.println("\tProduct not found..\n");
				}
				break;

			case 3:
				System.out.println("\tRemoving Product\n");
				System.out.println("Enter product name : ");
				String remove = sc.next();

				for (int i = 0; i < prodList.size(); i++) {
					if (prodList.get(i).prodName.equals(remove)) {
						prodList.remove(i);
						System.out.println("Product Removed Sucessfully..\n");
					}
				}
				break;

			case 4:
				System.out.println("\tDisplaying Product Details.\n");
				for (Product data : prodList) {
					System.out.println("Product Name :" + data.prodName);
					System.out.println("Product Price :" + data.prodPrice);
					System.out.println("Product Quantity :" + data.prodQuant + "\n");
				}
				break;

			case 5:
				FileWriter writer = new FileWriter(path, false);
				BufferedWriter bfWriter = new BufferedWriter(writer);
				for (Product value : prodList) {
					bfWriter.write(value.prodName + "," + value.prodPrice + "," + value.prodQuant + "\n");
				}
				bfWriter.close();
				System.out.println("\tExiting Product Management...\n");
				return;

			default:
				System.out.println("\tInavlid option");
			}
		}
	}
}
