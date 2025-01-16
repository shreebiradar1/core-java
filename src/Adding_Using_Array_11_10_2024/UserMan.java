package Adding_Using_Array_11_10_2024;
import java.util.Scanner;
public class UserMan {
	public static void userManagement() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t-----Welcome to User Management-----\n");
		
		User userArray[] = new User[5];
		int userCount = 0;
		
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
					
					userArray[userCount]= user;
					userCount++;
					
			} else if(choice == 2) {
				System.out.println("To be implemented...");
				
			} else if(choice == 3) {
				System.out.println("To be implemented...");
				
			} else if(choice == 4) {
				System.out.println("To be implemented...");
				
			} else if(choice == 5){
				
				for(int i = 0;i<userCount;i++) {
					System.out.println(userArray[i].UserName);
					System.out.println(userArray[i].email);
					System.out.println(userArray[i].password);
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
