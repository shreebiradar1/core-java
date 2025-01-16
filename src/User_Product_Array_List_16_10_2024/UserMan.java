package User_Product_Array_List_16_10_2024;
import java.util.Scanner;
import java.util.ArrayList;
public class UserMan {
	public static void userManagement() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t-----Welcome to User Management-----\n");
		
		ArrayList<User>userList = new ArrayList();
		
		while(true) {
			
			System.out.println("What would you like to do today ?");
			System.out.println("1.Add User");
			System.out.println("2.Update User");
			System.out.println("3.Search User");
			System.out.println("4.Delete User");
			System.out.println("5.Display User");
			System.out.println("6.Quit");
			
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
					
					userList.add(user);
					
			} else if(choice == 2) {
				System.out.println("To be implemented...");
				
			} else if(choice == 3) {
				System.out.println("To be implemented...");
				
			} else if(choice == 4) {
				System.out.println("To be implemented...");
				
			} else if(choice == 5){
				
				for(User data : userList) {
					System.out.println("User name : "+data.UserName);
					System.out.println("User mail : "+data.email);
					System.out.println("User pass : "+data.password);
				}
			} else if(choice == 6) {
				System.out.println("Exiting UserManagement.....");
				return;
				
			} else {
				System.out.println("invalid.....");
			}
		}
	}
}
