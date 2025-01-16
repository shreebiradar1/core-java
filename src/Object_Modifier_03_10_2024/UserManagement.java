package Object_Modifier_03_10_2024;
import java.util.Scanner;
public class UserManagement {
	public static void userManagement() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t-----Welcome to User Management-----\n");
		
		while(true) {
			
			System.out.println("What would you like to do today ?");
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Search User");
			System.out.println("4.Delete User");
			System.out.println("9.Quit");
			
			int choice = scan.nextInt();
			
			if(choice == 1) {
				User user = new User();
				System.out.println("\tAdd User \n");
				
					System.out.println("Enter Username : ");
					user.UserName = scan.next();
					
					System.out.println("Enter Email : ");
					user.email = scan.next();
					
					System.out.println("Enter password : ");
					user.password = scan.next();
					
					System.out.println("Username : "+user.UserName);
					System.out.println("User Email : "+user.email);
					System.out.println("User Password : "+user.password);
					
			} else if(choice == 2) {
				System.out.println("To be implemented...");
				
			} else if(choice == 3) {
				System.out.println("To be implemented...");
				
			} else if(choice == 4) {
				System.out.println("To be implemented...");
				
			} else if(choice == 9) {
				System.out.println("Exiting UserManagement.....");
				return;
				
			} else {
				System.out.println("invalid.....");
			}
		}
	}
}
