package EcommerceArrayListFile_31_10_2024;

import java.util.Scanner;
public class Ecommercemain {

	public static void main(String[] args) throws Exception {
		System.out.println("\t\tWelcome to E-Comerce\n");
		Scanner sc = new Scanner(System.in);
//		Login.login();
		while(true) {
		System.out.println("1. User Management");
		System.out.println("2. Product Management");
		System.out.println("3. Exit");
		
		int check = sc.nextInt();
		
		if(check == 1) {
			UserManagement.userMan();
		}
		else if(check == 2) {
			ProductManagement.productMan();
		}
		else if(check == 3) {
			System.out.println("Exiting Application....\n");
			System.out.println("Thank you....\n");
			return;
		}
		}
	}

}
