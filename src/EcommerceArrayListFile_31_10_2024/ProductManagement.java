package EcommerceArrayListFile_31_10_2024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
	public static void productMan() throws Exception {
		ArrayList<Product> productList = new ArrayList<>();
		String path = "D:\\Programming\\java\\W26\\Day_16\\src\\EcommerceArrayListFile_31_10_2024\\ProductData.csv";
		FileReader fileRead = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bfReader = new BufferedReader(fileRead);

		String line = "";
		while ((line = bfReader.readLine()) != null) {
			String value[] = line.split(",");
			Product readProduct = new Product();

			readProduct.productName = value[0];
			readProduct.productprice = value[1];
			readProduct.productQuantity = value[2];
			productList.add(readProduct);
		}
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("\t\tWelcome to Product Management\n");

		while (true) {
			System.out.println("1.Add Product");
			System.out.println("2.Search Product");
			System.out.println("3.Remove Product");
			System.out.println("4.Display Product");
			System.out.println("5.Exit\n");
			int check = sc.nextInt();

			if (check == 1) {
				Product prod = new Product();
				System.out.println("Adding Product\n");

				System.out.println("Enter Product Name : ");
				prod.productName = sc.next();

				System.out.println("Enter Product Price : ");
				prod.productprice = sc.next();

				System.out.println("Enter Product Quantity : ");
				prod.productQuantity = sc.next();

				productList.add(prod);
				System.out.println("\n\tProduct Added Sucessfully..\n");
			} else if (check == 2) {
				System.out.println("\tSearching Product\n");
				System.out.println("Enter Product Name : ");
				String Search = sc.next();

				boolean found = false;
				for (Product data : productList) {
					if (data.productName.contains(Search)) {
						System.out.println("\t-----Product Exist-----");
						found = true;
					}
				}
				if (!found) {
					System.out.println("\nProduct Not Exist..");
				}
			} else if (check == 3) {
				System.out.println("\tRemoving Product\n");
				System.out.println("Enter Product Name : ");
				String remove = sc.next();

				for (int i = 0; i < productList.size(); i++) {
					if (productList.get(i).productName.equals(remove)) {
						productList.remove(i);
						System.out.println("\tProduct Removed Sucessfully\n");
					}
				}
			} else if (check == 4) {
				System.out.println("\tDisplaying Product Details\n");

				for (Product data : productList) {
					System.out.println("Product Name : " + data.productName);
					System.out.println("Product Price : " + data.productprice);
					System.out.println("Product Quantity : " + data.productQuantity + "\n");
				}
			} else if (check == 5) {

				FileWriter fileWriter = new FileWriter(path, false);
				BufferedWriter bfWriter = new BufferedWriter(fileWriter);

				for (Product value : productList) {
					bfWriter.write(value.productName + "," + value.productprice + "," + value.productQuantity + "\n");
				}
				bfWriter.close();

				System.out.println("\n\t\tExiting Product Management...!\n");
				return;
			}
		}
	}
}
