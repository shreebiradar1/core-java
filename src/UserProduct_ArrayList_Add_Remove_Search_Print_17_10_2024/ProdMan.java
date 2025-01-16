package UserProduct_ArrayList_Add_Remove_Search_Print_17_10_2024;
import java.util.Scanner;
import java.util.ArrayList;
public class ProdMan {
	public static void prodMan() {
		
		System.out.println("\t\tWelcome to Product Management\n");
		ArrayList<Product> productList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("What you want to do in Product Management\n");
			System.out.println("1.Add Product");
			System.out.println("2.Search Product");
			System.out.println("3.Remove Product");
			System.out.println("4.Display Product");
			System.out.println("5.Exit");
			
			int check = sc.nextInt();
			
			if(check == 1) {
				Product product = new Product();
				System.out.println("Adding product...");
				
				System.out.println("Enter product Id : ");
				product.Id = sc.nextInt();
				
				System.out.println("Enter product Name : ");
				product.prodName = sc.next();
				
				System.out.println("Enter product Price : ");
				product.price = sc.next();
				
				System.out.println("Enter product Quantity : ");
				product.quantity = sc.nextInt();
				
				productList.add(product);
			} else if (check == 2) {
				System.out.println("Enter Product to Search : ");
				String search = sc.next();
				
				for(Product data : productList) {
					if(data.prodName.contains(search)) {
						 System.out.println("Product Id: " + data.Id);
	                        System.out.println("Product Name: " + data.prodName);
	                        System.out.println("Product Price: " + data.price);
	                        System.out.println("Product Quantity: " + data.quantity);
					} else {
						System.out.println("Product not found........\n");
					}
				}
				
				
			} else if (check == 3) {
				System.out.println("Enter Product to Remove : ");
				String remove = sc.next();
				
				for(int i = 0;i<productList.size();i++) {
					if(productList.get(i).prodName.equals(remove)) {
						productList.remove(i);
						System.out.println("Product remove successfully..\n");
					}
				}
			} else if (check == 4) {
				System.out.println("Displaying Product...");
				for(Product data : productList) {
					System.out.println("Product Id : "+data.Id);
					System.out.println("Product Name : "+data.prodName);
					System.out.println("Product Price : "+data.price);
					System.out.println("Product Quantity : "+data.quantity);
				}
			} else if (check == 5) {
				System.out.println("Exiting Product Management....");
				return;
			}
		}
	}
}
