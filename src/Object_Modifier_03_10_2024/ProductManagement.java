package Object_Modifier_03_10_2024;
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
			
			int Check = scan.nextInt();
			
			if(Check == 1) {
				
				Product prod = new Product();
				System.out.println("Add Product \n");
					System.out.println("Enter Product Name : ");
					prod.ProdName = scan.next();
					
					System.out.println("Enter Product Price : ");
					prod.price = scan.nextInt();
					
					System.out.println("Enter Product quantity : ");
					prod.productQuantity = scan.nextInt();
					
					System.out.println("Product Name : "+prod.ProdName);
					System.out.println("Product Price : "+prod.price);
					System.out.println("Product Quantity : "+prod.productQuantity);
					
			} else if(Check == 2) {
				
				System.out.println("To be Impelemented...");
				
			} else if(Check == 3) {
				
				System.out.println("To be Impelemented...");
				
			} else if(Check == 4) {
				
				System.out.println("To be Impelemented...");
				
			} else if(Check == 5) {
				
				System.out.println("\t*****Exiting product Management*****");
				return;
				
			} else {
				
				System.out.println("Invalid option.....");
			}
		}
	}
}
