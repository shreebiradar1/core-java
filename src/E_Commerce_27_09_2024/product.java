package E_Commerce_27_09_2024;
import java.util.Scanner;
public class product {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product Name :");
		String name = sc.next();
		
		System.out.println("Enter product quantity :");
		int quantity = sc.nextInt();
		
		System.out.println("Enter product price : ");
		String price = sc.next();
		
		System.out.println("Product name : "+name);
		System.out.println("Product quantity : "+quantity);
		System.out.println("Product price : "+price);
	}
}
