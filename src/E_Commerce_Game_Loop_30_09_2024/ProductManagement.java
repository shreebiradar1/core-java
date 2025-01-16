package E_Commerce_Game_Loop_30_09_2024;
import java.util.Scanner;
	public class ProductManagement {
		
		public  static void productManagement() {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Product Management\n");
		
		while(true) {
			
			System.out.println("What would you like to do today?");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Search Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Quit ");
			
			int option = scan.nextInt();
			
			if(option == 1) {
				System.out.println("Add Product \n");
					System.out.println("Enter Product Name : ");
					String productName = scan.next();
					
					System.out.println("Enter Product Price : ");
					int price = scan.nextInt();
					
					System.out.println("Enter Product quantity : ");
					int quantity = scan.nextInt();
					
					System.out.println("Product Name : "+productName);
					System.out.println("Product Price : "+price);
					System.out.println("Product Quantity : "+quantity);
					
			} else if(option == 2) {
				
				System.out.println("To be Impelemented...");
				
			} else if(option == 3) {
				
				System.out.println("To be Impelemented...");
				
			} else if(option == 4) {
				
				System.out.println("To be Impelemented...");
				
			} else if(option == 5) {
				
				System.out.println("\t*****Exiting product Management*****");
				return;
				
			} else {
				
				System.out.println("Invalid option.....");
			}
		}
	}
}
