package User_Product_Array_List_16_10_2024;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t----Welcome to E-Commerce----\n");
		
		Login.login();
		
		while(true) {
			
			System.out.println("What would you like to do today?");
			System.out.println("1. Product Management");
			System.out.println("2. User Management");
			System.out.println("3. Quit");
			
			int option = sc.nextInt();
			
			if(option == 1) {
				
				ProductMan.productManagement();
				
			} else if(option == 2) {
				
				UserMan.userManagement();
				
			} else {
				return;
			}
		}
	}
}
