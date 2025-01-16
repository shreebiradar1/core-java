package E_Commerce_Game_Loop_30_09_2024;
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
				
				System.out.println("\tAdd User \n");
				
					System.out.println("Enter Username : ");
					String userName = scan.next();
					
					System.out.println("Enter Email : ");
					String mail = scan.next();
					
					System.out.println("Enter password : ");
					String password = scan.next();
					
					System.out.println("Username : "+userName);
					System.out.println("User Email : "+mail);
					System.out.println("User Password : "+password);
					
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
