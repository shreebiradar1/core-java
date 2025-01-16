package Adding_Using_Array_11_10_2024;
import java.util.Scanner;
	public class ProductMan {
		
		public  static void productManagement() {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t Welcome to Product Management\n");
		
		Product productArray[] = new Product[5];
		int productCount = 0;
		
		while(true) {
			
			System.out.println("What would you like to do today?");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Search Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Print product");
			System.out.println("6. Exit");
			
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
					
					productArray[productCount] = prod;
					productCount++;
					
			} else if(Check == 2) {
				
				System.out.println("To be Impelemented...");
				
			} else if(Check == 3) {
				
				System.out.println("To be Impelemented...");
				
			} else if(Check == 4) {
				
				System.out.println("To be Impelemented...");
				
			} else if(Check == 5) {
				
				for(int i = 0;i<productCount;i++) {
					System.out.println(productArray[i].ProdName);
					System.out.println(productArray[i].price);
					System.out.println(productArray[i].productQuantity);
				}
				
			} else if(Check == 6) {
				
				System.out.println("\t*****Exiting product Management*****");
				return;	
				
			} else {
				
				System.out.println("Invalid option.....");
			}
		}
	}
}
