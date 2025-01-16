package EcommerceArrayListfile_tried;

import java.util.Scanner;

public class Login {
	public static void login() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String Name = sc.next();
		
		System.out.println("Enter Email : ");
		String mail = sc.next();
		
		System.out.println("Enter Password : ");
		String pass = sc.next();
		
		while(true){
			if(Name.equals("Shree")) {
				if(pass.equals("Pass123")) {
					System.out.println("\tLogin Successfull..\n");
					return;
				}
			}else {
				System.out.println("Login failed.....");
				System.exit(0);
			}
		}
	}
}
