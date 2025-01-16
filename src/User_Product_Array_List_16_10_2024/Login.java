package User_Product_Array_List_16_10_2024;
import java.util.Scanner;
public class Login {
	public static void login() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\t\t     Login     \n");
		
		System.out.println("\tEnter Username : ");
		String userName = scan.next();
		
		System.out.println("Enter Password : ");
		String password = scan.next();
		
		if(userName.equals("Shree")) {
			
			if(password.equals("Pass123")) {
				
				System.out.println("Login Successfull");
				return;
				
			}
		}
		System.out.println("Login fail.....");
		
		System.exit(0);
	}
}
