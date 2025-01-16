package E_Commerce_27_09_2024;
import java.util.Scanner;
public class login {
	public static void main(String[] args) {
		System.out.println("\t\tWelcome to E-commerce\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username : ");
		String name = sc.next();
		
		System.out.println("Enter password : ");
		String pass = sc.next();
		
		if(name.equals("Shree")) {
			if(pass.equals("Pass")) {
				System.out.println("\nLogin successfull....");
				return;
			}
		}
		System.out.println("Login fail...........");

	}
}
