package Ecommerce_with_database_11_11_2024;

import java.util.Scanner;

public class Login {
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String name = sc.next();
		
		System.out.println("Enter Password : ");
		String pass = sc.next();
		
		while(true) {
			if(name.equals("Shree") && pass.equals("Pass123")) {
				System.out.println("\tLogin Sucessfull...\n");
				return;
			}
			else {
				System.out.println("Login fail...");
				System.exit(0);
			}
		}
	}
}
