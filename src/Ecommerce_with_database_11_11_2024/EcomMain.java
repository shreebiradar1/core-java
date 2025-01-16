package Ecommerce_with_database_11_11_2024;

import java.util.Scanner;

public class EcomMain {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("\t\tWelcome to Ecommerce\n");
		
//		Login.login();
		while(true) {
			
			System.out.println("1.User Management");
			System.out.println("2.Product Management");
			System.out.println("3.Exit");
			
			int choice = sc.nextInt();
			if(choice == 1){
				UserMan.userMan();
			}
			else if(choice == 2) {
				ProductMan.prodMan();
			}
			else if(choice == 3) {
				System.out.println("\t\tExiting Program..\n");
				return;
			}
		}	
	}
}
