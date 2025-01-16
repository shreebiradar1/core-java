package UserProduct_ArrayList_Add_Remove_Search_Print_17_10_2024;

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
				
				ProdMan.prodMan();
				
			} else if(option == 2) {
				
				UserMan.userMan();
				
			} else {
				return;
			}
		}
	}
}
